/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Twistko
 */
@Entity
@Table(name = "biodata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biodata.findAll", query = "SELECT b FROM Biodata b"),
    @NamedQuery(name = "Biodata.findByNim", query = "SELECT b FROM Biodata b WHERE b.nim = :nim"),
    @NamedQuery(name = "Biodata.findByNama", query = "SELECT b FROM Biodata b WHERE b.nama = :nama"),
    @NamedQuery(name = "Biodata.findByJk", query = "SELECT b FROM Biodata b WHERE b.jk = :jk"),
    @NamedQuery(name = "Biodata.findByProdi", query = "SELECT b FROM Biodata b WHERE b.prodi = :prodi"),
    @NamedQuery(name = "Biodata.findByAsal", query = "SELECT b FROM Biodata b WHERE b.asal = :asal")})
public class Biodata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NIM")
    private Integer nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "jk")
    private String jk;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "asal")
    private String asal;

    public Biodata() {
    }

    public Biodata(Integer nim) {
        this.nim = nim;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biodata)) {
            return false;
        }
        Biodata other = (Biodata) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modul3.Biodata[ nim=" + nim + " ]";
    }
    
}
