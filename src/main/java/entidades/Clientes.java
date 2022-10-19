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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "clientes", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByCodcliente", query = "SELECT c FROM Clientes c WHERE c.codcliente = :codcliente"),
    @NamedQuery(name = "Clientes.findByCodestablecimiento", query = "SELECT c FROM Clientes c WHERE c.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Clientes.findByCodperiodocontable", query = "SELECT c FROM Clientes c WHERE c.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Clientes.findByCodtipocliente", query = "SELECT c FROM Clientes c WHERE c.codtipocliente = :codtipocliente"),
    @NamedQuery(name = "Clientes.findByNumeroDocumento", query = "SELECT c FROM Clientes c WHERE c.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Clientes.findByApellidoPaterno", query = "SELECT c FROM Clientes c WHERE c.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Clientes.findByApellidoMaterno", query = "SELECT c FROM Clientes c WHERE c.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Clientes.findByNombres", query = "SELECT c FROM Clientes c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "Clientes.findByNombreCompleto", query = "SELECT c FROM Clientes c WHERE c.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Clientes.findByDireccion", query = "SELECT c FROM Clientes c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Clientes.findByCodnegocio", query = "SELECT c FROM Clientes c WHERE c.codnegocio = :codnegocio"),
    @NamedQuery(name = "Clientes.findByDireccionNegocio", query = "SELECT c FROM Clientes c WHERE c.direccionNegocio = :direccionNegocio"),
    @NamedQuery(name = "Clientes.findByCodzona", query = "SELECT c FROM Clientes c WHERE c.codzona = :codzona"),
    @NamedQuery(name = "Clientes.findByRecomendacion", query = "SELECT c FROM Clientes c WHERE c.recomendacion = :recomendacion"),
    @NamedQuery(name = "Clientes.findByReferencia", query = "SELECT c FROM Clientes c WHERE c.referencia = :referencia"),
    @NamedQuery(name = "Clientes.findByMontoTope", query = "SELECT c FROM Clientes c WHERE c.montoTope = :montoTope"),
    @NamedQuery(name = "Clientes.findByInhabilitado", query = "SELECT c FROM Clientes c WHERE c.inhabilitado = :inhabilitado"),
    @NamedQuery(name = "Clientes.findBySinpedir", query = "SELECT c FROM Clientes c WHERE c.sinpedir = :sinpedir"),
    @NamedQuery(name = "Clientes.findByTelefono01", query = "SELECT c FROM Clientes c WHERE c.telefono01 = :telefono01"),
    @NamedQuery(name = "Clientes.findByTelefono02", query = "SELECT c FROM Clientes c WHERE c.telefono02 = :telefono02"),
    @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
    @NamedQuery(name = "Clientes.findByLastcodusuario", query = "SELECT c FROM Clientes c WHERE c.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Clientes.findByLastfechaupdate", query = "SELECT c FROM Clientes c WHERE c.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Clientes.findByCodusuario", query = "SELECT c FROM Clientes c WHERE c.codusuario = :codusuario"),
    @NamedQuery(name = "Clientes.findByCondicion", query = "SELECT c FROM Clientes c WHERE c.condicion = :condicion"),
    @NamedQuery(name = "Clientes.findByEstado", query = "SELECT c FROM Clientes c WHERE c.estado = :estado"),
    @NamedQuery(name = "Clientes.findByFechareg", query = "SELECT c FROM Clientes c WHERE c.fechareg = :fechareg"),
    @NamedQuery(name = "Clientes.findByFlagCreditosActivos", query = "SELECT c FROM Clientes c WHERE c.flagCreditosActivos = :flagCreditosActivos"),
    @NamedQuery(name = "Clientes.findByFlagPrestamosActivos", query = "SELECT c FROM Clientes c WHERE c.flagPrestamosActivos = :flagPrestamosActivos"),
    @NamedQuery(name = "Clientes.findByFlagMoroso", query = "SELECT c FROM Clientes c WHERE c.flagMoroso = :flagMoroso")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codcliente")
    private Integer codcliente;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Column(name = "codtipocliente")
    private Integer codtipocliente;
    @Size(max = 15)
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Size(max = 50)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Size(max = 50)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Size(max = 100)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 100)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Size(max = 500)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codnegocio")
    private Integer codnegocio;
    @Size(max = 500)
    @Column(name = "direccion_negocio")
    private String direccionNegocio;
    @Column(name = "codzona")
    private Integer codzona;
    @Size(max = 100)
    @Column(name = "recomendacion")
    private String recomendacion;
    @Size(max = 500)
    @Column(name = "referencia")
    private String referencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_tope")
    private BigDecimal montoTope;
    @Column(name = "inhabilitado")
    private Boolean inhabilitado;
    @Column(name = "sinpedir")
    private Boolean sinpedir;
    @Size(max = 15)
    @Column(name = "telefono_01")
    private String telefono01;
    @Size(max = 15)
    @Column(name = "telefono_02")
    private String telefono02;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
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
    @Column(name = "flag_creditos_activos")
    private Boolean flagCreditosActivos;
    @Column(name = "flag_prestamos_activos")
    private Boolean flagPrestamosActivos;
    @Column(name = "flag_moroso")
    private Boolean flagMoroso;
    @JoinColumn(name = "codtipodocumentoid", referencedColumnName = "codtipodocumentoid")
    @ManyToOne
    private SunatPlameTipoDocumentoid codtipodocumentoid;

    public Clientes() {
    }

    public Clientes(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
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

    public Integer getCodtipocliente() {
        return codtipocliente;
    }

    public void setCodtipocliente(Integer codtipocliente) {
        this.codtipocliente = codtipocliente;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(Integer codnegocio) {
        this.codnegocio = codnegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public Integer getCodzona() {
        return codzona;
    }

    public void setCodzona(Integer codzona) {
        this.codzona = codzona;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigDecimal getMontoTope() {
        return montoTope;
    }

    public void setMontoTope(BigDecimal montoTope) {
        this.montoTope = montoTope;
    }

    public Boolean getInhabilitado() {
        return inhabilitado;
    }

    public void setInhabilitado(Boolean inhabilitado) {
        this.inhabilitado = inhabilitado;
    }

    public Boolean getSinpedir() {
        return sinpedir;
    }

    public void setSinpedir(Boolean sinpedir) {
        this.sinpedir = sinpedir;
    }

    public String getTelefono01() {
        return telefono01;
    }

    public void setTelefono01(String telefono01) {
        this.telefono01 = telefono01;
    }

    public String getTelefono02() {
        return telefono02;
    }

    public void setTelefono02(String telefono02) {
        this.telefono02 = telefono02;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Boolean getFlagCreditosActivos() {
        return flagCreditosActivos;
    }

    public void setFlagCreditosActivos(Boolean flagCreditosActivos) {
        this.flagCreditosActivos = flagCreditosActivos;
    }

    public Boolean getFlagPrestamosActivos() {
        return flagPrestamosActivos;
    }

    public void setFlagPrestamosActivos(Boolean flagPrestamosActivos) {
        this.flagPrestamosActivos = flagPrestamosActivos;
    }

    public Boolean getFlagMoroso() {
        return flagMoroso;
    }

    public void setFlagMoroso(Boolean flagMoroso) {
        this.flagMoroso = flagMoroso;
    }

    public SunatPlameTipoDocumentoid getCodtipodocumentoid() {
        return codtipodocumentoid;
    }

    public void setCodtipodocumentoid(SunatPlameTipoDocumentoid codtipodocumentoid) {
        this.codtipodocumentoid = codtipodocumentoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcliente != null ? codcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.codcliente == null && other.codcliente != null) || (this.codcliente != null && !this.codcliente.equals(other.codcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Clientes[ codcliente=" + codcliente + " ]";
    }
    
}
