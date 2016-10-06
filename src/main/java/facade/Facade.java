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
    public Infoentity getInfoEntityById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Infoentity> result = em.createNamedQuery("Infoentity.findById", Infoentity.class);
        Infoentity tmp = result.setParameter("id", id).getSingleResult();
        em.close();
        return tmp;
    }

    @Override
    public Person getPersonById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> result = em.createNamedQuery("Person.findByID", Person.class);
        Person tmp = result.setParameter("id", id).getSingleResult();
        em.close();
        return tmp;
    }

    @Override
    public List getPeople() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> result = em.createNamedQuery("Person.findAll", Person.class);
        List<Person> people = result.getResultList();
        return people;
    }

    @Override
    public List<Person> getPeopleIn(int zipcode) {
        List<Person> finalList = new ArrayList<>();
        
        EntityManager em = emf.createEntityManager();
        
        Facade instance = new Facade(emf);
        
        TypedQuery<Address> res = em.createNamedQuery("Address.findByfkZipcode", Address.class);
        List<Address> tmpList = res.setParameter("fkZipcode", instance.getCityinfoById(zipcode)).getResultList();

        System.out.println("AddressList length is " + tmpList.size());
        
        for(Address x : tmpList) {
            int fkid = x.getFkId().getId();
            //System.out.println(x.getStreet() + " has fkid " + x.getFkId().getId());
            //System.out.println("This person is " + instance.getPersonById(fkid).getFirstName());
            finalList.add(instance.getPersonById(fkid));
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

        Facade instance3 = new Facade(emf);

        TypedQuery<Phone> result = em.createNamedQuery("Phone.findById", Phone.class);
        List<Phone> tmp = result.setParameter("fkId", instance3.getInfoEntityById(id)).getResultList();
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
    public Person editPerson(Person p, Person u) {
        EntityManager em = emf.createEntityManager();

        Facade instance = new Facade(emf);
        System.out.println("There are " + instance.getPeople().size() + " people");
        
        em.getTransaction().begin();
        
        int res = 0;
        if (u.getFirstName() != null) {
            res += em.createQuery("UPDATE Person SET firstName=\"" + u.getFirstName()+ "\" WHERE id=" + p.getId()).executeUpdate();
            p.setFirstName(u.getFirstName());
        }
        
        if (u.getLastName() != null) {
            res += em.createQuery("UPDATE Person SET lastName=\"" + u.getLastName()+ "\" WHERE id=" + p.getId()).executeUpdate();
            p.setLastName(u.getLastName());
        }
        
        if (u.getEmail()!= null) {
            res += em.createQuery("UPDATE Person SET email=\"" + u.getEmail()+ "\" WHERE id=" + p.getId()).executeUpdate();
            p.setEmail(u.getEmail());
        }
        
        System.out.println("editPerson@Facade.java: Updated " + res + " things");
        em.getTransaction().commit();
        em.close();
        
        return p;
    }
    
    /**
     *
     * @param c The company to update
     * @param n The new information
     * @return The updated object
     */
    @Override
    public Company editCompany(Company c, Company n) {

        EntityManager em = emf.createEntityManager();

        Facade instance = new Facade(emf);
        System.out.println("There are " + instance.getCompanies().size() + " companies");

        //System.out.println("UPDATE Company SET cname=\"" + n.getCname() + "\" WHERE id=" + c.getId());
        em.getTransaction().begin();

        int res = 0;
        if (n.getCname() != null) {
            res += em.createQuery("UPDATE Company SET cname=\"" + n.getCname() + "\" WHERE id=" + c.getId()).executeUpdate();
            c.setCname(n.getCname());
        }

        System.out.println("editCompany@Facade.java: Updated " + res + " things");
        //c.setCname(n.getCname());
        em.getTransaction().commit();
        em.close();

        return c;
    }

    @Override
    public Person deletePerson(Person p) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        int res = em.createQuery("DELETE FROM Person WHERE id=" + p.getId()).executeUpdate();
        System.out.println("deletePerson@Facade.java: Updated " + res + " things");
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public Company deleteCompany(Company c) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        int res = em.createQuery("DELETE FROM Company WHERE id=" + c.getId()).executeUpdate();
        System.out.println("deleteCompany@Facade.java: Updated " + res + " things");
        em.getTransaction().commit();
        em.close();
        return c;
    }
    
    @Override
    public Cityinfo persistCityinfo(Cityinfo c) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();

        return c;
    }
    
    /*
    @Override
    public Cityinfo editCityinfo(Cityinfo c, Cityinfo n) {
        return null;
    }
    */
    @Override
    public Cityinfo deleteCityinfo(Cityinfo c) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        int res = em.createQuery("DELETE FROM Cityinfo WHERE zipcode=" + c.getZipcode()).executeUpdate();
        System.out.println("deleteCityinfo@Facade.java: Updated " + res + " things");
        em.getTransaction().commit();
        em.close();
        return c;
    }
    
    @Override
    public Cityinfo getCityinfoById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Cityinfo> result = em.createNamedQuery("Cityinfo.findByZipcode", Cityinfo.class);
        Cityinfo tmp = result.setParameter("zipcode", id).getSingleResult();
        em.close();
        return tmp;
    }
    
    @Override
    public Collection getAllZipCodes() {
       EntityManager em = emf.createEntityManager();
       TypedQuery<Cityinfo> result = em.createNamedQuery("Cityinfo.findAll", Cityinfo.class); 
       Collection<Cityinfo> zips = result.getResultList();
       return zips;
    }
    
    @Override
    public Collection getCompaniesWithPopulationGreaterThan(int minPop) {
       EntityManager em = emf.createEntityManager();
       TypedQuery<Company> result = em.createNamedQuery("Company.findByNoOfEmployees", Company.class); 
       result.setParameter("c.noOfEmployees", minPop);
       Collection<Company> companies = result.getResultList();
       return companies;
    }
    
    @Override
    public Collection getPeopleByHobby(String hobby) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Hobby> result = em.createNamedQuery("Hobby.findByHobbyName", Hobby.class);
        Collection<Hobby> hobbies = result.getResultList();
        Collection<Person> people = new ArrayList();
        for (Hobby h : hobbies) {
            people.add(h.getFkId());
        }
        return people;
    }
}
