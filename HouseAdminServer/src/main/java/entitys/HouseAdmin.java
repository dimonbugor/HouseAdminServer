/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anekr
 */
@Entity
@Table(name = "house_admin_table")
@NamedQueries({
    @NamedQuery(name = "HouseAdmin.findAll", query = "SELECT h FROM HouseAdmin h")
    , @NamedQuery(name = "HouseAdmin.findById", query = "SELECT h FROM HouseAdmin h WHERE h.id = :id")
    , @NamedQuery(name = "HouseAdmin.findByName", query = "SELECT h FROM HouseAdmin h WHERE h.name = :name")
    , @NamedQuery(name = "HouseAdmin.findByLastName", query = "SELECT h FROM HouseAdmin h WHERE h.lastName = :lastName")
    , @NamedQuery(name = "HouseAdmin.findBySeniority", query = "SELECT h FROM HouseAdmin h WHERE h.seniority = :seniority")})
public class HouseAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seniority")
    private int seniority;

    public HouseAdmin() {
    }

    public HouseAdmin(Integer id) {
        this.id = id;
    }

    public HouseAdmin(Integer id, String name, String lastName, int seniority) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.seniority = seniority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HouseAdmin)) {
            return false;
        }
        HouseAdmin other = (HouseAdmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.HouseAdmin[ id=" + id + " ]";
    }
    
}
