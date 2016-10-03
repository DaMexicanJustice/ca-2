/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.InfoEntity;
import entity.Person;
import java.awt.List;

/**
 *
 * @author xboxm
 */
public interface IPersonFacade {
    public Person getPersonById(int id);
    public List getPeople();
    public List getPeopleIn(int zipcode);
    public Person addPerson(InfoEntity ie);
}
