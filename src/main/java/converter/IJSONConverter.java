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
    public Phone JSONToPhone(String json);
    public String PhoneCollectionToJSON(Collection<Phone> phone);
    public Address JSONToAddress(String json);
    public String AddressCollectionToJSON(Collection<Address> address);
    public Person JSONToPerson(String json);
    public String PersonToJSON(Person p);
    public String PersonContactInfoToJSON(Person p);
    public String PersonCollectionToJSON(Collection<Person> people);
    public Company JSONToCompany(String json);
    public String CompanyToJSON(Company c);
    public String CompanyContactInfoToJSON(Company c);
    public Hobby JSONToHobby(String json);
    public String HobbyListToJSON(Collection<Hobby> hobby);
}
