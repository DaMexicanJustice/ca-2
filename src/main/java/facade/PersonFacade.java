/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.InfoEntity;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author xboxm
 */
public class PersonFacade implements IPersonFacade {
    
    private EntityManagerFactory emf;

    public PersonFacade(EntityManagerFactory emf) {
        this.emf = emf;
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
    public Person addPerson(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
