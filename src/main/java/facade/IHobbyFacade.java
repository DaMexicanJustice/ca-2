/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Hobby;
import entity.InfoEntity;
import javax.validation.constraints.Past.List;

/**
 *
 * @author xboxm
 */
public interface IHobbyFacade {
    List getHobbies(int id);
    Hobby addHobby(InfoEntity ie);
}
