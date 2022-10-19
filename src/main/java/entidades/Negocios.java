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
@Table(name = "negocios", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Negocios.findAll", query = "SELECT n FROM Negocios n"),
    @NamedQuery(name = "Negocios.findByCodnegocio", query = "SELECT n FROM Negocios n WHERE n.codnegocio = :codnegocio"),
    @NamedQuery(name = "Negocios.findByCodestablecimiento", query = "SELECT n FROM Negocios n WHERE n.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Negocios.findByCodperiodocontable", query = "SELECT n FROM Negocios n WHERE n.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Negocios.findByDenominacion", query = "SELECT n FROM Negocios n WHERE n.denominacion = :denominacion"),
    @NamedQuery(name = "Negocios.findByCodusuario", query = "SELECT n FROM Negocios n WHERE n.codusuario = :codusuario"),
    @NamedQuery(name = "Negocios.findByCondicion", query = "SELECT n FROM Negocios n WHERE n.condicion = :condicion"),
    @NamedQuery(name = "Negocios.findByEstado", query = "SELECT n FROM Negocios n WHERE n.estado = :estado"),
    @NamedQuery(name = "Negocios.findByFechareg", query = "SELECT n FROM Negocios n WHERE n.fechareg = :fechareg")})
public class Negocios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codnegocio")
    private Integer codnegocio;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Size(max = 300)
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

    public Negocios() {
    }

    public Negocios(Integer codnegocio) {
        this.codnegocio = codnegocio;
    }

    public Integer getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(Integer codnegocio) {
        this.codnegocio = codnegocio;
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
        hash += (codnegocio != null ? codnegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Negocios)) {
            return false;
        }
        Negocios other = (Negocios) object;
        if ((this.codnegocio == null && other.codnegocio != null) || (this.codnegocio != null && !this.codnegocio.equals(other.codnegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Negocios[ codnegocio=" + codnegocio + " ]";
    }
    
}
