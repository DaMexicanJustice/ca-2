/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.InfoEntity;
import entity.Phone;
import java.util.List;

/**
 *
 * @author xboxm
 */
public interface IPhoneFacade {
    public List getPhonesById(int id);
    public Phone addPhone(InfoEntity ie);
}
