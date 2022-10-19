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
@Table(name = "feriados", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feriados.findAll", query = "SELECT f FROM Feriados f"),
    @NamedQuery(name = "Feriados.findByCodferiado", query = "SELECT f FROM Feriados f WHERE f.codferiado = :codferiado"),
    @NamedQuery(name = "Feriados.findByCodestablecimiento", query = "SELECT f FROM Feriados f WHERE f.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Feriados.findByCodperiodocontable", query = "SELECT f FROM Feriados f WHERE f.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Feriados.findByDenominacion", query = "SELECT f FROM Feriados f WHERE f.denominacion = :denominacion"),
    @NamedQuery(name = "Feriados.findByFechaFeriado", query = "SELECT f FROM Feriados f WHERE f.fechaFeriado = :fechaFeriado"),
    @NamedQuery(name = "Feriados.findByLastcodusuario", query = "SELECT f FROM Feriados f WHERE f.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Feriados.findByLastfechaupdate", query = "SELECT f FROM Feriados f WHERE f.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Feriados.findByCodusuario", query = "SELECT f FROM Feriados f WHERE f.codusuario = :codusuario"),
    @NamedQuery(name = "Feriados.findByCondicion", query = "SELECT f FROM Feriados f WHERE f.condicion = :condicion"),
    @NamedQuery(name = "Feriados.findByEstado", query = "SELECT f FROM Feriados f WHERE f.estado = :estado"),
    @NamedQuery(name = "Feriados.findByFechareg", query = "SELECT f FROM Feriados f WHERE f.fechareg = :fechareg")})
public class Feriados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codferiado")
    private Integer codferiado;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Size(max = 100)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "fecha_feriado")
    @Temporal(TemporalType.DATE)
    private Date fechaFeriado;
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

    public Feriados() {
    }

    public Feriados(Integer codferiado) {
        this.codferiado = codferiado;
    }

    public Integer getCodferiado() {
        return codferiado;
    }

    public void setCodferiado(Integer codferiado) {
        this.codferiado = codferiado;
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

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Date getFechaFeriado() {
        return fechaFeriado;
    }

    public void setFechaFeriado(Date fechaFeriado) {
        this.fechaFeriado = fechaFeriado;
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
        hash += (codferiado != null ? codferiado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feriados)) {
            return false;
        }
        Feriados other = (Feriados) object;
        if ((this.codferiado == null && other.codferiado != null) || (this.codferiado != null && !this.codferiado.equals(other.codferiado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Feriados[ codferiado=" + codferiado + " ]";
    }
    
}
