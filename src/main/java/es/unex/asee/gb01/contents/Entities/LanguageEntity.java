package es.unex.asee.gb01.contents.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "language")
public class LanguageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    // Constructor sin argumentos
    public LanguageEntity() {}

    // Constructor con argumentos
    public LanguageEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos equals y hashCode
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     LanguageEntity that = (LanguageEntity) o;
    //     return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, name);
    // }

    // // Método toString
    // @Override
    // public String toString() {
    //     return "LanguageEntity{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             '}';
    // }
}

