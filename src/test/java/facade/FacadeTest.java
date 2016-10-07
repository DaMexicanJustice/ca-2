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
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lasse
 */
public class FacadeTest {
    //  HOW TO RUN THE TESTS
    // -1   Project must be running
    //  0   Remove comment tags
    //  1   Set persistence for TEST til DROPANDCREATE
    //  2   Kør facadetest
    //  3   Set persistence for TEST til CREATE
    //  4   Kør resttest
    
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    
    public FacadeTest() {
    }

    @Test
    public void testGetAddressById() {
        System.out.println("getAddressById");
        
        Facade instance = new Facade(emf);
        Address result = instance.getAddressById(1);
        assertTrue(result != null && result.getAddressid() == 1);
        System.out.println("result is " + result.getStreet());
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testGetCompanyByCvr() {
        System.out.println("getCompanyByCvr");
        
        String cvr = "76787678";
        Facade instance = new Facade(emf);
        Company result = instance.getCompanyByCvr(cvr);
        assertEquals(result.getCname(), "companyA");
    }
    
    // OK
    /*
    @Test
    public void testPersistCompany() {
        System.out.println("persistCompany");
        
        Company c = new Company();
        
        
        Facade instance = new Facade(emf);

        c.setCname("Genereret firma");
        c.setCvr("12345678");
        c.setDescription("A generated company");
        c.setNoOfEmployees(5);
        c.setMarketValue(100);
        
        Company expResult = c;
        
        Address a = new Address();
        a.setStreet("Nystræde");
        a.setAdditionalinfo("Yderligere info");
        a.setFkZipcode(instance.getCityinfoById("2770"));
        
        String email = "detnyefirma@firmaer.dk";
        
        Company result = instance.persistCompanyWithAddressAndEmail(c, a, email);
        assertEquals(expResult, result);
        
        // fail("The test case is a prototype.");
    }
    */

    
    @Test
    public void testGetCompanies() {
        System.out.println("getCompanies");
                
        
        Facade instance = new Facade(emf);
        
        List<Company> result = instance.getCompanies();
        assertTrue(result.get(0).getCid() != null);
        System.out.println("There are " + result.size() + " companies");
    }
    

    
    @Test
    public void testGetHobbies() {
        System.out.println("getHobbies");
        
        Facade instance = new Facade(emf);
        
        List<Hobby> result = instance.getHobbies();
        
        System.out.println("There are  " + result.size() + " hobbits");
        assertTrue(result.get(0).getHobbyName().equals("Gaming"));
    }
    
    
    // Ser ud til at virke ok
    /*
    @Test
    public void testPersistHobby() {
        System.out.println("persistHobby");
        
        Hobby h = new Hobby();

        Facade instance = new Facade(emf);
        
        h.setDescription("Jeg elsker unit tests");
        h.setHobbyName("JAVA Hobbyen");
        h.setFkPid(null);
        h.setHobbyid(null);
        
        Hobby result = instance.persistHobby(h);
        assertEquals(h, result);
    }
    */

    
    @Test
    public void testGetInfoEntityById() {
        System.out.println("getInfoEntityById");
        
        Facade instance = new Facade(emf);
        Infoentity result = instance.getInfoEntityById(1);
        assertTrue(result.getEmail().equals("riki@tester.dk"));
    }
    
    
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        
        Facade instance = new Facade(emf);
        Person result = instance.getPersonById(1);
        
        assertTrue(result.getFirstName().equals("Riki"));
        
        //System.out.println("testGetPersonById says " + result.getFirstName() + " " + result.getLastName());
        //assertTrue(result != null && result.getId() == 7);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPeople() {
        System.out.println("getPeople");
        
        Facade instance = new Facade(emf);
        
        List<Person> result = instance.getPeople();
        System.out.println("There are " + result.size() + " people");
        assertTrue(result.size() != 0);
        //fail("The test case is a prototype.");
    }
    
    // ikke testet
    
    @Test
    public void testGetPeopleIn() {
        System.out.println("getPeopleIn");
        
        Facade instance = new Facade(emf);
        
        List<Person> result = instance.getPeopleIn(instance.getCityinfoById("1000"));
        System.out.println("testGetPeopleIn result size is " + result.size());
        System.out.println(result);
        

        assertTrue(result.size() > 0);
    }

    
    // Virker men ligesom company - skal bruge infoentity
    /*
    @Test
    public void testPersistPerson() {
        System.out.println("testPersistPerson");
        
        Facade instance2 = new Facade(emf);
        Person p = new Person();
        p.setFirstName("Anders");
        p.setLastName("Fogh");
        p.setPid(0);
        Person result = instance2.persistPerson(p);
        
        assertEquals(result, p);
        assertTrue(result.getFirstName().equals("Anders"));
    }

    */
    
    @Test
    public void testGetPhonesById() {
        System.out.println("getPhonesById");

        Facade instance = new Facade(emf);        
        List<Phone> result = instance.getPhonesById(9);
        
        assertTrue(result.get(0).getPnum().equals("12345686"));
        //System.out.println("Size is " + result.size() + " and first number is " + result.get(0).getPnum());
        
        //fail("The test case is a prototype.");
    }

    
    // Virker men skal bruge infoentity
    /*
    @Test
    public void testPersistPhone() {
        
        System.out.println("persistPhone");
        
        Facade instance2 = new Facade(emf);
        Phone p = new Phone();
        p.setPnum("22446688");
        p.setDescription("Meget interessant telefon");
        p.setFkId(null);
        Phone result = instance2.persistPhone(p);
        
        assertEquals(result, p);
    }
    */

    
    // OK
    /*
    @Test
    public void testPersistAddress() {
        Facade instance2 = new Facade(emf);
        Address a = new Address();
        a.setStreet("Torskestræde");
        a.setFkZipcode(instance2.getCityinfoById("2770"));
        a.setAdditionalinfo("Dette er torskestræde");
        Address result = instance2.persistAddress(a);
        
        assertEquals(result, a);
    }
    */

    // OK -- Ændrer ikke telefoncolection osv
    /*
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        
        Facade instance2 = new Facade(emf);
        Person up = new Person();
        up.setFirstName("Successfully edited");
        
        instance2.editPerson(instance2.getPersonById(51), up);
        
        assertTrue(instance2.getPersonById(51).getFirstName().equals("Successfully edited"));
    }
    */

    // OK ændrer kun navn
    /*
    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
        
        Facade instance2 = new Facade(emf);
        
        Company uc = new Company();
        uc.setCname("Edited company");
        
        instance2.editCompany(instance2.getCompanyByCvr("76989128"), uc); // 76989128 er cid 62
        
        assertTrue(instance2.getCompanyByCvr("76989128").getCname().equals("Edited company"));
        
        //fail("The test case is a prototype.");
    }
*/
    
    // OK
    
    /*
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        
        Facade instance2 = new Facade(emf);
        
        int beforeAmount = instance2.getPeople().size();
        
        Person deleteMe = instance2.getPersonById(50); // id 50 er Lotte
        instance2.deletePerson(deleteMe);
                
        int afterAmount = instance2.getPeople().size();
        
        assertTrue(beforeAmount > afterAmount);

    }
    
    */
    
    // OK
    /*
    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        
        
        Facade instance2 = new Facade(emf);
        
        int beforeAmount = instance2.getCompanies().size();
        
        Company deleteMe = instance2.getCompanyByCvr("00987678"); // Dette er ID 60
        instance2.deleteCompany(deleteMe);
        
        int afterAmount = instance2.getCompanies().size();
        
        //instance.deleteCompany(c);
        assertTrue(beforeAmount > afterAmount);
    }
    */
    
    // OK
    /*
    @Test
    public void testPersistCityinfo() {
        System.out.println("persistCityinfo");
        
        Cityinfo c = new Cityinfo();
        
        
        Facade instance = new Facade(emf);
        
        c.setCity("Berlin");
        c.setZip("4444");
        
        Cityinfo result = instance.persistCityinfo(c);
        assertTrue(result != null);
        
        // fail("The test case is a prototype.");
    }
    */
    
    // OK
    
    /*
    @Test
    public void testDeleteCityinfo() {
        Facade instance = new Facade(emf);
        
        
        Cityinfo c = instance.getCityinfoById("0897");
        assertTrue(instance.deleteCityinfo(c) != null);
    }
*/
  
    // OK
    /*
    @Test
    public void testPersistInfoentity() {
        Facade instance = new Facade(emf);
        
        Infoentity ie = new Infoentity();
        ie.setEmail("testinfoentity@test.dk");
        ie.setTypeof("person");
        ie.setFkAddressid(null);
        ie.setPhoneCollection(null);
        
        Infoentity persistInfoentity = instance.persistInfoentity(ie);
        
        System.out.println("Added " + persistInfoentity.getEmail());
        
        assertTrue(persistInfoentity.getEmail().equals("testinfoentity@test.dk"));
    }
*/
}