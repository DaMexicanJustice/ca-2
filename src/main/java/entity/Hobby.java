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
 * @author xboxm
 */
@Entity
@Table(name = "hobby")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hobby.findAll", query = "SELECT h FROM Hobby h"),
    @NamedQuery(name = "Hobby.findByHobbyid", query = "SELECT h FROM Hobby h WHERE h.hobbyid = :hobbyid"),
    @NamedQuery(name = "Hobby.findByHobbyName", query = "SELECT h FROM Hobby h WHERE h.hobbyName = :hobbyName"),
    @NamedQuery(name = "Hobby.findByDescription", query = "SELECT h FROM Hobby h WHERE h.description = :description")})
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hobbyid")
    private Integer hobbyid;
    @Size(max = 40)
    @Column(name = "hobbyName")
    private String hobbyName;
    @Size(max = 100)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "fk_id", referencedColumnName = "id")
    @ManyToOne
    private Person fkId;

    public Hobby() {
    }

    public Hobby(Integer hobbyid) {
        this.hobbyid = hobbyid;
    }

    public Integer getHobbyid() {
        return hobbyid;
    }

    public void setHobbyid(Integer hobbyid) {
        this.hobbyid = hobbyid;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getFkId() {
        return fkId;
    }

    public void setFkId(Person fkId) {
        this.fkId = fkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hobbyid != null ? hobbyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hobby)) {
            return false;
        }
        Hobby other = (Hobby) object;
        if ((this.hobbyid == null && other.hobbyid != null) || (this.hobbyid != null && !this.hobbyid.equals(other.hobbyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Hobby[ hobbyid=" + hobbyid + " ]";
    }
    
}
