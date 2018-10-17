/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 680183
 */
@Entity
@Table(name = "detillowongan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detillowongan.findAll", query = "SELECT d FROM Detillowongan d")
    , @NamedQuery(name = "Detillowongan.findByIdDetillowongan", query = "SELECT d FROM Detillowongan d WHERE d.idDetillowongan = :idDetillowongan")
    , @NamedQuery(name = "Detillowongan.findByIdKandidat", query = "SELECT d FROM Detillowongan d WHERE d.idKandidat = :idKandidat")
    , @NamedQuery(name = "Detillowongan.findByIdLowongan", query = "SELECT d FROM Detillowongan d WHERE d.idLowongan = :idLowongan")})
public class Detillowongan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detillowongan")
    private Integer idDetillowongan;
    @Column(name = "id_kandidat")
    private Integer idKandidat;
    @Column(name = "id_lowongan")
    private Integer idLowongan;

    public Detillowongan() {
    }

    public Detillowongan(Integer idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Integer getIdDetillowongan() {
        return idDetillowongan;
    }

    public void setIdDetillowongan(Integer idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Integer getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Integer idKandidat) {
        this.idKandidat = idKandidat;
    }

    public Integer getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(Integer idLowongan) {
        this.idLowongan = idLowongan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetillowongan != null ? idDetillowongan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detillowongan)) {
            return false;
        }
        Detillowongan other = (Detillowongan) object;
        if ((this.idDetillowongan == null && other.idDetillowongan != null) || (this.idDetillowongan != null && !this.idDetillowongan.equals(other.idDetillowongan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Detillowongan[ idDetillowongan=" + idDetillowongan + " ]";
    }
    
}
