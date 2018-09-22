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
@Table(name = "tenant_table")
@NamedQueries({
    @NamedQuery(name = "Tenant.findAll", query = "SELECT t FROM Tenant t")
    , @NamedQuery(name = "Tenant.findById", query = "SELECT t FROM Tenant t WHERE t.id = :id")
    , @NamedQuery(name = "Tenant.findByName", query = "SELECT t FROM Tenant t WHERE t.name = :name")
    , @NamedQuery(name = "Tenant.findByLastName", query = "SELECT t FROM Tenant t WHERE t.lastName = :lastName")
    , @NamedQuery(name = "Tenant.findByApartmentNumber", query = "SELECT t FROM Tenant t WHERE t.apartmentNumber = :apartmentNumber")
    , @NamedQuery(name = "Tenant.findByAmountPerMonth", query = "SELECT t FROM Tenant t WHERE t.amountPerMonth = :amountPerMonth")})
public class Tenant implements Serializable {

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
    @Column(name = "apartment_number")
    private int apartmentNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount_per_month")
    private int amountPerMonth;

    public Tenant() {
    }

    public Tenant(Integer id) {
        this.id = id;
    }

    public Tenant(Integer id, String name, String lastName, int apartmentNumber, int amountPerMonth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.apartmentNumber = apartmentNumber;
        this.amountPerMonth = amountPerMonth;
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

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getAmountPerMonth() {
        return amountPerMonth;
    }

    public void setAmountPerMonth(int amountPerMonth) {
        this.amountPerMonth = amountPerMonth;
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
        if (!(object instanceof Tenant)) {
            return false;
        }
        Tenant other = (Tenant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Tenant[ id=" + id + " ]";
    }
    
}
