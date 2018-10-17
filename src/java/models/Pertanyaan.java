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
@Table(name = "pertanyaan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pertanyaan.findAll", query = "SELECT p FROM Pertanyaan p")
    , @NamedQuery(name = "Pertanyaan.findByIdPertanyaan", query = "SELECT p FROM Pertanyaan p WHERE p.idPertanyaan = :idPertanyaan")
    , @NamedQuery(name = "Pertanyaan.findByPertanyaan", query = "SELECT p FROM Pertanyaan p WHERE p.pertanyaan = :pertanyaan")})
public class Pertanyaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pertanyaan")
    private Integer idPertanyaan;
    @Column(name = "pertanyaan")
    private String pertanyaan;

    public Pertanyaan() {
    }

    public Pertanyaan(Integer idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public Integer getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(Integer idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPertanyaan != null ? idPertanyaan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pertanyaan)) {
            return false;
        }
        Pertanyaan other = (Pertanyaan) object;
        if ((this.idPertanyaan == null && other.idPertanyaan != null) || (this.idPertanyaan != null && !this.idPertanyaan.equals(other.idPertanyaan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Pertanyaan[ idPertanyaan=" + idPertanyaan + " ]";
    }
    
}
