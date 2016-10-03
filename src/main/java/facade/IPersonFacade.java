/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author xboxm
 */
public interface IPersonFacade {
    Person getPersonById(int id);
    List<Person> getPeople();
    List<Person> getPeopleIn(int zipcode);
    Person addPerson(InfoEntity ie);
}
