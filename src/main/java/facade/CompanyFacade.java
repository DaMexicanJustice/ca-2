/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import entity.InfoEntity;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author xboxm
 */
public class CompanyFacade implements ICompanyFacade {
    
    private EntityManagerFactory emf;

    public CompanyFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    @Override
    public Company getCompanyByCvr(String cvr) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Company> result = em.createNamedQuery("Company.findByCvr", Company.class);
        Company companyFound = result.setParameter("cvr", cvr).getSingleResult();
        return companyFound;
    }

    @Override
    public Company addCompany(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getCompanies() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Company> result = em.createNamedQuery("Company.findAll", Company.class);
        List <Company> companies = result.getResultList();
        return companies;
    }
    
}
