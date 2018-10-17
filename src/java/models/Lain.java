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
@Table(name = "lain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lain.findAll", query = "SELECT l FROM Lain l")
    , @NamedQuery(name = "Lain.findByIdLain", query = "SELECT l FROM Lain l WHERE l.idLain = :idLain")
    , @NamedQuery(name = "Lain.findByIdPertanyaan", query = "SELECT l FROM Lain l WHERE l.idPertanyaan = :idPertanyaan")
    , @NamedQuery(name = "Lain.findByIdKandidat", query = "SELECT l FROM Lain l WHERE l.idKandidat = :idKandidat")
    , @NamedQuery(name = "Lain.findByJawaban", query = "SELECT l FROM Lain l WHERE l.jawaban = :jawaban")})
public class Lain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lain")
    private Integer idLain;
    @Column(name = "id_pertanyaan")
    private Integer idPertanyaan;
    @Column(name = "id_kandidat")
    private Integer idKandidat;
    @Column(name = "jawaban")
    private String jawaban;

    public Lain() {
    }

    public Lain(Integer idLain) {
        this.idLain = idLain;
    }

    public Integer getIdLain() {
        return idLain;
    }

    public void setIdLain(Integer idLain) {
        this.idLain = idLain;
    }

    public Integer getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(Integer idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public Integer getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Integer idKandidat) {
        this.idKandidat = idKandidat;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLain != null ? idLain.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lain)) {
            return false;
        }
        Lain other = (Lain) object;
        if ((this.idLain == null && other.idLain != null) || (this.idLain != null && !this.idLain.equals(other.idLain))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Lain[ idLain=" + idLain + " ]";
    }
    
}
