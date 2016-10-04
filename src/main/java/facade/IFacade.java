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

    public ArrayList getHobbies(int id);

    public Hobby persistHobby(Hobby h);
    
    public int getInfoEntityById(int id);

    public Person getPersonById(int id);

    public List getPeople();

    public ArrayList getPeopleIn(int zipcode);

    public List getPhonesById(int id);

    public Person persistPerson(Person p);

    public Phone persistPhone(Phone p);
    
    public void editPerson(Person p);
    
    public void editCompany(Company c);
    
    public void deletePerson(Person p);
    
    public void deleteCompany(Company c);
    
}
