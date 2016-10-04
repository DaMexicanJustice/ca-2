/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.IJSONConverter;
import converter.JSONConverter;
import entity.Person;
import exception.error.PersonNotFoundException;
import exception.error.ValidationErrorException;
import facade.Facade;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import facade.IFacade;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author xboxm
 */
@Path("person")
public class PersonResource {

    @Context
    private UriInfo context;

    private IFacade facade;
    private IJSONConverter jsonC;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
        facade = new Facade(Persistence.createEntityManagerFactory("deploy"));
        jsonC = new JSONConverter();
    }

    @GET
    public String getText() {
        return "Hello World";
    }

    @GET
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonById(@PathParam("id") int id) throws PersonNotFoundException {
        try {
            Person person = facade.getPersonById(id);
            return jsonC.PersonToJSON(person);
        } catch (NoResultException ex) {
            throw new PersonNotFoundException("No person with provided id found");
        }
    }

    @GET
    @Path("contactinfo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonContactInfoById(@PathParam("id") int id) throws PersonNotFoundException {
        try {
            Person person = facade.getPersonById(id);

            return jsonC.PersonToJSON(person);
        } catch (NoResultException ex) {
            throw new PersonNotFoundException("No person with provided id found");
        }
    }

    @GET
    @Path("all/complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPeople() {
        List<Person> people = facade.getPeople();
        return jsonC.PersonCollectionToJSON(people);
    }

    @GET
    @Path("all/contactinfo")
    @Produces(MediaType.APPLICATION_JSON)
    public String getContactInfoForPeople() {
        return "Unsupported";
    }
    
    @GET
    @Path("all/complete/zipcode/{zip}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllPeopleIn(@PathParam("zip") int zip) {
        return jsonC.PersonCollectionToJSON(facade.getPeopleIn(zip));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addPerson(String jsonPerson) throws ValidationErrorException {
        Person person = jsonC.JSONToPerson(jsonPerson);

        if (person.getFirstName().isEmpty() || person.getLastName().isEmpty()) {
            throw new ValidationErrorException("Missing first name or last name");
        }

        Person p = facade.persistPerson(person);
        return jsonC.PersonToJSON(p);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String editPerson(String jsonPerson) throws PersonNotFoundException, ValidationErrorException {

        try {
            Person person = jsonC.JSONToPerson(jsonPerson);
            if (person.getFirstName().isEmpty() || person.getLastName().isEmpty()) {
                throw new ValidationErrorException("First name or last name is missing");
            }
            Person p = facade.editPerson(jsonC.JSONToPerson(jsonPerson));
            return jsonC.PersonToJSON(p);
        } catch (NoResultException ex) {
            throw new PersonNotFoundException("No person with provided id found");
        }

    }

}
