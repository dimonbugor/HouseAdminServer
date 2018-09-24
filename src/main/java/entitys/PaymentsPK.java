/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author anekr
 */
@Embeddable
public class PaymentsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "apartment_table_id")
    private int apartmentTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier_table_id")
    private int supplierTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier_table_category_table_id")
    private int supplierTableCategoryTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier_table_availablity_rating_table_id")
    private int supplierTableAvailablityRatingTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier_table_quality_rating_table_id")
    private int supplierTableQualityRatingTableId;

    public PaymentsPK() {
    }

    public PaymentsPK(int id, int apartmentTableId, int supplierTableId, int supplierTableCategoryTableId, int supplierTableAvailablityRatingTableId, int supplierTableQualityRatingTableId) {
        this.id = id;
        this.apartmentTableId = apartmentTableId;
        this.supplierTableId = supplierTableId;
        this.supplierTableCategoryTableId = supplierTableCategoryTableId;
        this.supplierTableAvailablityRatingTableId = supplierTableAvailablityRatingTableId;
        this.supplierTableQualityRatingTableId = supplierTableQualityRatingTableId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentTableId() {
        return apartmentTableId;
    }

    public void setApartmentTableId(int apartmentTableId) {
        this.apartmentTableId = apartmentTableId;
    }

    public int getSupplierTableId() {
        return supplierTableId;
    }

    public void setSupplierTableId(int supplierTableId) {
        this.supplierTableId = supplierTableId;
    }

    public int getSupplierTableCategoryTableId() {
        return supplierTableCategoryTableId;
    }

    public void setSupplierTableCategoryTableId(int supplierTableCategoryTableId) {
        this.supplierTableCategoryTableId = supplierTableCategoryTableId;
    }

    public int getSupplierTableAvailablityRatingTableId() {
        return supplierTableAvailablityRatingTableId;
    }

    public void setSupplierTableAvailablityRatingTableId(int supplierTableAvailablityRatingTableId) {
        this.supplierTableAvailablityRatingTableId = supplierTableAvailablityRatingTableId;
    }

    public int getSupplierTableQualityRatingTableId() {
        return supplierTableQualityRatingTableId;
    }

    public void setSupplierTableQualityRatingTableId(int supplierTableQualityRatingTableId) {
        this.supplierTableQualityRatingTableId = supplierTableQualityRatingTableId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) apartmentTableId;
        hash += (int) supplierTableId;
        hash += (int) supplierTableCategoryTableId;
        hash += (int) supplierTableAvailablityRatingTableId;
        hash += (int) supplierTableQualityRatingTableId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentsPK)) {
            return false;
        }
        PaymentsPK other = (PaymentsPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.apartmentTableId != other.apartmentTableId) {
            return false;
        }
        if (this.supplierTableId != other.supplierTableId) {
            return false;
        }
        if (this.supplierTableCategoryTableId != other.supplierTableCategoryTableId) {
            return false;
        }
        if (this.supplierTableAvailablityRatingTableId != other.supplierTableAvailablityRatingTableId) {
            return false;
        }
        if (this.supplierTableQualityRatingTableId != other.supplierTableQualityRatingTableId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.PaymentsPK[ id=" + id + ", apartmentTableId=" + apartmentTableId + ", supplierTableId=" + supplierTableId + ", supplierTableCategoryTableId=" + supplierTableCategoryTableId + ", supplierTableAvailablityRatingTableId=" + supplierTableAvailablityRatingTableId + ", supplierTableQualityRatingTableId=" + supplierTableQualityRatingTableId + " ]";
    }
    
}
