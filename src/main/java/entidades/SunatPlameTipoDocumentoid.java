/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "sunat_plame_tipo_documentoid", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findAll", query = "SELECT s FROM SunatPlameTipoDocumentoid s"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByCodtipodocumentoid", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.codtipodocumentoid = :codtipodocumentoid"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByCodsunat", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.codsunat = :codsunat"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByDenominacionAbreviada", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.denominacionAbreviada = :denominacionAbreviada"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByDenominacion", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.denominacion = :denominacion"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByCondicion", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.condicion = :condicion"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByEstado", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.estado = :estado"),
    @NamedQuery(name = "SunatPlameTipoDocumentoid.findByFechareg", query = "SELECT s FROM SunatPlameTipoDocumentoid s WHERE s.fechareg = :fechareg")})
public class SunatPlameTipoDocumentoid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codtipodocumentoid")
    private Integer codtipodocumentoid;
    @Size(max = 15)
    @Column(name = "codsunat")
    private String codsunat;
    @Size(max = 15)
    @Column(name = "denominacion_abreviada")
    private String denominacionAbreviada;
    @Size(max = 100)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @JoinColumn(name = "codusuario", referencedColumnName = "codusuario")
    @ManyToOne
    private Usuarios codusuario;
    @OneToMany(mappedBy = "codtipodocumentoid")
    private List<Clientes> clientesList;

    public SunatPlameTipoDocumentoid() {
    }

    public SunatPlameTipoDocumentoid(Integer codtipodocumentoid) {
        this.codtipodocumentoid = codtipodocumentoid;
    }

    public Integer getCodtipodocumentoid() {
        return codtipodocumentoid;
    }

    public void setCodtipodocumentoid(Integer codtipodocumentoid) {
        this.codtipodocumentoid = codtipodocumentoid;
    }

    public String getCodsunat() {
        return codsunat;
    }

    public void setCodsunat(String codsunat) {
        this.codsunat = codsunat;
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

    public Usuarios getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Usuarios codusuario) {
        this.codusuario = codusuario;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipodocumentoid != null ? codtipodocumentoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SunatPlameTipoDocumentoid)) {
            return false;
        }
        SunatPlameTipoDocumentoid other = (SunatPlameTipoDocumentoid) object;
        if ((this.codtipodocumentoid == null && other.codtipodocumentoid != null) || (this.codtipodocumentoid != null && !this.codtipodocumentoid.equals(other.codtipodocumentoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SunatPlameTipoDocumentoid[ codtipodocumentoid=" + codtipodocumentoid + " ]";
    }
    
}
