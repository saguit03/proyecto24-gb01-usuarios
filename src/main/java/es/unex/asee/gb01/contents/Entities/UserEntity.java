package es.unex.asee.gb01.contents.Entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

// import es.unex.asee.gb01.contents.Entities.Language;
// import es.unex.asee.gb01.contents.Entities.PerfilUsuario;
// import es.unex.asee.gb01.contents.Entities.TarjetaCredito;

@Entity
@Table(name = "Usuario")
public class UserEntity{
    @Id
    @GeneratedValue
    private Long id = null;

    private String nombre = null;

    private String apellidos = null;
    @Column(unique = true) // Hace que el email sea único en la tabla
    private String username = null;
    @Column(unique = true) // Hace que el email sea único en la tabla
    private String email = null;

    private String password = null;

    private String fechaAltaReciente = null;

    private String fotoPerfil = null;

    private String fechaRegistro = null;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "perfiles_usuario")
    private List<PerfilUsuarioEntity> perfilesUsuario = null;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "credits_cards")
    private List<TarjetaCreditoEntity> tarjetasDeCredito = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_user")
    private LanguageEntity idioma = null;

    public UserEntity( ){
        // this.nombre = nombre;
        // this.apellidos = apellidos;
        // this.username= username;
        // this.email = email;
        // this.password = password;

    }
    public UserEntity( String nombre, String apellidos, String username, String email, String password){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username= username;
        this.email = email;
        this.password = password;

    }

    public String getFechaAltaReciente() {
        return fechaAltaReciente;
    }

    public void setFechaAltaReciente(String fechaAltaReciente) {
        this.fechaAltaReciente = fechaAltaReciente;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<PerfilUsuarioEntity> getPerfilesUsuario() {
        return perfilesUsuario;
    }

    public void setPerfilesUsuario(List<PerfilUsuarioEntity> perfilesUsuario) {
        this.perfilesUsuario = perfilesUsuario;
    }

    public List<TarjetaCreditoEntity> getTarjetasDeCredito() {
        return tarjetasDeCredito;
    }

    public void setTarjetasDeCredito(List<TarjetaCreditoEntity> tarjetasDeCredito) {
        this.tarjetasDeCredito = tarjetasDeCredito;
    }

    public LanguageEntity getIdioma() {
        return idioma;
    }

    public void setIdioma(LanguageEntity idioma) {
        this.idioma = idioma;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
