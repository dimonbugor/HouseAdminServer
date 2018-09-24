/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "rolle_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolle.findAll", query = "SELECT r FROM Rolle r")
    , @NamedQuery(name = "Rolle.findById", query = "SELECT r FROM Rolle r WHERE r.id = :id")
    , @NamedQuery(name = "Rolle.findBySeniority", query = "SELECT r FROM Rolle r WHERE r.seniority = :seniority")
    , @NamedQuery(name = "Rolle.findByRolleTitle", query = "SELECT r FROM Rolle r WHERE r.rolleTitle = :rolleTitle")})
public class Rolle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seniority")
    private int seniority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rolle_title")
    private String rolleTitle;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolle", fetch = FetchType.EAGER)
    @JsonBackReference
    private Collection<User> userCollection;

    public Rolle() {
    }

    public Rolle(Integer id) {
        this.id = id;
    }

    public Rolle(Integer id, int seniority, String rolleTitle) {
        this.id = id;
        this.seniority = seniority;
        this.rolleTitle = rolleTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String getRolleTitle() {
        return rolleTitle;
    }

    public void setRolleTitle(String rolleTitle) {
        this.rolleTitle = rolleTitle;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
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
        if (!(object instanceof Rolle)) {
            return false;
        }
        Rolle other = (Rolle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Rolle[ id=" + id + " ]";
    }
    
}
