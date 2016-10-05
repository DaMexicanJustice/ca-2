/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import converter.IJSONConverter;
import converter.JSONConverter;
import entity.Company;
import exception.error.CompanyNotFoundException;
import facade.Facade;
import facade.IFacade;
import java.util.List;
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
@Path("company")
public class CompanyResource {

    @Context
    private UriInfo context;

    private IFacade facade;
    private IJSONConverter jsonC;

    /**
     * Creates a new instance of CompanyResource
     */
    public CompanyResource() {
        facade = new Facade(Persistence.createEntityManagerFactory("deploy"));
        jsonC = new JSONConverter();
    }

    @GET
    public String getText() {
        return "Hello World";
    }

    @GET
    @Path("comp/all/{cvr}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyByCvr(@PathParam("cvr") String cvr) throws CompanyNotFoundException {
        try {
            Company company = facade.getCompanyByCvr(cvr);
            return jsonC.CompanyToJSON(company);
        } catch (NoResultException ex) {
            throw new CompanyNotFoundException("No company with that cvr");
        }
    }
    
    @GET
    @Path("comp/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanies(){
            List<Company> allCompanies = facade.getCompanies();
            return jsonC.CompaniesContactInfoToJSON(allCompanies);
    }
}
