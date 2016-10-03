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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lasse
 */
@Entity
@Table(name = "phone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phone.findAll", query = "SELECT p FROM Phone p"),
    @NamedQuery(name = "Phone.findByPnum", query = "SELECT p FROM Phone p WHERE p.pnum = :pnum"),
    @NamedQuery(name = "Phone.findByDescription", query = "SELECT p FROM Phone p WHERE p.description = :description")})
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pnum")
    private String pnum;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "fk_id", referencedColumnName = "id")
    @ManyToOne
    private Infoentity fkId;

    public Phone() {
    }

    public Phone(String pnum) {
        this.pnum = pnum;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Infoentity getFkId() {
        return fkId;
    }

    public void setFkId(Infoentity fkId) {
        this.fkId = fkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pnum != null ? pnum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) object;
        if ((this.pnum == null && other.pnum != null) || (this.pnum != null && !this.pnum.equals(other.pnum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Phone[ pnum=" + pnum + " ]";
    }
    
}
