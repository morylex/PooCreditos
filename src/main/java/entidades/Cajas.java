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
@Table(name = "cajas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajas.findAll", query = "SELECT c FROM Cajas c"),
    @NamedQuery(name = "Cajas.findByCodcaja", query = "SELECT c FROM Cajas c WHERE c.codcaja = :codcaja"),
    @NamedQuery(name = "Cajas.findByCodestablecimiento", query = "SELECT c FROM Cajas c WHERE c.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Cajas.findByCodtipocaja", query = "SELECT c FROM Cajas c WHERE c.codtipocaja = :codtipocaja"),
    @NamedQuery(name = "Cajas.findByDenominacion", query = "SELECT c FROM Cajas c WHERE c.denominacion = :denominacion"),
    @NamedQuery(name = "Cajas.findByNumeroCaja", query = "SELECT c FROM Cajas c WHERE c.numeroCaja = :numeroCaja"),
    @NamedQuery(name = "Cajas.findByCodcartera", query = "SELECT c FROM Cajas c WHERE c.codcartera = :codcartera"),
    @NamedQuery(name = "Cajas.findByLastcodusuario", query = "SELECT c FROM Cajas c WHERE c.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Cajas.findByLastfechaupdate", query = "SELECT c FROM Cajas c WHERE c.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Cajas.findByCodusuario", query = "SELECT c FROM Cajas c WHERE c.codusuario = :codusuario"),
    @NamedQuery(name = "Cajas.findByCondicion", query = "SELECT c FROM Cajas c WHERE c.condicion = :condicion"),
    @NamedQuery(name = "Cajas.findByEstado", query = "SELECT c FROM Cajas c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cajas.findByFechareg", query = "SELECT c FROM Cajas c WHERE c.fechareg = :fechareg")})
public class Cajas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codcaja")
    private Integer codcaja;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codtipocaja")
    private Integer codtipocaja;
    @Size(max = 100)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "numero_caja")
    private Integer numeroCaja;
    @Column(name = "codcartera")
    private Integer codcartera;
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

    public Cajas() {
    }

    public Cajas(Integer codcaja) {
        this.codcaja = codcaja;
    }

    public Integer getCodcaja() {
        return codcaja;
    }

    public void setCodcaja(Integer codcaja) {
        this.codcaja = codcaja;
    }

    public Integer getCodestablecimiento() {
        return codestablecimiento;
    }

    public void setCodestablecimiento(Integer codestablecimiento) {
        this.codestablecimiento = codestablecimiento;
    }

    public Integer getCodtipocaja() {
        return codtipocaja;
    }

    public void setCodtipocaja(Integer codtipocaja) {
        this.codtipocaja = codtipocaja;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Integer getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(Integer numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public Integer getCodcartera() {
        return codcartera;
    }

    public void setCodcartera(Integer codcartera) {
        this.codcartera = codcartera;
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
        hash += (codcaja != null ? codcaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajas)) {
            return false;
        }
        Cajas other = (Cajas) object;
        if ((this.codcaja == null && other.codcaja != null) || (this.codcaja != null && !this.codcaja.equals(other.codcaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cajas[ codcaja=" + codcaja + " ]";
    }
    
}
