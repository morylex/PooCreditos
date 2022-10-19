/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "carteras", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carteras.findAll", query = "SELECT c FROM Carteras c"),
    @NamedQuery(name = "Carteras.findByCodcartera", query = "SELECT c FROM Carteras c WHERE c.codcartera = :codcartera"),
    @NamedQuery(name = "Carteras.findByCodestablecimiento", query = "SELECT c FROM Carteras c WHERE c.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Carteras.findByCodperiodocontable", query = "SELECT c FROM Carteras c WHERE c.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Carteras.findByDenominacionAbreviada", query = "SELECT c FROM Carteras c WHERE c.denominacionAbreviada = :denominacionAbreviada"),
    @NamedQuery(name = "Carteras.findByDenominacion", query = "SELECT c FROM Carteras c WHERE c.denominacion = :denominacion"),
    @NamedQuery(name = "Carteras.findByCodusuario", query = "SELECT c FROM Carteras c WHERE c.codusuario = :codusuario"),
    @NamedQuery(name = "Carteras.findByCondicion", query = "SELECT c FROM Carteras c WHERE c.condicion = :condicion"),
    @NamedQuery(name = "Carteras.findByEstado", query = "SELECT c FROM Carteras c WHERE c.estado = :estado"),
    @NamedQuery(name = "Carteras.findByFechareg", query = "SELECT c FROM Carteras c WHERE c.fechareg = :fechareg")})
public class Carteras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codcartera")
    private Integer codcartera;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Size(max = 15)
    @Column(name = "denominacion_abreviada")
    private String denominacionAbreviada;
    @Size(max = 100)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "codusuario")
    private Integer codusuario;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;

    public Carteras() {
    }

    public Carteras(Integer codcartera) {
        this.codcartera = codcartera;
    }

    public Integer getCodcartera() {
        return codcartera;
    }

    public void setCodcartera(Integer codcartera) {
        this.codcartera = codcartera;
    }

    public Integer getCodestablecimiento() {
        return codestablecimiento;
    }

    public void setCodestablecimiento(Integer codestablecimiento) {
        this.codestablecimiento = codestablecimiento;
    }

    public Integer getCodperiodocontable() {
        return codperiodocontable;
    }

    public void setCodperiodocontable(Integer codperiodocontable) {
        this.codperiodocontable = codperiodocontable;
    }

    public String getDenominacionAbreviada() {
        return denominacionAbreviada;
    }

    public void setDenominacionAbreviada(String denominacionAbreviada) {
        this.denominacionAbreviada = denominacionAbreviada;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public Boolean getCondicion() {
        return condicion;
    }

    public void setCondicion(Boolean condicion) {
        this.condicion = condicion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcartera != null ? codcartera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carteras)) {
            return false;
        }
        Carteras other = (Carteras) object;
        if ((this.codcartera == null && other.codcartera != null) || (this.codcartera != null && !this.codcartera.equals(other.codcartera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Carteras[ codcartera=" + codcartera + " ]";
    }
    
}
