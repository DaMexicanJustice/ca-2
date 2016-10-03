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
import java.util.List;

/**
 *
 * @author Lasse
 */
public interface IBigBadInterface {
    public Address getAddressById(int id);
<<<<<<< HEAD
    public Address persistAddress(Address a);
    public Company getCompanyByCvr(String cvr);
    public Company persistCompany(Company c);
    public List getCompanies();
    public List getHobbies(int id);
    public Hobby persistHobby(Hobby h);
=======
    public Address addAddress(Infoentity ie);
    public Company getCompanyByCvr(String cvr);
    public Company addCompany(Infoentity ie);
    public List getCompanies();
    List getHobbies(int id);
    Hobby addHobby(Infoentity ie);
>>>>>>> cc0240710a720f7697a22d551fafa7f5e0d7b125
    public int getInfoEntityById(int id);
    public Person getPersonById(int id);
    public List getPeople();
    public List getPeopleIn(int zipcode);
<<<<<<< HEAD
    public List getPhonesById(int id);
    public Person persistPerson(Person p);
    public Phone persistPhone(Phone p);
=======
    public Person addPerson(Infoentity ie);
    public List getPhonesById(int id);
    public Phone addPhone(Infoentity ie);
>>>>>>> cc0240710a720f7697a22d551fafa7f5e0d7b125
}
