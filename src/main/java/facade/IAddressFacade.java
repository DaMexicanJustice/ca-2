/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Address;
import entity.InfoEntity;

/**
 *
 * @author xboxm
 */
public interface IAddressFacade {
    Address getAddressById(int id);
    Address addAddress(InfoEntity ie);
}
