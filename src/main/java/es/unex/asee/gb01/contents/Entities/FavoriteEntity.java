package es.unex.asee.gb01.contents.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "favorites")
public class FavoriteEntity {
    @Id
    @GeneratedValue
    private Long idFavorite;

    
    @Column(name = "idUser", nullable = false)
    private Long idUser;

    
    @Column(name = "idContent", nullable = false)
    private Long idContent;

    // Constructor sin argumentos
    public FavoriteEntity() {}

    // Constructor con argumentos
    public FavoriteEntity(Long idUser, Long idContent) {
        this.idUser = idUser;
        this.idContent = idContent;
    }

    // Getters y Setters
    public Long getIdFavorite() {
        return idFavorite;
    }

    public void setIdFavorite(Long idFavorite) {
        this.idFavorite = idFavorite;
    }

    public Long getidUser() {
        return idUser;
    }

    public void setidUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getidContent() {
        return idContent;
    }

    public void setidContent(Long idContent) {
        this.idContent = idContent;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteEntity that = (FavoriteEntity) o;
        return Objects.equals(idUser, that.idUser) &&
               Objects.equals(idContent, that.idContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idContent);
    }

    // Método toString
    @Override
    public String toString() {
        return "FavoriteEntity{" +
                "idFavorite=" + idFavorite +
                ", idUser=" + idUser +
                ", idContent=" + idContent +
                '}';
    }
}

