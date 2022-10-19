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
import javax.persistence.Lob;
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
@Table(name = "empresas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e"),
    @NamedQuery(name = "Empresas.findByCodempresa", query = "SELECT e FROM Empresas e WHERE e.codempresa = :codempresa"),
    @NamedQuery(name = "Empresas.findByRuc", query = "SELECT e FROM Empresas e WHERE e.ruc = :ruc"),
    @NamedQuery(name = "Empresas.findByRazonsocial", query = "SELECT e FROM Empresas e WHERE e.razonsocial = :razonsocial"),
    @NamedQuery(name = "Empresas.findByNombreComercial", query = "SELECT e FROM Empresas e WHERE e.nombreComercial = :nombreComercial"),
    @NamedQuery(name = "Empresas.findByDireccion", query = "SELECT e FROM Empresas e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empresas.findByFlagLogo", query = "SELECT e FROM Empresas e WHERE e.flagLogo = :flagLogo"),
    @NamedQuery(name = "Empresas.findByNombreLogo", query = "SELECT e FROM Empresas e WHERE e.nombreLogo = :nombreLogo"),
    @NamedQuery(name = "Empresas.findByOrigenLogo", query = "SELECT e FROM Empresas e WHERE e.origenLogo = :origenLogo"),
    @NamedQuery(name = "Empresas.findByCodusuario", query = "SELECT e FROM Empresas e WHERE e.codusuario = :codusuario"),
    @NamedQuery(name = "Empresas.findByCondicion", query = "SELECT e FROM Empresas e WHERE e.condicion = :condicion"),
    @NamedQuery(name = "Empresas.findByEstado", query = "SELECT e FROM Empresas e WHERE e.estado = :estado"),
    @NamedQuery(name = "Empresas.findByFechareg", query = "SELECT e FROM Empresas e WHERE e.fechareg = :fechareg")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codempresa")
    private Integer codempresa;
    @Size(max = 15)
    @Column(name = "ruc")
    private String ruc;
    @Size(max = 500)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 500)
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Size(max = 500)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "flag_logo")
    private Boolean flagLogo;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Size(max = 100)
    @Column(name = "nombre_logo")
    private String nombreLogo;
    @Size(max = 500)
    @Column(name = "origen_logo")
    private String origenLogo;
    @Column(name = "codusuario")
    private Integer codusuario;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;

    public Empresas() {
    }

    public Empresas(Integer codempresa) {
        this.codempresa = codempresa;
    }

    public Integer getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(Integer codempresa) {
        this.codempresa = codempresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getFlagLogo() {
        return flagLogo;
    }

    public void setFlagLogo(Boolean flagLogo) {
        this.flagLogo = flagLogo;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getNombreLogo() {
        return nombreLogo;
    }

    public void setNombreLogo(String nombreLogo) {
        this.nombreLogo = nombreLogo;
    }

    public String getOrigenLogo() {
        return origenLogo;
    }

    public void setOrigenLogo(String origenLogo) {
        this.origenLogo = origenLogo;
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
        hash += (codempresa != null ? codempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.codempresa == null && other.codempresa != null) || (this.codempresa != null && !this.codempresa.equals(other.codempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Empresas[ codempresa=" + codempresa + " ]";
    }
    
}
