package es.unex.asee.gb01.contents.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "favoritos")
public class FavoritosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorito")
    private Long idFavorito;

    @NotNull
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    @NotNull
    @Column(name = "id_contenido", nullable = false)
    private Long idContenido;

    // Constructor sin argumentos
    public FavoritosEntity() {}

    // Constructor con argumentos
    public FavoritosEntity(Long idUser, Long idContenido) {
        this.idUser = idUser;
        this.idContenido = idContenido;
    }

    // Getters y Setters
    public Long getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Long idFavorito) {
        this.idFavorito = idFavorito;
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
        FavoritosEntity that = (FavoritosEntity) o;
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
        return "FavoritosEntity{" +
                "idFavorito=" + idFavorito +
                ", idUser=" + idUser +
                ", idContenido=" + idContenido +
                '}';
    }
}

