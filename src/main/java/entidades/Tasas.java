/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tasas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasas.findAll", query = "SELECT t FROM Tasas t"),
    @NamedQuery(name = "Tasas.findByCodtasa", query = "SELECT t FROM Tasas t WHERE t.codtasa = :codtasa"),
    @NamedQuery(name = "Tasas.findByCodestablecimiento", query = "SELECT t FROM Tasas t WHERE t.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Tasas.findByCodperiodocontable", query = "SELECT t FROM Tasas t WHERE t.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Tasas.findByTasa", query = "SELECT t FROM Tasas t WHERE t.tasa = :tasa"),
    @NamedQuery(name = "Tasas.findByLastcodusuario", query = "SELECT t FROM Tasas t WHERE t.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Tasas.findByLastfechaupdate", query = "SELECT t FROM Tasas t WHERE t.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Tasas.findByCodusuario", query = "SELECT t FROM Tasas t WHERE t.codusuario = :codusuario"),
    @NamedQuery(name = "Tasas.findByCondicion", query = "SELECT t FROM Tasas t WHERE t.condicion = :condicion"),
    @NamedQuery(name = "Tasas.findByEstado", query = "SELECT t FROM Tasas t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tasas.findByFechareg", query = "SELECT t FROM Tasas t WHERE t.fechareg = :fechareg")})
public class Tasas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codtasa")
    private Integer codtasa;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasa")
    private BigDecimal tasa;
    @Column(name = "lastcodusuario")
    private Integer lastcodusuario;
    @Column(name = "lastfechaupdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastfechaupdate;
    @Column(name = "codusuario")
    private Integer codusuario;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;

    public Tasas() {
    }

    public Tasas(Integer codtasa) {
        this.codtasa = codtasa;
    }

    public Integer getCodtasa() {
        return codtasa;
    }

    public void setCodtasa(Integer codtasa) {
        this.codtasa = codtasa;
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

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public Integer getLastcodusuario() {
        return lastcodusuario;
    }

    public void setLastcodusuario(Integer lastcodusuario) {
        this.lastcodusuario = lastcodusuario;
    }

    public Date getLastfechaupdate() {
        return lastfechaupdate;
    }

    public void setLastfechaupdate(Date lastfechaupdate) {
        this.lastfechaupdate = lastfechaupdate;
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
        hash += (codtasa != null ? codtasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasas)) {
            return false;
        }
        Tasas other = (Tasas) object;
        if ((this.codtasa == null && other.codtasa != null) || (this.codtasa != null && !this.codtasa.equals(other.codtasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tasas[ codtasa=" + codtasa + " ]";
    }
    
}
