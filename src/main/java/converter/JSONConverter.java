/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import com.google.gson.Gson;
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
public class JSONConverter implements IJSONConverter {
    
        private Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();

    @Override
    public Phone JSONToPhone(String json) {
        return gson.fromJson(json, Phone.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String PhoneCollectionToJSON(Collection<Phone> phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address JSONToAddress(String json) {
        return gson.fromJson(json, Address.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String AddressCollectionToJSON(Collection<Address> address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person JSONToPerson(String json) {
        return gson.fromJson(json, Person.class);
    }

    @Override
    public String PersonToJSON(Person p) {
        return gson.toJson(p);
    }

    @Override
    public Company JSONToCompany(String json) {
        return gson.fromJson(json, Company.class);
    }

    @Override
    public String CompanyToJSON(Company c) {
        return gson.toJson(c);
    }

    @Override
    public Hobby JSONToHobby(String json) {
        return gson.fromJson(json, Hobby.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String HobbyListToJSON(Collection<Hobby> hobby) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
