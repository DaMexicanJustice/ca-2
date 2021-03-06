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
import exception.error.ValidationErrorException;
import facade.Facade;
import facade.IFacade;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
        facade = new Facade(Persistence.createEntityManagerFactory("test"));
        jsonC = new JSONConverter();
    }

    @GET
    public String getText() {
        return "Hello From Company Ressource!";
    }
    
    @GET
    @Path("all/population/{minPop}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompaniesWithPopulationGreaterThan(@PathParam("minPop") int minPop) {
        return jsonC.companyCollectionToJSON(facade.getCompaniesWithPopulationGreaterThan(minPop));
    }

    @GET
    @Path("comp/all/{cvr}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyByCvr(@PathParam("cvr") String cvr) throws CompanyNotFoundException {
        System.out.println("trying to get company @ " + cvr);
        try {
            Company company = facade.getCompanyByCvr(cvr);
            return jsonC.companyToJSON(company);
        } catch (NoResultException ex) {
            throw new CompanyNotFoundException("No company with that cvr");
        }
    }

    @GET
    @Path("comp/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanies() throws CompanyNotFoundException {
        List<Company> allCompanies = facade.getCompanies();
        if(allCompanies.isEmpty()) throw new CompanyNotFoundException("No companies registered in database");
        return jsonC.companiesContactInfoToJSON(allCompanies);
    }
/*
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addCompany(String jsonCompany) throws ValidationErrorException {
        System.out.println("addcompany runs");
        Company company = jsonC.jsonToCompany(jsonCompany);
        if (company.getCname().isEmpty() || company.getCvr().isEmpty()) {
                throw new ValidationErrorException("Company name or CVR is missing.");
            }
        Company c = facade.persistCompany(company);
        return jsonC.companyToJSON(c);
    }
*/
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String editCompany(String jsonCompany) throws CompanyNotFoundException, ValidationErrorException {
        try {
            Company company = jsonC.jsonToCompany(jsonCompany);
            if (company.getCname().isEmpty() || company.getCvr().isEmpty()) {
                throw new ValidationErrorException("Company name or CVR is missing.");
            }
            Company c = facade.editCompany(facade.getCompanyByCvr(company.getCvr()), company);
            return jsonC.companyToJSON(c);

        } catch (NoResultException e) {
            throw new CompanyNotFoundException("The company was not found");
        }
    }
    
}
