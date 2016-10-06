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

/**
 *
 * @author Lasse
 */
public interface IFacade {

    public Address getAddressById(int id);

    public Address persistAddress(Address a);

    public Company getCompanyByCvr(String cvr);

    public Company persistCompany(Company c);

    public List getCompanies();

    public List getHobbies();

    public Hobby persistHobby(Hobby h);
    
    public Infoentity getInfoEntityById(int id);

    public Person getPersonById(int id);

    public List getPeople();

    public List<Person> getPeopleIn(int zipcode);

    public List getPhonesById(int id);

    public Person persistPerson(Person p);

    public Phone persistPhone(Phone p);
    
    public Person editPerson(Person p, Person u);
    
    public Company editCompany(Company c, Company n);
    
    public Person deletePerson(Person p);
    
    public Company deleteCompany(Company c);
    
    public Cityinfo persistCityinfo(Cityinfo c);
    
    //public Cityinfo editCityinfo(Cityinfo c, Cityinfo n);
    
    public Cityinfo deleteCityinfo(Cityinfo c);
    
    public Cityinfo getCityinfoById(int id);
    
    public Collection getAllZipCodes();
    
    public Collection getCompaniesWithPopulationGreaterThan(int minPop);
    
    public Collection getPeopleByHobby(String hobby);
    
    public Person getPersonByHobby(String hobby);
}
