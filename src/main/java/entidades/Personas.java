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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "personas", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByCodpersona", query = "SELECT p FROM Personas p WHERE p.codpersona = :codpersona"),
    @NamedQuery(name = "Personas.findByCodestablecimiento", query = "SELECT p FROM Personas p WHERE p.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Personas.findByCodtipopersona", query = "SELECT p FROM Personas p WHERE p.codtipopersona = :codtipopersona"),
    @NamedQuery(name = "Personas.findByCodtipodocumentoid", query = "SELECT p FROM Personas p WHERE p.codtipodocumentoid = :codtipodocumentoid"),
    @NamedQuery(name = "Personas.findByNumeroDocumento", query = "SELECT p FROM Personas p WHERE p.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Personas.findByApellidoPaterno", query = "SELECT p FROM Personas p WHERE p.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Personas.findByApellidoMaterno", query = "SELECT p FROM Personas p WHERE p.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Personas.findByNombres", query = "SELECT p FROM Personas p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Personas.findByNombreCompleto", query = "SELECT p FROM Personas p WHERE p.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Personas.findByDireccion", query = "SELECT p FROM Personas p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Personas.findByEmail", query = "SELECT p FROM Personas p WHERE p.email = :email"),
    @NamedQuery(name = "Personas.findByTelefono", query = "SELECT p FROM Personas p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Personas.findByRemuneracion", query = "SELECT p FROM Personas p WHERE p.remuneracion = :remuneracion"),
    @NamedQuery(name = "Personas.findByLastcodusuario", query = "SELECT p FROM Personas p WHERE p.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Personas.findByLastfechaupdate", query = "SELECT p FROM Personas p WHERE p.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Personas.findByCodusuario", query = "SELECT p FROM Personas p WHERE p.codusuario = :codusuario"),
    @NamedQuery(name = "Personas.findByCondicion", query = "SELECT p FROM Personas p WHERE p.condicion = :condicion"),
    @NamedQuery(name = "Personas.findByEstado", query = "SELECT p FROM Personas p WHERE p.estado = :estado"),
    @NamedQuery(name = "Personas.findByFechareg", query = "SELECT p FROM Personas p WHERE p.fechareg = :fechareg"),
    @NamedQuery(name = "Personas.findByFlagPrestamosActivos", query = "SELECT p FROM Personas p WHERE p.flagPrestamosActivos = :flagPrestamosActivos")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codpersona")
    private Integer codpersona;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codtipopersona")
    private Integer codtipopersona;
    @Column(name = "codtipodocumentoid")
    private Integer codtipodocumentoid;
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
    @Size(max = 300)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Size(max = 500)
    @Column(name = "direccion")
    private String direccion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "remuneracion")
    private BigDecimal remuneracion;
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
    @Column(name = "flag_prestamos_activos")
    private Boolean flagPrestamosActivos;

    public Personas() {
    }

    public Personas(Integer codpersona) {
        this.codpersona = codpersona;
    }

    public Integer getCodpersona() {
        return codpersona;
    }

    public void setCodpersona(Integer codpersona) {
        this.codpersona = codpersona;
    }

    public Integer getCodestablecimiento() {
        return codestablecimiento;
    }

    public void setCodestablecimiento(Integer codestablecimiento) {
        this.codestablecimiento = codestablecimiento;
    }

    public Integer getCodtipopersona() {
        return codtipopersona;
    }

    public void setCodtipopersona(Integer codtipopersona) {
        this.codtipopersona = codtipopersona;
    }

    public Integer getCodtipodocumentoid() {
        return codtipodocumentoid;
    }

    public void setCodtipodocumentoid(Integer codtipodocumentoid) {
        this.codtipodocumentoid = codtipodocumentoid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(BigDecimal remuneracion) {
        this.remuneracion = remuneracion;
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

    public Boolean getFlagPrestamosActivos() {
        return flagPrestamosActivos;
    }

    public void setFlagPrestamosActivos(Boolean flagPrestamosActivos) {
        this.flagPrestamosActivos = flagPrestamosActivos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpersona != null ? codpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.codpersona == null && other.codpersona != null) || (this.codpersona != null && !this.codpersona.equals(other.codpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Personas[ codpersona=" + codpersona + " ]";
    }
    
}
