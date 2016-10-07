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
    
    // Mapper skal ændres ti at lave en infoentity som denne afhænger af
    
    /*
    @Test
    public void testPersistCompany() {
        System.out.println("persistCompany");
        
        Company c = new Company();
        
        
        Facade instance = new Facade(emf);

        c.setCid(0);
        c.setCname("Genereret firma");
        c.setCvr("12345678");
        
        Company expResult = c;
        
        Company result = instance.persistCompany(c);
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
    /*
    @Test
    public void testGetPeopleIn() {
        System.out.println("getPeopleIn");
        
        Facade instance2 = new Facade(emf);
        Person tmpP = new Person();
        tmpP.setFirstName("Kurt");
        tmpP.setLastName("Koben");
        tmpP.setPid(313);
                
        Cityinfo tmpC = new Cityinfo();
        tmpC.setCity("Kastrup");
        tmpC.setZipcode(2770);
        
        Address tmpA = new Address();
        tmpA.setStreet("Hejsavej 112");
        tmpA.setFkId(tmpP);
        tmpA.setFkZipcode(tmpC);
        
        instance2.persistPerson(tmpP);
        instance2.persistCityinfo(tmpC);
        instance2.persistAddress(tmpA);
        
        List<Person> result = instance2.getPeopleIn(2770);
        System.out.println("testGetPeopleIn result size is " + result.size());
        System.out.println(result);
        
        assertTrue(result != null && result.size() > 0);
        
        //fail("The test case is a prototype.");
    }

    */
    
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

    /*
    @Test
    public void testPersistPhone() {
        
        System.out.println("persistPhone");
        
        Facade instance2 = new Facade(emf);
        Phone p = new Phone();
        p.setPnum("22446688");
        p.setDescription("Meget interessant telefon");
        Phone result = instance2.persistPhone(p);
        
        assertEquals(result, p);
    }

    @Test
    public void testPersistAddress() {
        Facade instance2 = new Facade(emf);
        Address a = new Address();
        a.setStreet("Fladestræde");
        Address result = instance2.persistAddress(a);
        
        assertEquals(result, a);
    }

    @Test
    public void testEditPerson() {
        System.out.println("###########################");
        System.out.println("editPerson");
        
        Facade instance2 = new Facade(emf);
        Person p2 = new Person();
        p2.setFirstName("Rediger");
        p2.setLastName("Mig");
        p2.setPid(4);
        instance2.persistPerson(p2);
        
        Person up = new Person();
        up.setFirstName("Successfully edited");
        
        instance2.editPerson(p2, up);
        
        assertTrue(p2.getFirstName().equals("Successfully edited"));
    }

    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
        
        Facade instance2 = new Facade(emf);
        Company c2 = new Company();
        c2.setCid(123);
        c2.setCname("Editme");
        c2.setCvr("01928374");
        instance2.persistCompany(c2);
        
        Company uc = new Company();
        uc.setCname("Edited name");
        
        instance2.editCompany(c2, uc);
        
        assertTrue(c2.getCname().equals("Edited name"));
        
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        
        Facade instance2 = new Facade(emf);
        
        int beforeAmount = instance2.getPeople().size();
        
        Person p2 = new Person();
        p2.setFirstName("Mogens");
        p2.setLastName("Glistrup");
        p2.setPid(11);
        instance2.persistPerson(p2);
        
        int afterAmount = instance2.getPeople().size();
        
        Person deleteMe = instance2.getPersonById(p2.getId());
        instance2.deletePerson(p2);
                
        int afterAmount2 = instance2.getPeople().size();
        
        //System.out.println("DELETEPERSON beforeAmount was " + beforeAmount + " and afterAmount was " + afterAmount + " and afterAmount2 was " + afterAmount2);
        
        assertTrue(beforeAmount == afterAmount2 && afterAmount > afterAmount2);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        
        
        Facade instance2 = new Facade(emf);
        
        int beforeAmount = instance2.getCompanies().size();
                
        Company c2 = new Company();
        c2.setCid(777);
        c2.setCname("Nytfirma");
        c2.setCvr("22123456");
        instance2.persistCompany(c2);
        
        int afterAmount = instance2.getCompanies().size();
        
        Company deleteMe = instance2.getCompanyByCvr("22123456");
        instance2.deleteCompany(deleteMe);
        
        int afterAmount2 = instance2.getCompanies().size();
        
        System.out.println("DELETECOMPANY beforeAmount was " + beforeAmount + " and afterAmount was " + afterAmount + " and afterAmount2 was " + afterAmount2);
        
        //instance.deleteCompany(c);
        assertTrue(beforeAmount == afterAmount2 && afterAmount > afterAmount2);
    }
    
    @Test
    public void testPersistCityinfo() {
        System.out.println("persistCityinfo");
        
        Cityinfo c = new Cityinfo();
        
        
        Facade instance = new Facade(emf);
        
        c.setCity("Berlin");
        c.setZipcode(4444);
        
        Cityinfo result = instance.persistCityinfo(c);
        assertTrue(result != null);
        
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testDeleteCityinfo() {
        Cityinfo c = new Cityinfo();
        
        Facade instance = new Facade(emf);
        
        c.setCity("Frankfurt");
        c.setZipcode(9876);
        
        instance.persistCityinfo(c);
        
        instance.deleteCityinfo(c);
    }
*/
}