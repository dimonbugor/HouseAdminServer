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
public class SupplierPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_table_id")
    private int categoryTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "availablity_rating_table_id")
    private int availablityRatingTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quality_rating_table_id")
    private int qualityRatingTableId;

    public SupplierPK() {
    }

    public SupplierPK(int id, int categoryTableId, int availablityRatingTableId, int qualityRatingTableId) {
        this.id = id;
        this.categoryTableId = categoryTableId;
        this.availablityRatingTableId = availablityRatingTableId;
        this.qualityRatingTableId = qualityRatingTableId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryTableId() {
        return categoryTableId;
    }

    public void setCategoryTableId(int categoryTableId) {
        this.categoryTableId = categoryTableId;
    }

    public int getAvailablityRatingTableId() {
        return availablityRatingTableId;
    }

    public void setAvailablityRatingTableId(int availablityRatingTableId) {
        this.availablityRatingTableId = availablityRatingTableId;
    }

    public int getQualityRatingTableId() {
        return qualityRatingTableId;
    }

    public void setQualityRatingTableId(int qualityRatingTableId) {
        this.qualityRatingTableId = qualityRatingTableId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) categoryTableId;
        hash += (int) availablityRatingTableId;
        hash += (int) qualityRatingTableId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierPK)) {
            return false;
        }
        SupplierPK other = (SupplierPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.categoryTableId != other.categoryTableId) {
            return false;
        }
        if (this.availablityRatingTableId != other.availablityRatingTableId) {
            return false;
        }
        if (this.qualityRatingTableId != other.qualityRatingTableId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.SupplierPK[ id=" + id + ", categoryTableId=" + categoryTableId + ", availablityRatingTableId=" + availablityRatingTableId + ", qualityRatingTableId=" + qualityRatingTableId + " ]";
    }
    
}
