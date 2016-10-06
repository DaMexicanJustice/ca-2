/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import entity.Address;
import entity.Cityinfo;
import entity.Company;
import entity.Hobby;
import entity.Infoentity;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author xboxm
 */
public class JSONConverter implements IJSONConverter {
    
        private Gson gson = new com.google.gson.GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {

        @Override
        public boolean shouldSkipClass(Class<?> clazz) {
            return (clazz == Infoentity.class);
        }

        /**
          * Custom field exclusion goes here
          */
        @Override
        public boolean shouldSkipField(FieldAttributes f) {
            return false;
        }

     })
    /**
      * Use serializeNulls method if you want To serialize null values 
      * By default, Gson does not serialize null values
      */
    .serializeNulls().setPrettyPrinting().create();

    @Override
    public Phone jsonToPhone(String json) {
        return gson.fromJson(json, Phone.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String phoneCollectionToJSON(Collection<Phone> phone) {
        return gson.toJson(phone);
    }

    @Override
    public Address jsonToAddress(String json) {
        return gson.fromJson(json, Address.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String addressCollectionToJSON(Collection<Address> address) {
        return gson.toJson(address);
    }

    @Override
    public Person jsonToPerson(String json) {
        return gson.fromJson(json, Person.class);
    }

    @Override
    public String personToJSON(Person p) {
        return gson.toJson(p);
    }
    
    @Override
    public String personContactInfoToJSON(Person p) {
        JsonObject job = new JsonObject();
        job.addProperty("email", p.getEmail());
        job.addProperty("phones", gson.toJson(p.getPhoneCollection()));
        job.addProperty("address", gson.toJson(p.getAddressCollection()));
        return gson.toJson(job);
    }

    @Override
    public Company jsonToCompany(String json) {
        return gson.fromJson(json, Company.class);
    }

    @Override
    public String companyToJSON(Company c) {
        return gson.toJson(c);
    }
    
    @Override
    public String companyContactInfoToJSON(Company c) {
        JsonObject job = new JsonObject();
        job.addProperty("email", c.getEmail());
        job.addProperty("phones", gson.toJson(c.getPhoneCollection()));
        job.addProperty("addresses", gson.toJson(c.getAddressCollection()));
        return gson.toJson(job);
    }
    
    @Override
    public String companiesContactInfoToJSON(Collection<Company> companies) {
        Collection<JsonObject> jobs = new ArrayList();
        for (Company c : companies) {
            JsonObject job = new JsonObject();
            job.addProperty("email", c.getEmail());
            job.addProperty("phones", gson.toJson(c.getPhoneCollection()));
            job.addProperty("addresses", gson.toJson(c.getAddressCollection()));
            jobs.add(job);
        }
        return gson.toJson(jobs);
    }
    
    @Override
    public Hobby jsonToHobby(String json) {
        return gson.fromJson(json, Hobby.class);
    }
    
    // Implementation of list conversion needs work. Gson conversion on list can cause stackoverflows
    // from an infinite cycling between database entities with references to each other. Need to work on a
    // solution.
    @Override
    public String hobbyListToJSON(Collection<Hobby> hobbies) {
        return gson.toJson(hobbies);
    }
    
    @Override
    public String personCollectionToJSON(Collection<Person> people) {
        return gson.toJson(people);
    }
    
    @Override
    public String peopleContactInfoToJSON(Collection<Person> people) {
        Collection<JsonObject> jobs = new ArrayList();
        for (Person p : people) {
            JsonObject job = new JsonObject();
            job.addProperty("email", p.getEmail());
            job.addProperty("phones", gson.toJson(p.getPhoneCollection()));
            job.addProperty("addresses", gson.toJson(p.getAddressCollection()));
            jobs.add(job);
        }
        return gson.toJson(jobs);
    }
    
    @Override
    public String zipCollectionToJSON(Collection<Cityinfo> zips) {
        return gson.toJson(zips);
    }
    
    @Override
    public String companyCollectionToJSON(Collection<Company> companies) {
        return gson.toJson(companies);
    }
    
}
