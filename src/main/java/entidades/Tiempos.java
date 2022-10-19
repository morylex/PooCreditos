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
@Table(name = "tiempos", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiempos.findAll", query = "SELECT t FROM Tiempos t"),
    @NamedQuery(name = "Tiempos.findByCodtiempo", query = "SELECT t FROM Tiempos t WHERE t.codtiempo = :codtiempo"),
    @NamedQuery(name = "Tiempos.findByCodestablecimiento", query = "SELECT t FROM Tiempos t WHERE t.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Tiempos.findByCodperiodocontable", query = "SELECT t FROM Tiempos t WHERE t.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Tiempos.findByDenominacion", query = "SELECT t FROM Tiempos t WHERE t.denominacion = :denominacion"),
    @NamedQuery(name = "Tiempos.findByNumeroDias", query = "SELECT t FROM Tiempos t WHERE t.numeroDias = :numeroDias"),
    @NamedQuery(name = "Tiempos.findByFlagDomingos", query = "SELECT t FROM Tiempos t WHERE t.flagDomingos = :flagDomingos"),
    @NamedQuery(name = "Tiempos.findByCodusuario", query = "SELECT t FROM Tiempos t WHERE t.codusuario = :codusuario"),
    @NamedQuery(name = "Tiempos.findByCondicion", query = "SELECT t FROM Tiempos t WHERE t.condicion = :condicion"),
    @NamedQuery(name = "Tiempos.findByEstado", query = "SELECT t FROM Tiempos t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tiempos.findByFechareg", query = "SELECT t FROM Tiempos t WHERE t.fechareg = :fechareg")})
public class Tiempos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codtiempo")
    private Integer codtiempo;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Size(max = 100)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "numero_dias")
    private Integer numeroDias;
    @Column(name = "flag_domingos")
    private Boolean flagDomingos;
    @Column(name = "codusuario")
    private Integer codusuario;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;

    public Tiempos() {
    }

    public Tiempos(Integer codtiempo) {
        this.codtiempo = codtiempo;
    }

    public Integer getCodtiempo() {
        return codtiempo;
    }

    public void setCodtiempo(Integer codtiempo) {
        this.codtiempo = codtiempo;
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

    public Integer getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Boolean getFlagDomingos() {
        return flagDomingos;
    }

    public void setFlagDomingos(Boolean flagDomingos) {
        this.flagDomingos = flagDomingos;
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
        hash += (codtiempo != null ? codtiempo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiempos)) {
            return false;
        }
        Tiempos other = (Tiempos) object;
        if ((this.codtiempo == null && other.codtiempo != null) || (this.codtiempo != null && !this.codtiempo.equals(other.codtiempo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tiempos[ codtiempo=" + codtiempo + " ]";
    }
    
}
