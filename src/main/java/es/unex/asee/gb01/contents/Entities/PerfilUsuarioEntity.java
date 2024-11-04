package es.unex.asee.gb01.contents.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "perfil_usuario")
public class PerfilUsuarioEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_perfil")
    private Long idPerfil;

    @NotNull
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @NotNull
    @Column(name = "nombre_perfil", nullable = false)
    private String nombrePerfil;

    @NotNull
    @Column(name = "pin", nullable = false)
    private String pin;

    public PerfilUsuarioEntity(){
        // this.idUsuario = 0;
        this.nombrePerfil = "";
        this.pin = "";
    }
    public PerfilUsuarioEntity(Long idUsuario, String nombrePerfil, String pin){
        this.idUsuario = idUsuario;
        this.nombrePerfil = nombrePerfil;
        this.pin = pin;
    }

    // Getters y Setters

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     PerfilUsuarioEntity that = (PerfilUsuarioEntity) o;
    //     return Objects.equals(idPerfil, that.idPerfil) &&
    //            Objects.equals(idUsuario, that.idUsuario) &&
    //            Objects.equals(nombrePerfil, that.nombrePerfil) &&
    //            Objects.equals(pin, that.pin);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(idPerfil, idUsuario, nombrePerfil, pin);
    // }

    // @Override
    // public String toString() {
    //     return "PerfilUsuarioEntity{" +
    //            "idPerfil=" + idPerfil +
    //            ", idUsuario=" + idUsuario +
    //            ", nombrePerfil='" + nombrePerfil + '\'' +
    //            ", pin='" + pin + '\'' +
    //            '}';
    // }
}

