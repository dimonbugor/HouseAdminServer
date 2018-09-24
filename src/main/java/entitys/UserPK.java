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
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.validation.constraints.NotNull;

/**
 *
 * @author anekr
 */
@Embeddable
public class UserPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "apartment_table_id")
    private int apartmentTableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rolle_table_id")
    private int rolleTableId;

    public UserPK() {
    }

    public UserPK(int id, int apartmentTableId, int rolleTableId) {
        this.id = id;
        this.apartmentTableId = apartmentTableId;
        this.rolleTableId = rolleTableId;
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

    public int getRolleTableId() {
        return rolleTableId;
    }

    public void setRolleTableId(int rolleTableId) {
        this.rolleTableId = rolleTableId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) apartmentTableId;
        hash += (int) rolleTableId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPK)) {
            return false;
        }
        UserPK other = (UserPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.apartmentTableId != other.apartmentTableId) {
            return false;
        }
        if (this.rolleTableId != other.rolleTableId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.UserPK[ id=" + id + ", apartmentTableId=" + apartmentTableId + ", rolleTableId=" + rolleTableId + " ]";
    }
    
}
