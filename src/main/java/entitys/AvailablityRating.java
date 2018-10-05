/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author anekr
 */
@Entity
@Table(name = "availablity_rating_table")
@NamedQueries({
    @NamedQuery(name = "AvailablityRating.findAll", query = "SELECT a FROM AvailablityRating a")
    , @NamedQuery(name = "AvailablityRating.findById", query = "SELECT a FROM AvailablityRating a WHERE a.id = :id")
    , @NamedQuery(name = "AvailablityRating.findByRating", query = "SELECT a FROM AvailablityRating a WHERE a.rating = :rating")})
public class AvailablityRating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private int rating;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "availablityRating")
    private Collection<Supplier> supplierCollection;

    public AvailablityRating() {
    }

    public AvailablityRating(Integer id) {
        this.id = id;
    }

    public AvailablityRating(Integer id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Collection<Supplier> getSupplierCollection() {
        return supplierCollection;
    }

    public void setSupplierCollection(Collection<Supplier> supplierCollection) {
        this.supplierCollection = supplierCollection;
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
        if (!(object instanceof AvailablityRating)) {
            return false;
        }
        AvailablityRating other = (AvailablityRating) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.AvailablityRating[ id=" + id + " ]";
    }
    
}
