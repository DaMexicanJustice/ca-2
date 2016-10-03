/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lasse
 */
@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByCompanyid", query = "SELECT c FROM Company c WHERE c.companyid = :companyid"),
    @NamedQuery(name = "Company.findByCvr", query = "SELECT c FROM Company c WHERE c.cvr = :cvr"),
    @NamedQuery(name = "Company.findByCname", query = "SELECT c FROM Company c WHERE c.cname = :cname"),
    @NamedQuery(name = "Company.findByDescription", query = "SELECT c FROM Company c WHERE c.description = :description"),
    @NamedQuery(name = "Company.findByNoOfEmployees", query = "SELECT c FROM Company c WHERE c.noOfEmployees = :noOfEmployees"),
    @NamedQuery(name = "Company.findByMarketValue", query = "SELECT c FROM Company c WHERE c.marketValue = :marketValue")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "companyid")
    private Integer companyid;
    @Size(max = 8)
    @Column(name = "cvr")
    private String cvr;
    @Size(max = 100)
    @Column(name = "cname")
    private String cname;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @Column(name = "no_of_employees")
    private Integer noOfEmployees;
    @Column(name = "market_value")
    private Integer marketValue;
    @JoinColumn(name = "fk_id", referencedColumnName = "id")
    @ManyToOne
    private InfoEntity fkId;

    public Company() {
    }

    public Company(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public Integer getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Integer marketValue) {
        this.marketValue = marketValue;
    }

    public InfoEntity getFkId() {
        return fkId;
    }

    public void setFkId(InfoEntity fkId) {
        this.fkId = fkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyid != null ? companyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyid == null && other.companyid != null) || (this.companyid != null && !this.companyid.equals(other.companyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Company[ companyid=" + companyid + " ]";
    }
    
}
