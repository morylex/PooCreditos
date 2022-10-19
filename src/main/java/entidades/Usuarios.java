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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "usuarios", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByCodusuario", query = "SELECT u FROM Usuarios u WHERE u.codusuario = :codusuario"),
    @NamedQuery(name = "Usuarios.findByCondicion", query = "SELECT u FROM Usuarios u WHERE u.condicion = :condicion"),
    @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado"),
    @NamedQuery(name = "Usuarios.findByLastfechaupdate", query = "SELECT u FROM Usuarios u WHERE u.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Usuarios.findByFechareg", query = "SELECT u FROM Usuarios u WHERE u.fechareg = :fechareg")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codusuario")
    private Integer codusuario;
    @Lob
    @Column(name = "usuario")
    private byte[] usuario;
    @Lob
    @Column(name = "contrasena")
    private byte[] contrasena;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "lastfechaupdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastfechaupdate;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @OneToMany(mappedBy = "codusuario")
    private List<SunatPlameTipoDocumentoid> sunatPlameTipoDocumentoidList;
    @JoinColumn(name = "codtipousuario", referencedColumnName = "codtipousuario")
    @ManyToOne
    private TipoUsuario codtipousuario;

    public Usuarios() {
    }

    public Usuarios(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public byte[] getUsuario() {
        return usuario;
    }

    public void setUsuario(byte[] usuario) {
        this.usuario = usuario;
    }

    public byte[] getContrasena() {
        return contrasena;
    }

    public void setContrasena(byte[] contrasena) {
        this.contrasena = contrasena;
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

    public Date getLastfechaupdate() {
        return lastfechaupdate;
    }

    public void setLastfechaupdate(Date lastfechaupdate) {
        this.lastfechaupdate = lastfechaupdate;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    @XmlTransient
    public List<SunatPlameTipoDocumentoid> getSunatPlameTipoDocumentoidList() {
        return sunatPlameTipoDocumentoidList;
    }

    public void setSunatPlameTipoDocumentoidList(List<SunatPlameTipoDocumentoid> sunatPlameTipoDocumentoidList) {
        this.sunatPlameTipoDocumentoidList = sunatPlameTipoDocumentoidList;
    }

    public TipoUsuario getCodtipousuario() {
        return codtipousuario;
    }

    public void setCodtipousuario(TipoUsuario codtipousuario) {
        this.codtipousuario = codtipousuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codusuario != null ? codusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.codusuario == null && other.codusuario != null) || (this.codusuario != null && !this.codusuario.equals(other.codusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuarios[ codusuario=" + codusuario + " ]";
    }
    
}
