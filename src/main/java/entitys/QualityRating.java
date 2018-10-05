/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "quality_rating_table")
@NamedQueries({
    @NamedQuery(name = "QualityRating.findAll", query = "SELECT q FROM QualityRating q")
    , @NamedQuery(name = "QualityRating.findById", query = "SELECT q FROM QualityRating q WHERE q.id = :id")
    , @NamedQuery(name = "QualityRating.findByRating", query = "SELECT q FROM QualityRating q WHERE q.rating = :rating")})
public class QualityRating implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qualityRating")
    @JsonIgnoreProperties("qualityRating")
    private Collection<Supplier> supplierCollection;

    public QualityRating() {
    }

    public QualityRating(Integer id) {
        this.id = id;
    }

    public QualityRating(Integer id, int rating) {
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
        if (!(object instanceof QualityRating)) {
            return false;
        }
        QualityRating other = (QualityRating) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.QualityRating[ id=" + id + " ]";
    }
    
}
