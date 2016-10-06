/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.IJSONConverter;
import converter.JSONConverter;
import facade.Facade;
import facade.IFacade;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
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
    public String getAllZipCodes() {
        return jsonC.zipCollectionToJSON(facade.getAllZipCodes());
    }
}
