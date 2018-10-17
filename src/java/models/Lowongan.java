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
@Table(name = "lowongan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lowongan.findAll", query = "SELECT l FROM Lowongan l")
    , @NamedQuery(name = "Lowongan.findByIdLowongan", query = "SELECT l FROM Lowongan l WHERE l.idLowongan = :idLowongan")
    , @NamedQuery(name = "Lowongan.findByNamaPosisi", query = "SELECT l FROM Lowongan l WHERE l.namaPosisi = :namaPosisi")
    , @NamedQuery(name = "Lowongan.findBySyarat", query = "SELECT l FROM Lowongan l WHERE l.syarat = :syarat")
    , @NamedQuery(name = "Lowongan.findByIdKandidat", query = "SELECT l FROM Lowongan l WHERE l.idKandidat = :idKandidat")})
public class Lowongan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lowongan")
    private Integer idLowongan;
    @Column(name = "nama_posisi")
    private String namaPosisi;
    @Column(name = "syarat")
    private String syarat;
    @Column(name = "id_kandidat")
    private Integer idKandidat;

    public Lowongan() {
    }

    public Lowongan(Integer idLowongan) {
        this.idLowongan = idLowongan;
    }

    public Integer getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(Integer idLowongan) {
        this.idLowongan = idLowongan;
    }

    public String getNamaPosisi() {
        return namaPosisi;
    }

    public void setNamaPosisi(String namaPosisi) {
        this.namaPosisi = namaPosisi;
    }

    public String getSyarat() {
        return syarat;
    }

    public void setSyarat(String syarat) {
        this.syarat = syarat;
    }

    public Integer getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Integer idKandidat) {
        this.idKandidat = idKandidat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLowongan != null ? idLowongan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lowongan)) {
            return false;
        }
        Lowongan other = (Lowongan) object;
        if ((this.idLowongan == null && other.idLowongan != null) || (this.idLowongan != null && !this.idLowongan.equals(other.idLowongan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Lowongan[ idLowongan=" + idLowongan + " ]";
    }
    
}
