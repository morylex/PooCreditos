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
@Table(name = "creditos", catalog = "curso_poo_creditos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditos.findAll", query = "SELECT c FROM Creditos c"),
    @NamedQuery(name = "Creditos.findByCodcredito", query = "SELECT c FROM Creditos c WHERE c.codcredito = :codcredito"),
    @NamedQuery(name = "Creditos.findByCodestablecimiento", query = "SELECT c FROM Creditos c WHERE c.codestablecimiento = :codestablecimiento"),
    @NamedQuery(name = "Creditos.findByCodperiodocontable", query = "SELECT c FROM Creditos c WHERE c.codperiodocontable = :codperiodocontable"),
    @NamedQuery(name = "Creditos.findByCodcliente", query = "SELECT c FROM Creditos c WHERE c.codcliente = :codcliente"),
    @NamedQuery(name = "Creditos.findByCodcartera", query = "SELECT c FROM Creditos c WHERE c.codcartera = :codcartera"),
    @NamedQuery(name = "Creditos.findByCodtipocredito", query = "SELECT c FROM Creditos c WHERE c.codtipocredito = :codtipocredito"),
    @NamedQuery(name = "Creditos.findByCodtasa", query = "SELECT c FROM Creditos c WHERE c.codtasa = :codtasa"),
    @NamedQuery(name = "Creditos.findByFactorTasa", query = "SELECT c FROM Creditos c WHERE c.factorTasa = :factorTasa"),
    @NamedQuery(name = "Creditos.findByCodtiempo", query = "SELECT c FROM Creditos c WHERE c.codtiempo = :codtiempo"),
    @NamedQuery(name = "Creditos.findByDuracionDias", query = "SELECT c FROM Creditos c WHERE c.duracionDias = :duracionDias"),
    @NamedQuery(name = "Creditos.findByImportePrestado", query = "SELECT c FROM Creditos c WHERE c.importePrestado = :importePrestado"),
    @NamedQuery(name = "Creditos.findByImporteDevolver", query = "SELECT c FROM Creditos c WHERE c.importeDevolver = :importeDevolver"),
    @NamedQuery(name = "Creditos.findByImporteIntereses", query = "SELECT c FROM Creditos c WHERE c.importeIntereses = :importeIntereses"),
    @NamedQuery(name = "Creditos.findByImporteCuota", query = "SELECT c FROM Creditos c WHERE c.importeCuota = :importeCuota"),
    @NamedQuery(name = "Creditos.findByCuotaInicial", query = "SELECT c FROM Creditos c WHERE c.cuotaInicial = :cuotaInicial"),
    @NamedQuery(name = "Creditos.findByImporteAbonado", query = "SELECT c FROM Creditos c WHERE c.importeAbonado = :importeAbonado"),
    @NamedQuery(name = "Creditos.findByImportePendiente", query = "SELECT c FROM Creditos c WHERE c.importePendiente = :importePendiente"),
    @NamedQuery(name = "Creditos.findByFechaEntrega", query = "SELECT c FROM Creditos c WHERE c.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "Creditos.findByFechaInicioPago", query = "SELECT c FROM Creditos c WHERE c.fechaInicioPago = :fechaInicioPago"),
    @NamedQuery(name = "Creditos.findByFechaVencimiento", query = "SELECT c FROM Creditos c WHERE c.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Creditos.findByFechaTermino", query = "SELECT c FROM Creditos c WHERE c.fechaTermino = :fechaTermino"),
    @NamedQuery(name = "Creditos.findByLastcodusuario", query = "SELECT c FROM Creditos c WHERE c.lastcodusuario = :lastcodusuario"),
    @NamedQuery(name = "Creditos.findByLastfechaupdate", query = "SELECT c FROM Creditos c WHERE c.lastfechaupdate = :lastfechaupdate"),
    @NamedQuery(name = "Creditos.findByCodusuario", query = "SELECT c FROM Creditos c WHERE c.codusuario = :codusuario"),
    @NamedQuery(name = "Creditos.findByCondicion", query = "SELECT c FROM Creditos c WHERE c.condicion = :condicion"),
    @NamedQuery(name = "Creditos.findByEstado", query = "SELECT c FROM Creditos c WHERE c.estado = :estado"),
    @NamedQuery(name = "Creditos.findByFechareg", query = "SELECT c FROM Creditos c WHERE c.fechareg = :fechareg"),
    @NamedQuery(name = "Creditos.findByFlagTerminado", query = "SELECT c FROM Creditos c WHERE c.flagTerminado = :flagTerminado"),
    @NamedQuery(name = "Creditos.findByFechaFinalizado", query = "SELECT c FROM Creditos c WHERE c.fechaFinalizado = :fechaFinalizado"),
    @NamedQuery(name = "Creditos.findByFlagRefinanciado", query = "SELECT c FROM Creditos c WHERE c.flagRefinanciado = :flagRefinanciado"),
    @NamedQuery(name = "Creditos.findByFlagLiquidado", query = "SELECT c FROM Creditos c WHERE c.flagLiquidado = :flagLiquidado"),
    @NamedQuery(name = "Creditos.findByFlagCobracartera", query = "SELECT c FROM Creditos c WHERE c.flagCobracartera = :flagCobracartera"),
    @NamedQuery(name = "Creditos.findByCodcobracartera", query = "SELECT c FROM Creditos c WHERE c.codcobracartera = :codcobracartera"),
    @NamedQuery(name = "Creditos.findByImporteExcedente", query = "SELECT c FROM Creditos c WHERE c.importeExcedente = :importeExcedente"),
    @NamedQuery(name = "Creditos.findByFlagObservado", query = "SELECT c FROM Creditos c WHERE c.flagObservado = :flagObservado"),
    @NamedQuery(name = "Creditos.findByEstadoRefinanciado", query = "SELECT c FROM Creditos c WHERE c.estadoRefinanciado = :estadoRefinanciado"),
    @NamedQuery(name = "Creditos.findByDiasFeriados", query = "SELECT c FROM Creditos c WHERE c.diasFeriados = :diasFeriados"),
    @NamedQuery(name = "Creditos.findByDiasRetrasos", query = "SELECT c FROM Creditos c WHERE c.diasRetrasos = :diasRetrasos")})
public class Creditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codcredito")
    private Integer codcredito;
    @Column(name = "codestablecimiento")
    private Integer codestablecimiento;
    @Column(name = "codperiodocontable")
    private Integer codperiodocontable;
    @Column(name = "codcliente")
    private Integer codcliente;
    @Column(name = "codcartera")
    private Integer codcartera;
    @Column(name = "codtipocredito")
    private Integer codtipocredito;
    @Column(name = "codtasa")
    private Integer codtasa;
    @Column(name = "factor_tasa")
    private Integer factorTasa;
    @Column(name = "codtiempo")
    private Integer codtiempo;
    @Column(name = "duracion_dias")
    private Integer duracionDias;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe_prestado")
    private BigDecimal importePrestado;
    @Column(name = "importe_devolver")
    private BigDecimal importeDevolver;
    @Column(name = "importe_intereses")
    private BigDecimal importeIntereses;
    @Column(name = "importe_cuota")
    private BigDecimal importeCuota;
    @Column(name = "cuota_inicial")
    private BigDecimal cuotaInicial;
    @Column(name = "importe_abonado")
    private BigDecimal importeAbonado;
    @Column(name = "importe_pendiente")
    private BigDecimal importePendiente;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "fecha_inicio_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioPago;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "fecha_termino")
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;
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
    @Column(name = "flag_terminado")
    private Boolean flagTerminado;
    @Column(name = "fecha_finalizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizado;
    @Column(name = "flag_refinanciado")
    private Boolean flagRefinanciado;
    @Column(name = "flag_liquidado")
    private Boolean flagLiquidado;
    @Column(name = "flag_cobracartera")
    private Boolean flagCobracartera;
    @Column(name = "codcobracartera")
    private Integer codcobracartera;
    @Column(name = "importe_excedente")
    private BigDecimal importeExcedente;
    @Column(name = "flag_observado")
    private Boolean flagObservado;
    @Column(name = "estado_refinanciado")
    private Boolean estadoRefinanciado;
    @Column(name = "dias_feriados")
    private Integer diasFeriados;
    @Column(name = "dias_retrasos")
    private Integer diasRetrasos;

    public Creditos() {
    }

    public Creditos(Integer codcredito) {
        this.codcredito = codcredito;
    }

    public Integer getCodcredito() {
        return codcredito;
    }

    public void setCodcredito(Integer codcredito) {
        this.codcredito = codcredito;
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

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Integer getCodcartera() {
        return codcartera;
    }

    public void setCodcartera(Integer codcartera) {
        this.codcartera = codcartera;
    }

    public Integer getCodtipocredito() {
        return codtipocredito;
    }

    public void setCodtipocredito(Integer codtipocredito) {
        this.codtipocredito = codtipocredito;
    }

    public Integer getCodtasa() {
        return codtasa;
    }

    public void setCodtasa(Integer codtasa) {
        this.codtasa = codtasa;
    }

    public Integer getFactorTasa() {
        return factorTasa;
    }

    public void setFactorTasa(Integer factorTasa) {
        this.factorTasa = factorTasa;
    }

    public Integer getCodtiempo() {
        return codtiempo;
    }

    public void setCodtiempo(Integer codtiempo) {
        this.codtiempo = codtiempo;
    }

    public Integer getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(Integer duracionDias) {
        this.duracionDias = duracionDias;
    }

    public BigDecimal getImportePrestado() {
        return importePrestado;
    }

    public void setImportePrestado(BigDecimal importePrestado) {
        this.importePrestado = importePrestado;
    }

    public BigDecimal getImporteDevolver() {
        return importeDevolver;
    }

    public void setImporteDevolver(BigDecimal importeDevolver) {
        this.importeDevolver = importeDevolver;
    }

    public BigDecimal getImporteIntereses() {
        return importeIntereses;
    }

    public void setImporteIntereses(BigDecimal importeIntereses) {
        this.importeIntereses = importeIntereses;
    }

    public BigDecimal getImporteCuota() {
        return importeCuota;
    }

    public void setImporteCuota(BigDecimal importeCuota) {
        this.importeCuota = importeCuota;
    }

    public BigDecimal getCuotaInicial() {
        return cuotaInicial;
    }

    public void setCuotaInicial(BigDecimal cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }

    public BigDecimal getImporteAbonado() {
        return importeAbonado;
    }

    public void setImporteAbonado(BigDecimal importeAbonado) {
        this.importeAbonado = importeAbonado;
    }

    public BigDecimal getImportePendiente() {
        return importePendiente;
    }

    public void setImportePendiente(BigDecimal importePendiente) {
        this.importePendiente = importePendiente;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaInicioPago() {
        return fechaInicioPago;
    }

    public void setFechaInicioPago(Date fechaInicioPago) {
        this.fechaInicioPago = fechaInicioPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
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

    public Boolean getFlagTerminado() {
        return flagTerminado;
    }

    public void setFlagTerminado(Boolean flagTerminado) {
        this.flagTerminado = flagTerminado;
    }

    public Date getFechaFinalizado() {
        return fechaFinalizado;
    }

    public void setFechaFinalizado(Date fechaFinalizado) {
        this.fechaFinalizado = fechaFinalizado;
    }

    public Boolean getFlagRefinanciado() {
        return flagRefinanciado;
    }

    public void setFlagRefinanciado(Boolean flagRefinanciado) {
        this.flagRefinanciado = flagRefinanciado;
    }

    public Boolean getFlagLiquidado() {
        return flagLiquidado;
    }

    public void setFlagLiquidado(Boolean flagLiquidado) {
        this.flagLiquidado = flagLiquidado;
    }

    public Boolean getFlagCobracartera() {
        return flagCobracartera;
    }

    public void setFlagCobracartera(Boolean flagCobracartera) {
        this.flagCobracartera = flagCobracartera;
    }

    public Integer getCodcobracartera() {
        return codcobracartera;
    }

    public void setCodcobracartera(Integer codcobracartera) {
        this.codcobracartera = codcobracartera;
    }

    public BigDecimal getImporteExcedente() {
        return importeExcedente;
    }

    public void setImporteExcedente(BigDecimal importeExcedente) {
        this.importeExcedente = importeExcedente;
    }

    public Boolean getFlagObservado() {
        return flagObservado;
    }

    public void setFlagObservado(Boolean flagObservado) {
        this.flagObservado = flagObservado;
    }

    public Boolean getEstadoRefinanciado() {
        return estadoRefinanciado;
    }

    public void setEstadoRefinanciado(Boolean estadoRefinanciado) {
        this.estadoRefinanciado = estadoRefinanciado;
    }

    public Integer getDiasFeriados() {
        return diasFeriados;
    }

    public void setDiasFeriados(Integer diasFeriados) {
        this.diasFeriados = diasFeriados;
    }

    public Integer getDiasRetrasos() {
        return diasRetrasos;
    }

    public void setDiasRetrasos(Integer diasRetrasos) {
        this.diasRetrasos = diasRetrasos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcredito != null ? codcredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditos)) {
            return false;
        }
        Creditos other = (Creditos) object;
        if ((this.codcredito == null && other.codcredito != null) || (this.codcredito != null && !this.codcredito.equals(other.codcredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Creditos[ codcredito=" + codcredito + " ]";
    }
    
}
