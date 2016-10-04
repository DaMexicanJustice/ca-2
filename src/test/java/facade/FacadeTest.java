/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Lasse
 */
public class FacadeTest {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    
    public FacadeTest() {
    }
/*
    @Test
    public void testGetAddressById() {
        System.out.println("getAddressById");
        int id = 0;
        Facade instance = null;
        Address expResult = null;
        Address result = instance.getAddressById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCompanyByCvr() {
        System.out.println("getCompanyByCvr");
        String cvr = "";
        Facade instance = null;
        Company expResult = null;
        Company result = instance.getCompanyByCvr(cvr);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
*/
//    @Test
//    public void testPersistCompany() {
//        System.out.println("persistCompany");
//        
//        Company c = new Company();
//        Facade instance = new Facade(emf);
//        
//        c.setCname("The company");
//        c.setCvr("123456");
//        
//        Company expResult = c;
//        Company result = instance.persistCompany(c);
//        
//        assertEquals(expResult, result);
//        
//        // fail("The test case is a prototype.");
//    }
/*
    @Test
    public void testGetCompanies() {
        System.out.println("getCompanies");
        Facade instance = null;
        List expResult = null;
        List result = instance.getCompanies();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

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

    @Test
    public void testPersistPerson() {
        System.out.println("persistPerson");
        Person p = null;
        Facade instance = null;
        Person expResult = null;
        Person result = instance.persistPerson(p);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

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

    @Test
    public void testPersistPhone() {
        System.out.println("persistPhone");
        Phone p = null;
        Infoentity ie = null;
        Facade instance = null;
        Phone expResult = null;
        Phone result = instance.persistPhone(p, ie);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPersistAddress() {
        System.out.println("persistAddress");
        Address a = null;
        Infoentity ie = null;
        Facade instance = null;
        Address expResult = null;
        Address result = instance.persistAddress(a, ie);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

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
