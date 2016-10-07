/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lasse
 */
@Entity
@Table(name = "address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findByAddressid", query = "SELECT a FROM Address a WHERE a.addressid = :addressid"),
    @NamedQuery(name = "Address.findByAdditionalinfo", query = "SELECT a FROM Address a WHERE a.additionalinfo = :additionalinfo"),
    @NamedQuery(name = "Address.findByStreet", query = "SELECT a FROM Address a WHERE a.street = :street")})
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "addressid")
    private Integer addressid;
    @Size(max = 255)
    @Column(name = "additionalinfo")
    private String additionalinfo;
    @Size(max = 255)
    @Column(name = "street")
    private String street;
    @JoinTable(name = "address_infoentity", joinColumns = {
        @JoinColumn(name = "Address_addressid", referencedColumnName = "addressid")}, inverseJoinColumns = {
        @JoinColumn(name = "infoEntities_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Infoentity> infoentityCollection;
    @JoinColumn(name = "fk_id", referencedColumnName = "id")
    @ManyToOne
    private Infoentity fkId;
    @JoinColumn(name = "fk_zipcode", referencedColumnName = "zipcode")
    @ManyToOne
    private Cityinfo fkZipcode;

    public Address() {
    }

    public Address(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlTransient
    public Collection<Infoentity> getInfoentityCollection() {
        return infoentityCollection;
    }

    public void setInfoentityCollection(Collection<Infoentity> infoentityCollection) {
        this.infoentityCollection = infoentityCollection;
    }

    public Infoentity getFkId() {
        return fkId;
    }

    public void setFkId(Infoentity fkId) {
        this.fkId = fkId;
    }

    public Cityinfo getFkZipcode() {
        return fkZipcode;
    }

    public void setFkZipcode(Cityinfo fkZipcode) {
        this.fkZipcode = fkZipcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressid != null ? addressid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressid == null && other.addressid != null) || (this.addressid != null && !this.addressid.equals(other.addressid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Address[ addressid=" + addressid + " ]";
    }
    
}
