/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
import entity.InfoEntity;
import entity.Phone;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author xboxm
 */
public class PhoneFacade implements IPhoneFacade {
    
    private final EntityManagerFactory emf;

    public PhoneFacade(EntityManagerFactory tmp) {
        emf = tmp;
    }

    @Override
    public List getPhonesById(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Phone> result = em.createNamedQuery("Phone.findByPnum", Phone.class);
        List<Phone> tmp = result.setParameter("addressid", id).getResultList();
        em.close();
        return tmp;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Phone addPhone(InfoEntity ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
