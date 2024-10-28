package es.unex.asee.gb01.contents.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "historial")
public class HistorialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visualizacion")
    private Long idVisualizacion;

    @NotNull
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    // Constructor sin argumentos
    public HistorialEntity() {}

    // Constructor con argumentos
    public HistorialEntity(Long idUser, Long idVisualizacion) {
        this.idUser = idUser;
        this.idVisualizacion = idVisualizacion;
    }

    // Getters y Setters
    public Long getIdVisualizacion() {
        return idVisualizacion;
    }

    public void setIdVisualizacion(Long idVisualizacion) {
        this.idVisualizacion = idVisualizacion;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistorialEntity that = (HistorialEntity) o;
        return Objects.equals(idUser, that.idUser) &&
               Objects.equals(idVisualizacion, that.idVisualizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idVisualizacion);
    }

    // Método toString
    @Override
    public String toString() {
        return "HistorialEntity{" +
                "idUser=" + idUser +
                ", idVisualizacion=" + idVisualizacion +
                '}';
    }
}
