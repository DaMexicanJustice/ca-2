/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.IJSONConverter;
import converter.JSONConverter;
import entity.Cityinfo;
import exception.error.CityNotFoundException;
import facade.Facade;
import facade.IFacade;
import java.util.Collection;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author xboxm
 */
@Path("cityinfo")
public class CityinfoResource {

    private IFacade facade;
    private IJSONConverter jsonC;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CityinfoResource
     */
    public CityinfoResource() {
        facade = new Facade(Persistence.createEntityManagerFactory("deploy"));
        jsonC = new JSONConverter();
    }

    @GET
    public String getText() {
        return "Hello from Cityinfo Ressource";
    }

    @GET
    @Path("zipcodes")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllZipCodes() throws CityNotFoundException {
        Collection<Cityinfo> zipcodes = facade.getAllZipCodes();
        if (zipcodes.isEmpty()) throw new CityNotFoundException("No cities in database");
        return jsonC.zipCollectionToJSON(zipcodes);
    }
}
