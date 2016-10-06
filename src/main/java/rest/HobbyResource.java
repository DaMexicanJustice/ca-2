/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.IJSONConverter;
import converter.JSONConverter;
import entity.Person;
import exception.error.HobbiesNotFoundException;
import facade.Facade;
import facade.IFacade;
import java.util.Collection;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author xboxm
 */
@Path("hobby")
public class HobbyResource {
    
    private IFacade facade;
    private IJSONConverter jsonC;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HobbyResource
     */
    public HobbyResource() {
        facade = new Facade(Persistence.createEntityManagerFactory("deploy"));
        jsonC = new JSONConverter();
    }

    @GET
    public String getText() {
        return "Hello from Hobby Ressource";
    }
    
    @GET
    @Path("single/{hobby}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByHobby(@PathParam("hobby") String hobby) throws HobbiesNotFoundException {
        try {
        return jsonC.personToJSON(facade.getPersonByHobby(hobby));
        } catch(NoResultException ex) {
            throw new HobbiesNotFoundException("No person found with that hobby");
        }
    }
    
    @GET
    @Path("all/{hobby}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPeopleByHobby(@PathParam("hobby") String hobby) throws HobbiesNotFoundException {
        Collection<Person> people = facade.getPeopleByHobby(hobby);
        if (people.isEmpty()) throw new HobbiesNotFoundException("There are no people with that hobby");
        return jsonC.personCollectionToJSON(people);
    }
}
