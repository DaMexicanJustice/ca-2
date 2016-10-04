/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
import entity.Cityinfo;
import entity.Company;
import entity.Hobby;
import entity.Infoentity;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lasse
 */
public class Facade implements IFacade {

    private final EntityManagerFactory emf;

    public Facade(EntityManagerFactory tmp) {
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
    public Company persistCompany(Company c) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        //em.flush();
        em.close();

        return c;
    }

    @Override
    public List getCompanies() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Company> result = em.createNamedQuery("Company.findAll", Company.class);
        List<Company> companies = result.getResultList();
        em.close();
        return companies;
    }

    @Override
    public List getHobbies() {
        /*EntityManager em = emf.createEntityManager();
        TypedQuery<Hobby> result = em.createNamedQuery("Hobby.findByHobbyid", Hobby.class);
        Hobby hobby = result.setParameter("hobbyid", id).getSingleResult();
        ArrayList<Hobby> hobbies =  new ArrayList(hobby.getFkId().getHobbyCollection());*/
        EntityManager em = emf.createEntityManager();
        TypedQuery<Hobby> result = em.createNamedQuery("Hobby.findAll", Hobby.class);
        List<Hobby> hobbies = result.getResultList();
        em.close();
        return hobbies;
    }

    @Override
    public Hobby persistHobby(Hobby h) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        //em.flush();
        em.close();

        return h;
    }

    @Override
    public int getInfoEntityById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Infoentity> result = em.createNamedQuery("Infoentity.findById", Infoentity.class);
        int tmp = result.setParameter("id", id).getSingleResult().getId();
        em.close();
        return tmp;
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
        List<Person> people = result.getResultList();
        return people;
    }

    @Override
    public ArrayList getPeopleIn(int zipcode) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Cityinfo> res = em.createNamedQuery("Cityinfo.findByZipcode", Cityinfo.class);
        Cityinfo tmp = res.getSingleResult();
        
        ArrayList<Address> potentialAnswers = new ArrayList(tmp.getAddressCollection());
        
        
        em.flush();
        em.close();
        
        ArrayList<Infoentity> finalList = new ArrayList<>();
        
        for(int i = 0; i != potentialAnswers.size(); i++) {
            if(potentialAnswers.get(i).getFkId().getTypeof().equals("person")) {
                finalList.add(potentialAnswers.get(i).getFkId());
            }
        }
        
        return finalList;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person persistPerson(Person p) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();

        return p;
    }

    @Override
    public List getPhonesById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Phone> result = em.createNamedQuery("Phone.findByPnum", Phone.class);
        List<Phone> tmp = result.setParameter("addressid", id).getResultList();
        em.close();
        return tmp;
    }

    @Override
    public Phone persistPhone(Phone p) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();

        return p;
    }
    
    @Override
    public Address persistAddress(Address a) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();

        return a;
    }
    
    @Override
    public Person editPerson(Person p) {
        return null;
    }
    
    @Override
    public Company editCompany(Company c) {
        return null;
    }
    
    @Override
    public Person deletePerson(Person p) {
        return null;
    }
    
    @Override
    public Company deleteCompany(Company c) {
        return null;
    }
}
