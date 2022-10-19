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
@Table(name = "zonas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zonas.findAll", query = "SELECT z FROM Zonas z"),
    @NamedQuery(name = "Zonas.findByCodzona", query = "SELECT z FROM Zonas z WHERE z.codzona = :codzona"),
    @NamedQuery(name = "Zonas.findByCodestablecimiento", query = "SELECT z FROM Zonas z WHERE z.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Zonas.findByDenominacion", query = "SELECT z FROM Zonas z WHERE z.denominacion = :denominacion"),
    @NamedQuery(name = "Zonas.findByCodusuario", query = "SELECT z FROM Zonas z WHERE z.codusuario = :codusuario"),
    @NamedQuery(name = "Zonas.findByCondicion", query = "SELECT z FROM Zonas z WHERE z.condicion = :condicion"),
    @NamedQuery(name = "Zonas.findByEstado", query = "SELECT z FROM Zonas z WHERE z.estado = :estado"),
    @NamedQuery(name = "Zonas.findByFechareg", query = "SELECT z FROM Zonas z WHERE z.fechareg = :fechareg")})
public class Zonas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codzona")
    private Integer codzona;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
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

    public Zonas() {
    }

    public Zonas(Integer codzona) {
        this.codzona = codzona;
    }

    public Integer getCodzona() {
        return codzona;
    }

    public void setCodzona(Integer codzona) {
        this.codzona = codzona;
    }

    public Integer getCodestablecimiento() {
        return codestablecimiento;
    }

    public void setCodestablecimiento(Integer codestablecimiento) {
        this.codestablecimiento = codestablecimiento;
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
        hash += (codzona != null ? codzona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zonas)) {
            return false;
        }
        Zonas other = (Zonas) object;
        if ((this.codzona == null && other.codzona != null) || (this.codzona != null && !this.codzona.equals(other.codzona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Zonas[ codzona=" + codzona + " ]";
    }
    
}
