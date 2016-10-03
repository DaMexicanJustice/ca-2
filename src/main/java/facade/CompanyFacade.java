/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
import entity.Company;
import entity.Hobby;
import entity.InfoEntity;
import entity.Person;
import entity.Phone;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author xboxm
 */
public class CompanyFacade implements IBigBadInterface {
    
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

    @Override
    public Address getAddressById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address addAddress(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getHobbies(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hobby addHobby(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getInfoEntityById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person getPersonById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getPeople() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getPeopleIn(int zipcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person addPerson(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getPhonesById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phone addPhone(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
