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
@Table(name = "tipo_persona", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPersona.findAll", query = "SELECT t FROM TipoPersona t"),
    @NamedQuery(name = "TipoPersona.findByCodtipopersona", query = "SELECT t FROM TipoPersona t WHERE t.codtipopersona = :codtipopersona"),
    @NamedQuery(name = "TipoPersona.findByDenominacion", query = "SELECT t FROM TipoPersona t WHERE t.denominacion = :denominacion"),
    @NamedQuery(name = "TipoPersona.findByCodusuario", query = "SELECT t FROM TipoPersona t WHERE t.codusuario = :codusuario"),
    @NamedQuery(name = "TipoPersona.findByCondicion", query = "SELECT t FROM TipoPersona t WHERE t.condicion = :condicion"),
    @NamedQuery(name = "TipoPersona.findByEstado", query = "SELECT t FROM TipoPersona t WHERE t.estado = :estado"),
    @NamedQuery(name = "TipoPersona.findByFechareg", query = "SELECT t FROM TipoPersona t WHERE t.fechareg = :fechareg")})
public class TipoPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codtipopersona")
    private Integer codtipopersona;
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

    public TipoPersona() {
    }

    public TipoPersona(Integer codtipopersona) {
        this.codtipopersona = codtipopersona;
    }

    public Integer getCodtipopersona() {
        return codtipopersona;
    }

    public void setCodtipopersona(Integer codtipopersona) {
        this.codtipopersona = codtipopersona;
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
        hash += (codtipopersona != null ? codtipopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPersona)) {
            return false;
        }
        TipoPersona other = (TipoPersona) object;
        if ((this.codtipopersona == null && other.codtipopersona != null) || (this.codtipopersona != null && !this.codtipopersona.equals(other.codtipopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoPersona[ codtipopersona=" + codtipopersona + " ]";
    }
    
}
