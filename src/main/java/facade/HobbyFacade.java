/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Hobby;
import entity.InfoEntity;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author xboxm
 */
public class HobbyFacade implements IHobbyFacade {
    
    private EntityManagerFactory emf;

    public HobbyFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    @Override
    public List getHobbies(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hobby addHobby(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
