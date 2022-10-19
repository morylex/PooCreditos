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
@Table(name = "tipo_usuario", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t"),
    @NamedQuery(name = "TipoUsuario.findByCodtipousuario", query = "SELECT t FROM TipoUsuario t WHERE t.codtipousuario = :codtipousuario"),
    @NamedQuery(name = "TipoUsuario.findByDenominacion", query = "SELECT t FROM TipoUsuario t WHERE t.denominacion = :denominacion"),
    @NamedQuery(name = "TipoUsuario.findByNivel", query = "SELECT t FROM TipoUsuario t WHERE t.nivel = :nivel"),
    @NamedQuery(name = "TipoUsuario.findByCondicion", query = "SELECT t FROM TipoUsuario t WHERE t.condicion = :condicion"),
    @NamedQuery(name = "TipoUsuario.findByEstado", query = "SELECT t FROM TipoUsuario t WHERE t.estado = :estado"),
    @NamedQuery(name = "TipoUsuario.findByFechareg", query = "SELECT t FROM TipoUsuario t WHERE t.fechareg = :fechareg")})
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codtipousuario")
    private Integer codtipousuario;
    @Size(max = 50)
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "nivel")
    private Boolean nivel;
    @Column(name = "condicion")
    private Boolean condicion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fechareg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @OneToMany(mappedBy = "codtipousuario")
    private List<Usuarios> usuariosList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer codtipousuario) {
        this.codtipousuario = codtipousuario;
    }

    public Integer getCodtipousuario() {
        return codtipousuario;
    }

    public void setCodtipousuario(Integer codtipousuario) {
        this.codtipousuario = codtipousuario;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Boolean getNivel() {
        return nivel;
    }

    public void setNivel(Boolean nivel) {
        this.nivel = nivel;
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

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipousuario != null ? codtipousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.codtipousuario == null && other.codtipousuario != null) || (this.codtipousuario != null && !this.codtipousuario.equals(other.codtipousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoUsuario[ codtipousuario=" + codtipousuario + " ]";
    }
    
}
