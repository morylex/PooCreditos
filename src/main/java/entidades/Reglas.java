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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "reglas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglas.findAll", query = "SELECT r FROM Reglas r"),
    @NamedQuery(name = "Reglas.findByCodregla", query = "SELECT r FROM Reglas r WHERE r.codregla = :codregla"),
    @NamedQuery(name = "Reglas.findByCodestablecimiento", query = "SELECT r FROM Reglas r WHERE r.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Reglas.findByCodperiodocontable", query = "SELECT r FROM Reglas r WHERE r.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Reglas.findByCodtasa", query = "SELECT r FROM Reglas r WHERE r.codtasa = :codtasa"),
    @NamedQuery(name = "Reglas.findByCodtiempo", query = "SELECT r FROM Reglas r WHERE r.codtiempo = :codtiempo"),
    @NamedQuery(name = "Reglas.findByLastcodusuario", query = "SELECT r FROM Reglas r WHERE r.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Reglas.findByLastfechaupdate", query = "SELECT r FROM Reglas r WHERE r.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Reglas.findByCodusuario", query = "SELECT r FROM Reglas r WHERE r.codusuario = :codusuario"),
    @NamedQuery(name = "Reglas.findByCondicion", query = "SELECT r FROM Reglas r WHERE r.condicion = :condicion"),
    @NamedQuery(name = "Reglas.findByEstado", query = "SELECT r FROM Reglas r WHERE r.estado = :estado"),
    @NamedQuery(name = "Reglas.findByFechareg", query = "SELECT r FROM Reglas r WHERE r.fechareg = :fechareg")})
public class Reglas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codregla")
    private Integer codregla;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Column(name = "codtasa")
    private Integer codtasa;
    @Column(name = "codtiempo")
    private Integer codtiempo;
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

    public Reglas() {
    }

    public Reglas(Integer codregla) {
        this.codregla = codregla;
    }

    public Integer getCodregla() {
        return codregla;
    }

    public void setCodregla(Integer codregla) {
        this.codregla = codregla;
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

    public Integer getCodtasa() {
        return codtasa;
    }

    public void setCodtasa(Integer codtasa) {
        this.codtasa = codtasa;
    }

    public Integer getCodtiempo() {
        return codtiempo;
    }

    public void setCodtiempo(Integer codtiempo) {
        this.codtiempo = codtiempo;
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
        hash += (codregla != null ? codregla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reglas)) {
            return false;
        }
        Reglas other = (Reglas) object;
        if ((this.codregla == null && other.codregla != null) || (this.codregla != null && !this.codregla.equals(other.codregla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Reglas[ codregla=" + codregla + " ]";
    }
    
}
