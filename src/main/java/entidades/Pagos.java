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
@Table(name = "pagos", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p"),
    @NamedQuery(name = "Pagos.findByCodpago", query = "SELECT p FROM Pagos p WHERE p.codpago = :codpago"),
    @NamedQuery(name = "Pagos.findByCodestablecimiento", query = "SELECT p FROM Pagos p WHERE p.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Pagos.findByCodperiodocontable", query = "SELECT p FROM Pagos p WHERE p.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Pagos.findByCodcredito", query = "SELECT p FROM Pagos p WHERE p.codcredito = :codcredito"),
    @NamedQuery(name = "Pagos.findByCodcartera", query = "SELECT p FROM Pagos p WHERE p.codcartera = :codcartera"),
    @NamedQuery(name = "Pagos.findByImporte", query = "SELECT p FROM Pagos p WHERE p.importe = :importe"),
    @NamedQuery(name = "Pagos.findByFechaPago", query = "SELECT p FROM Pagos p WHERE p.fechaPago = :fechaPago"),
    @NamedQuery(name = "Pagos.findByCodusuario", query = "SELECT p FROM Pagos p WHERE p.codusuario = :codusuario"),
    @NamedQuery(name = "Pagos.findByCondicion", query = "SELECT p FROM Pagos p WHERE p.condicion = :condicion"),
    @NamedQuery(name = "Pagos.findByEstado", query = "SELECT p FROM Pagos p WHERE p.estado = :estado"),
    @NamedQuery(name = "Pagos.findByFechareg", query = "SELECT p FROM Pagos p WHERE p.fechareg = :fechareg"),
    @NamedQuery(name = "Pagos.findByLastfechaupdate", query = "SELECT p FROM Pagos p WHERE p.lastfechaupdate = :lastfechaupdate")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codpago")
    private Integer codpago;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Column(name = "codcredito")
    private Integer codcredito;
    @Column(name = "codcartera")
    private Integer codcartera;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private BigDecimal importe;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Column(name = "codusuario")
    private Integer codusuario;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @Column(name = "lastfechaupdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastfechaupdate;

    public Pagos() {
    }

    public Pagos(Integer codpago) {
        this.codpago = codpago;
    }

    public Integer getCodpago() {
        return codpago;
    }

    public void setCodpago(Integer codpago) {
        this.codpago = codpago;
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

    public Integer getCodcredito() {
        return codcredito;
    }

    public void setCodcredito(Integer codcredito) {
        this.codcredito = codcredito;
    }

    public Integer getCodcartera() {
        return codcartera;
    }

    public void setCodcartera(Integer codcartera) {
        this.codcartera = codcartera;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
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

    public Date getLastfechaupdate() {
        return lastfechaupdate;
    }

    public void setLastfechaupdate(Date lastfechaupdate) {
        this.lastfechaupdate = lastfechaupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpago != null ? codpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.codpago == null && other.codpago != null) || (this.codpago != null && !this.codpago.equals(other.codpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pagos[ codpago=" + codpago + " ]";
    }
    
}
