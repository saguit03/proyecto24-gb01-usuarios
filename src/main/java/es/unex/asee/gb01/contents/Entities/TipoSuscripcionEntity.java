package es.unex.asee.gb01.contents.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tipo_suscripcion")
public class TipoSuscripcionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_suscripcion")
    private Long idTipoSuscripcion;

    @NotNull
    @Column(name = "nombre_tipo_suscripcion", nullable = false)
    private String nombreTipoSuscripcion;

    @NotNull
    @Column(name = "cantidad", nullable = false)
    private Float cantidad;

    public TipoSuscripcionEntity() {

    }

    public TipoSuscripcionEntity(Long idTipoSuscripcion, String nombreTipoSuscripcion, Float cantidad) {
        this.idTipoSuscripcion = idTipoSuscripcion;
        this.nombreTipoSuscripcion = nombreTipoSuscripcion;
        this.cantidad = cantidad;
    }

    public TipoSuscripcionEntity(String nombreTipoSuscripcion, Float cantidad) {
        this.nombreTipoSuscripcion = nombreTipoSuscripcion;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public Long getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    public void setIdTipoSuscripcion(Long idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    public String getNombreTipoSuscripcion() {
        return nombreTipoSuscripcion;
    }

    public void setNombreTipoSuscripcion(String nombreTipoSuscripcion) {
        this.nombreTipoSuscripcion = nombreTipoSuscripcion;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     TipoSuscripcionEntity that = (TipoSuscripcionEntity) o;
    //     return Object.equals(idTipoSuscripcion, that.idTipoSuscripcion) &&
    //            Object.equals(nombreTipoSuscripcion, that.nombreTipoSuscripcion) &&
    //            Object.equals(cantidad, that.cantidad);
               
    // }

    // @Override
    // public int hashCode() {
    //     return Object.hash(idTipoSuscripcion, nombreTipoSuscripcion, cantidad);
    // }

    // @Override
    // public String toString() {
    //     return "TipoSuscripcionEntity{" +
    //            "idTipoSuscripcion=" + idTipoSuscripcion +
    //            ", nombreTipoSuscripcion='" + nombreTipoSuscripcion + '\'' +
    //            ", cantidad=" + cantidad +
    //            '}';
    // }
}
