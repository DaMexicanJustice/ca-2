/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
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
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceunit");
    
    public FacadeTest() {
    }

    @Test
    public void testGetAddressById() {
        System.out.println("getAddressById");
        
        Facade instance2 = new Facade(emf);
        Address a1 = new Address();
        a1.setStreet("Fiskestræde");
        instance2.persistAddress(a1);
        
        Facade instance = new Facade(emf);
        Address result = instance.getAddressById(1);
        assertTrue(result != null && result.getAddressid() == 1);
        System.out.println("result is " + result.getStreet());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetCompanyByCvr() {
        System.out.println("getCompanyByCvr");
        
        Facade instance2 = new Facade(emf);
        Company c2 = new Company();
        c2.setCid(145);
        c2.setCname("Mælkehuset");
        c2.setCvr("000000");
        instance2.persistCompany(c2);
        
        String cvr = "000000";
        Facade instance = new Facade(emf);
        Company result = instance.getCompanyByCvr(cvr);
        assertEquals(result.getCname(), "Mælkehuset");
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testPersistCompany() {
        System.out.println("persistCompany");
        
        Company c = new Company();
        
        
        Facade instance = new Facade(emf);
        
        c.setCid(1);
        c.setCname("The company");
        c.setCvr("123456");
        
        Company expResult = c;
        
        Company result = instance.persistCompany(c);
        assertEquals(expResult, result);
        
        // fail("The test case is a prototype.");
    }

    @Test
    public void testGetCompanies() {
        System.out.println("getCompanies");
        
        Facade instance2 = new Facade(emf);
        Company c2 = new Company();
        c2.setCid(145);
        c2.setCname("Fiskeforretningen");
        c2.setCvr("555666");
        instance2.persistCompany(c2);
        
        
        Facade instance = new Facade(emf);
        
        List<Company> result = instance.getCompanies();
        assertTrue(result.get(0).getCid() == 145);
    }
    
/*
    @Test
    public void testGetHobbies() {
        System.out.println("getHobbies");
        int id = 0;
        Facade instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getHobbies(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPersistHobby() {
        System.out.println("persistHobby");
        Hobby h = null;
        Facade instance = null;
        Hobby expResult = null;
        Hobby result = instance.persistHobby(h);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetInfoEntityById() {
        System.out.println("getInfoEntityById");
        int id = 0;
        Facade instance = null;
        int expResult = 0;
        int result = instance.getInfoEntityById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int id = 0;
        Facade instance = null;
        Person expResult = null;
        Person result = instance.getPersonById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPeople() {
        System.out.println("getPeople");
        Facade instance = null;
        List expResult = null;
        List result = instance.getPeople();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPeopleIn() {
        System.out.println("getPeopleIn");
        int zipcode = 0;
        Facade instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPeopleIn(zipcode);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void testPersistPerson() {
        Facade instance2 = new Facade(emf);
        Person p = new Person();
        p.setFirstName("Anders");
        p.setLastName("Fogh");
        Person result = instance2.persistPerson(p);
        
        assertEquals(result, p);
        assertTrue(result.getFirstName().equals("Anders"));
    }
/*
    @Test
    public void testGetPhonesById() {
        System.out.println("getPhonesById");
        int id = 0;
        Facade instance = null;
        List expResult = null;
        List result = instance.getPhonesById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
    */

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
    
/*
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        Person p = null;
        Facade instance = null;
        instance.editPerson(p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
        Company c = null;
        Facade instance = null;
        instance.editCompany(c);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        Person p = null;
        Facade instance = null;
        instance.deletePerson(p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        Company c = null;
        Facade instance = null;
        instance.deleteCompany(c);
        fail("The test case is a prototype.");
    }
    */
}