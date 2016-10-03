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
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lasse
 */
public class BigBadFacade implements IBigBadInterface {
    private final EntityManagerFactory emf;

    public BigBadFacade(EntityManagerFactory tmp) {
        emf = tmp;
    }
    
    @Override
    public Address getAddressById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Address> result = em.createNamedQuery("Address.findByAddressid", Address.class);
        Address tmp = result.setParameter("addressid", id).getSingleResult();
        em.close();
        return tmp;
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
    public List getHobbies(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hobby addHobby(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getInfoEntityById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<InfoEntity> result = em.createNamedQuery("Infoentity.findById", InfoEntity.class);
        int tmp = result.setParameter("id", id).getSingleResult().getId();
        em.close();
        return tmp;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Person getPersonById(int id) throws NoResultException {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> result = em.createNamedQuery("Person.findByPersonid", Person.class);
        Person personFound = result.setParameter("personid", id).getSingleResult();
        return personFound;
    }

    @Override
    public List getPeople() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> result = em.createNamedQuery("Person.findAll", Person.class);
        List <Person> people = result.getResultList();
        return people;
    }

    @Override
    public List getPeopleIn(int zipcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person persistPerson(Person p) {

        EntityManager em = emf.createEntityManager();
        em.persist(p);
        em.flush();
        em.close();
        
        return p;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List getPhonesById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Phone> result = em.createNamedQuery("Phone.findByPnum", Phone.class);
        List<Phone> tmp = result.setParameter("addressid", id).getResultList();
        em.close();
        return tmp;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phone addPhone(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address addAddress(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}