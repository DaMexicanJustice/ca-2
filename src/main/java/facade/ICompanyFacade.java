/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import entity.InfoEntity;
import java.util.List;

/**
 *
 * @author xboxm
 */
public interface ICompanyFacade {
    public Company getCompanyByCvr(String cvr);
    public Company addCompany(InfoEntity ie);
    public List getCompanies();
}
