/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anekr
 */
@Entity
@Table(name = "payments_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p")
    , @NamedQuery(name = "Payments.findById", query = "SELECT p FROM Payments p WHERE p.paymentsPK.id = :id")
    , @NamedQuery(name = "Payments.findByApartmentTableId", query = "SELECT p FROM Payments p WHERE p.paymentsPK.apartmentTableId = :apartmentTableId")
    , @NamedQuery(name = "Payments.findByMonth", query = "SELECT p FROM Payments p WHERE p.month = :month")
    , @NamedQuery(name = "Payments.findByAmountPerMonth", query = "SELECT p FROM Payments p WHERE p.amountPerMonth = :amountPerMonth")
    , @NamedQuery(name = "Payments.findBySupplierTableId", query = "SELECT p FROM Payments p WHERE p.paymentsPK.supplierTableId = :supplierTableId")
    , @NamedQuery(name = "Payments.findBySupplierTableCategoryTableId", query = "SELECT p FROM Payments p WHERE p.paymentsPK.supplierTableCategoryTableId = :supplierTableCategoryTableId")
    , @NamedQuery(name = "Payments.findBySupplierTableAvailablityRatingTableId", query = "SELECT p FROM Payments p WHERE p.paymentsPK.supplierTableAvailablityRatingTableId = :supplierTableAvailablityRatingTableId")
    , @NamedQuery(name = "Payments.findBySupplierTableQualityRatingTableId", query = "SELECT p FROM Payments p WHERE p.paymentsPK.supplierTableQualityRatingTableId = :supplierTableQualityRatingTableId")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentsPK paymentsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "month")
    @Temporal(TemporalType.TIMESTAMP)
    private Date month;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount_per_month")
    private float amountPerMonth;
    @JoinColumn(name = "apartment_table_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apartment apartment;
    @JoinColumns({
        @JoinColumn(name = "supplier_table_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "supplier_table_category_table_id", referencedColumnName = "category_table_id", insertable = false, updatable = false)
        , @JoinColumn(name = "supplier_table_availablity_rating_table_id", referencedColumnName = "availablity_rating_table_id", insertable = false, updatable = false)
        , @JoinColumn(name = "supplier_table_quality_rating_table_id", referencedColumnName = "quality_rating_table_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Supplier supplier;

    public Payments() {
    }

    public Payments(PaymentsPK paymentsPK) {
        this.paymentsPK = paymentsPK;
    }

    public Payments(PaymentsPK paymentsPK, Date month, float amountPerMonth) {
        this.paymentsPK = paymentsPK;
        this.month = month;
        this.amountPerMonth = amountPerMonth;
    }

    public Payments(int id, int apartmentTableId, int supplierTableId, int supplierTableCategoryTableId, int supplierTableAvailablityRatingTableId, int supplierTableQualityRatingTableId) {
        this.paymentsPK = new PaymentsPK(id, apartmentTableId, supplierTableId, supplierTableCategoryTableId, supplierTableAvailablityRatingTableId, supplierTableQualityRatingTableId);
    }

    public PaymentsPK getPaymentsPK() {
        return paymentsPK;
    }

    public void setPaymentsPK(PaymentsPK paymentsPK) {
        this.paymentsPK = paymentsPK;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public float getAmountPerMonth() {
        return amountPerMonth;
    }

    public void setAmountPerMonth(float amountPerMonth) {
        this.amountPerMonth = amountPerMonth;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentsPK != null ? paymentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.paymentsPK == null && other.paymentsPK != null) || (this.paymentsPK != null && !this.paymentsPK.equals(other.paymentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Payments[ paymentsPK=" + paymentsPK + " ]";
    }
    
}
