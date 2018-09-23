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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author anekr
 */
@Entity
@Table(name = "supplier_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
    , @NamedQuery(name = "Supplier.findById", query = "SELECT s FROM Supplier s WHERE s.supplierPK.id = :id")
    , @NamedQuery(name = "Supplier.findByName", query = "SELECT s FROM Supplier s WHERE s.name = :name")
    , @NamedQuery(name = "Supplier.findByPrice", query = "SELECT s FROM Supplier s WHERE s.price = :price")
    , @NamedQuery(name = "Supplier.findByPhone", query = "SELECT s FROM Supplier s WHERE s.phone = :phone")
    , @NamedQuery(name = "Supplier.findByCategoryTableId", query = "SELECT s FROM Supplier s WHERE s.supplierPK.categoryTableId = :categoryTableId")
    , @NamedQuery(name = "Supplier.findByAvailablityRatingTableId", query = "SELECT s FROM Supplier s WHERE s.supplierPK.availablityRatingTableId = :availablityRatingTableId")
    , @NamedQuery(name = "Supplier.findByQualityRatingTableId", query = "SELECT s FROM Supplier s WHERE s.supplierPK.qualityRatingTableId = :qualityRatingTableId")})
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SupplierPK supplierPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "phone")
    private String phone;
    @JoinColumn(name = "availablity_rating_table_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private AvailablityRating availablityRating;
    @JoinColumn(name = "category_table_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Category category;
    @JoinColumn(name = "quality_rating_table_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private QualityRating qualityRating;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier", fetch = FetchType.EAGER)
    private Collection<Payments> paymentsCollection;

    public Supplier() {
    }

    public Supplier(SupplierPK supplierPK) {
        this.supplierPK = supplierPK;
    }

    public Supplier(SupplierPK supplierPK, String name, float price) {
        this.supplierPK = supplierPK;
        this.name = name;
        this.price = price;
    }

    public Supplier(int id, int categoryTableId, int availablityRatingTableId, int qualityRatingTableId) {
        this.supplierPK = new SupplierPK(id, categoryTableId, availablityRatingTableId, qualityRatingTableId);
    }

    public SupplierPK getSupplierPK() {
        return supplierPK;
    }

    public void setSupplierPK(SupplierPK supplierPK) {
        this.supplierPK = supplierPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AvailablityRating getAvailablityRating() {
        return availablityRating;
    }

    public void setAvailablityRating(AvailablityRating availablityRating) {
        this.availablityRating = availablityRating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public QualityRating getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(QualityRating qualityRating) {
        this.qualityRating = qualityRating;
    }

    @XmlTransient
    public Collection<Payments> getPaymentsCollection() {
        return paymentsCollection;
    }

    public void setPaymentsCollection(Collection<Payments> paymentsCollection) {
        this.paymentsCollection = paymentsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierPK != null ? supplierPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.supplierPK == null && other.supplierPK != null) || (this.supplierPK != null && !this.supplierPK.equals(other.supplierPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Supplier[ supplierPK=" + supplierPK + " ]";
    }
    
}
