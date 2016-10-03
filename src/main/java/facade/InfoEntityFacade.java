/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.InfoEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author xboxm
 */
public class InfoEntityFacade implements IInfoEntityFacade {
    
    private final EntityManagerFactory emf;

    public InfoEntityFacade(EntityManagerFactory tmp) {
        emf = tmp;
    }

    @Override
    public int getInfoEntityById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<InfoEntity> result = em.createNamedQuery("Infoentity.findById", InfoEntity.class);
        int tmp = result.setParameter("id", id).getSingleResult().getId();
        em.close();
        return tmp;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
