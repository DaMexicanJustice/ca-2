///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package facade;
//
//import entity.Address;
//import entity.Company;
//import entity.Hobby;
//import entity.Infoentity;
//import entity.Person;
//import entity.Phone;
//import java.util.List;
//import javax.persistence.Persistence;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author xboxm
// */
//public class BigBadFacadeTest {
//    
//    private IFacade facade = new Facade(Persistence.createEntityManagerFactory("test"));
//
//    
//    public BigBadFacadeTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//    
//    
//
//    /**
//     * Test of getAddressById method, of class BigBadFacade.
//     * Change to use persistence unit: apache derby database later on
//     */
//    @Test
//    public void testGetAddressById() {
//        System.out.println("getAddressById");
//        int id = 1;
//        Address address = facade.getAddressById(id);
//        assertTrue(address != null);
//    }
//
//    /**
//     * Test of getCompanyByCvr method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetCompanyByCvr() {
//        System.out.println("getCompanyByCvr");
//        String cvr = "00987678";
//        Company company = facade.getCompanyByCvr(cvr);
//        assertTrue(company != null);
//    }
//
//    /**
//     * Test of persistCompany method, of class BigBadFacade.
//     */
//    @Test
//    public void testPersistCompany() {
//        int beforePersistSize = facade.getCompanies().size();
//        facade.persistCompany(new Company());
//        int afterPersistSize = facade.getCompanies().size();
//        assertEquals(beforePersistSize+1, afterPersistSize);
//    }
//
//    /**
//     * Test of getCompanies method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetCompanies() {
//        List<Company> companies = null;
//        companies = facade.getCompanies();
//        assertTrue(companies != null);
//    }
//
//    /**
//     * Test of getHobbies method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetHobbies() {
//        List<Hobby> hobbies = null;
//        hobbies = facade.getHobbies(1);
//        assertTrue(hobbies != null);
//    }
//
//    /**
//     * Test of persistHobby method, of class BigBadFacade.
//     */
//    @Test
//    public void testPersistHobby() {
//        int beforeSize = facade.getHobbies(1).size();
//        facade.persistHobby(new Hobby());
//        int afterSize = facade.getHobbies(1).size();
//        assertEquals(beforeSize+1, afterSize);
//    }
//
//    /**
//     * Test of getInfoEntityById method, of class BigBadFacade.
//     * Might not be necessary to have this method?
//     
//    @Test
//    public void testGetInfoEntityById() {
//        System.out.println("getInfoEntityById");
//        int id = 0;
//        BigBadFacade instance = null;
//        int expResult = 0;
//        int result = instance.getInfoEntityById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    } /*
//
//    /**
//     * Test of getPersonById method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetPersonById() {
//        Person p = null;
//        p = facade.getPersonById(1);
//        assertTrue(p != null);
//    }
//
//    /**
//     * Test of getPeople method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetPeople() {
//        List<Person> people = facade.getPeople();
//        assertTrue(people != null);
//    }
//
//    /**
//     * Test of getPeopleIn method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetPeopleIn() {
//        List<Person> people = facade.getPeopleIn(2750);
//        assertTrue(people != null);
//    }
//
//    /**
//     * Test of persistPerson method, of class BigBadFacade.
//     */
//    @Test
//    public void testPersistPerson() {
//        int sizeBeforeTest = facade.getPeople().size();
//        facade.persistPerson(new Person());
//        int sizeAfterTest = facade.getPeople().size();
//    }
//
//    /**
//     * Test of getPhonesById method, of class BigBadFacade.
//     */
//    @Test
//    public void testGetPhonesById() {
//        List<Phone> phones = facade.getPhonesById(1);
//        assertTrue(phones != null);
//    }
//
//    /**
//     * Test of persistPhone method, of class BigBadFacade.
//     * Test disabled. Rewrite facade method
//     */
//    @Test
//    public void testPersistPhone() {
//        int sizeBeforeTest = facade.getPhonesById(1).size();
//        facade.persistPhone(new Phone(), facade.getPersonById(1));
//        int sizeAfterTest = facade.getPhonesById(1).size();
//        assertEquals(sizeBeforeTest+1, sizeAfterTest);
//    } 
//
//    /**
//     * Test of persistAddress method, of class BigBadFacade.
//     * Test disabled. Rewrite facade method
//     */
//    @Test
//    public void testPersistAddress() {
//        int sizeBeforeTest = facade.getPersonById(1).getAddressCollection().size();
//        facade.persistAddress(new Address(), facade.getPersonById(1));
//        int sizeAfterTest = facade.getPersonById(1).getAddressCollection().size();
//        assertEquals(sizeBeforeTest+1, sizeAfterTest);
//    } 
//    
//    
//}
