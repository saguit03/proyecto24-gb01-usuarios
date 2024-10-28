package es.unex.asee.gb01.contents.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "suscripcion")
public class SuscripcionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suscripcion")
    private Long idSuscripcion;

    @NotNull
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_suscripcion", nullable = false)
    private TipoSuscripcionEntity tipoSuscripcion;

    @NotNull
    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta;

    @Column(name = "fecha_baja")
    private LocalDate fechaBaja;

    // Getters y Setters

    public Long getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(Long idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoSuscripcionEntity getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(TipoSuscripcionEntity tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     SuscripcionEntity that = (SuscripcionEntity) o;
    //     return Object.equals(idSuscripcion, that.idSuscripcion) &&
    //            Object.equals(idUsuario, that.idUsuario) &&
    //            Object.equals(tipoSuscripcion, that.tipoSuscripcion) &&
    //            Object.equals(fechaAlta, that.fechaAlta) &&
    //            Object.equals(fechaBaja, that.fechaBaja);
    // }

    // @Override
    // public int hashCode() {
    //     return Object.hash(idSuscripcion, idUsuario, tipoSuscripcion, fechaAlta, fechaBaja);
    // }

    // @Override
    // public String toString() {
    //     return "SuscripcionEntity{" +
    //            "idSuscripcion=" + idSuscripcion +
    //            ", idUsuario=" + idUsuario +
    //            ", tipoSuscripcion=" + tipoSuscripcion +
    //            ", fechaAlta=" + fechaAlta +
    //            ", fechaBaja=" + fechaBaja +
    //            '}';
    // }
}
