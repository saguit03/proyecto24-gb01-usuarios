package es.unex.asee.gb01.contents.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "ver_mas_tarde")
public class VerMasTardeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ver_mas_tarde")
    private Long idVerMasTarde;

    @NotNull
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    @NotNull
    @Column(name = "id_contenido", nullable = false)
    private Long idContenido;

    // Constructor sin argumentos
    public VerMasTardeEntity() {}

    // Constructor con argumentos
    public VerMasTardeEntity(Long idUser, Long idContenido) {
        this.idUser = idUser;
        this.idContenido = idContenido;
    }

    // Getters y Setters
    public Long getIdVerMasTarde() {
        return idVerMasTarde;
    }

    public void setIdVerMasTarde(Long idVerMasTarde) {
        this.idVerMasTarde = idVerMasTarde;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(Long idContenido) {
        this.idContenido = idContenido;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerMasTardeEntity that = (VerMasTardeEntity) o;
        return Objects.equals(idUser, that.idUser) &&
               Objects.equals(idContenido, that.idContenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idContenido);
    }

    // Método toString
    @Override
    public String toString() {
        return "VerMasTardeEntity{" +
                "idVerMasTarde=" + idVerMasTarde +
                ", idUser=" + idUser +
                ", idContenido=" + idContenido +
                '}';
    }
}

