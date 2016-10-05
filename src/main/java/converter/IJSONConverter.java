/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import entity.Address;
import entity.Company;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.Collection;

/**
 *
 * @author xboxm
 */
public interface IJSONConverter {
    public Phone jsonToPhone(String json);
    public String phoneCollectionToJSON(Collection<Phone> phone);
    public Address jsonToAddress(String json);
    public String addressCollectionToJSON(Collection<Address> address);
    public Person jsonToPerson(String json);
    public String personToJSON(Person p);
    public String personContactInfoToJSON(Person p);
    public String peopleContactInfoToJSON(Collection<Person> people);
    public String personCollectionToJSON(Collection<Person> people);
    public Company jsonToCompany(String json);
    public String companyToJSON(Company c);
    public String companyContactInfoToJSON(Company c);
    public String companiesContactInfoToJSON(Collection<Company> companies);
    public Hobby jsonToHobby(String json);
    public String hobbyListToJSON(Collection<Hobby> hobby);
}
