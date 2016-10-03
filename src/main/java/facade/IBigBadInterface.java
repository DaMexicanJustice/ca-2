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
    public Address addAddress(Infoentity ie);
    public Company getCompanyByCvr(String cvr);
    public Company addCompany(Infoentity ie);
    public List getCompanies();
    List getHobbies(int id);
    Hobby addHobby(Infoentity ie);
    public int getInfoEntityById(int id);
    public Person getPersonById(int id);
    public List getPeople();
    public List getPeopleIn(int zipcode);
    public Person addPerson(Infoentity ie);
    public List getPhonesById(int id);
    public Phone addPhone(Infoentity ie);
}
