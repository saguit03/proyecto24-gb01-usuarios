package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.unex.swagger.model.Language;
import es.unex.swagger.model.PerfilUsuario;
import es.unex.swagger.model.TarjetaCredito;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import es.unex.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class User   {
  @JsonProperty("id")

  private Long id = null;

  @JsonProperty("Nombre")

  private String nombre = null;

  @JsonProperty("Apellidos")

  private String apellidos = null;

  @JsonProperty("Username")

  private String username = null;

  @JsonProperty("Email")

  private String email = null;

  @JsonProperty("Password")

  private String password = null;

  @JsonProperty("Fecha_alta_reciente")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String fechaAltaReciente = null;

  @JsonProperty("Foto_perfil")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String fotoPerfil = null;

  @JsonProperty("Fecha_registro")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String fechaRegistro = null;

  @JsonProperty("Perfiles-usuario")
  @Valid
  private List<PerfilUsuario> perfilesUsuario = null;
  @JsonProperty("Tarjetas-de-credito")
  @Valid
  private List<TarjetaCredito> tarjetasDeCredito = null;
  @JsonProperty("Idioma")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Language idioma = null;

public User(){
    
  }

  public User(String username, String password){
    this.username = username;
    this.password = password;
  }

  public User id(Long id) { 

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  @Schema(example = "1", required = true, description = "")
  
  @NotNull
  public Long getId() {  
    return id;
  }



  public void setId(Long id) { 

    this.id = id;
  }

  public User nombre(String nombre) { 

    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  
  @Schema(example = "Pablo", required = true, description = "")
  
  @NotNull
  public String getNombre() {  
    return nombre;
  }



  public void setNombre(String nombre) { 

    this.nombre = nombre;
  }

  public User apellidos(String apellidos) { 

    this.apellidos = apellidos;
    return this;
  }

  /**
   * Get apellidos
   * @return apellidos
   **/
  
  @Schema(example = "Fernandez", required = true, description = "")
  
  @NotNull
  public String getApellidos() {  
    return apellidos;
  }



  public void setApellidos(String apellidos) { 

    this.apellidos = apellidos;
  }

  public User username(String username) { 

    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  
  @Schema(example = "pafernandez", required = true, description = "")
  
  @NotNull
  public String getUsername() {  
    return username;
  }



  public void setUsername(String username) { 

    this.username = username;
  }

  public User email(String email) { 

    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  
  @Schema(example = "pafernandez@gmail.com", required = true, description = "")
  
  @NotNull
  public String getEmail() {  
    return email;
  }



  public void setEmail(String email) { 

    this.email = email;
  }

  public User password(String password) { 

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  
  @Schema(example = "pafernandez", required = true, description = "")
  
  @NotNull
  public String getPassword() {  
    return password;
  }



  public void setPassword(String password) { 

    this.password = password;
  }

  public User fechaAltaReciente(String fechaAltaReciente) { 

    this.fechaAltaReciente = fechaAltaReciente;
    return this;
  }

  /**
   * Get fechaAltaReciente
   * @return fechaAltaReciente
   **/
  
  @Schema(example = "8/9/2024", description = "")
  
  public String getFechaAltaReciente() {  
    return fechaAltaReciente;
  }



  public void setFechaAltaReciente(String fechaAltaReciente) { 
    this.fechaAltaReciente = fechaAltaReciente;
  }

  public User fotoPerfil(String fotoPerfil) { 

    this.fotoPerfil = fotoPerfil;
    return this;
  }

  /**
   * Get fotoPerfil
   * @return fotoPerfil
   **/
  
  @Schema(example = "foto_perfil.png", description = "")
  
  public String getFotoPerfil() {  
    return fotoPerfil;
  }



  public void setFotoPerfil(String fotoPerfil) { 
    this.fotoPerfil = fotoPerfil;
  }

  public User fechaRegistro(String fechaRegistro) { 

    this.fechaRegistro = fechaRegistro;
    return this;
  }

  /**
   * Get fechaRegistro
   * @return fechaRegistro
   **/
  
  @Schema(example = "01/01/2020", description = "")
  
  public String getFechaRegistro() {  
    return fechaRegistro;
  }



  public void setFechaRegistro(String fechaRegistro) { 
    this.fechaRegistro = fechaRegistro;
  }

  public User perfilesUsuario(List<PerfilUsuario> perfilesUsuario) { 

    this.perfilesUsuario = perfilesUsuario;
    return this;
  }

  public User addPerfilesUsuarioItem(PerfilUsuario perfilesUsuarioItem) {
    if (this.perfilesUsuario == null) {
      this.perfilesUsuario = new ArrayList<PerfilUsuario>();
    }
    this.perfilesUsuario.add(perfilesUsuarioItem);
    return this;
  }

  /**
   * Get perfilesUsuario
   * @return perfilesUsuario
   **/
  
  @Schema(description = "")
  @Valid
@Size(min=1)   public List<PerfilUsuario> getPerfilesUsuario() {  
    return perfilesUsuario;
  }



  public void setPerfilesUsuario(List<PerfilUsuario> perfilesUsuario) { 
    this.perfilesUsuario = perfilesUsuario;
  }

  public User tarjetasDeCredito(List<TarjetaCredito> tarjetasDeCredito) { 

    this.tarjetasDeCredito = tarjetasDeCredito;
    return this;
  }

  public User addTarjetasDeCreditoItem(TarjetaCredito tarjetasDeCreditoItem) {
    if (this.tarjetasDeCredito == null) {
      this.tarjetasDeCredito = new ArrayList<TarjetaCredito>();
    }
    this.tarjetasDeCredito.add(tarjetasDeCreditoItem);
    return this;
  }

  /**
   * Get tarjetasDeCredito
   * @return tarjetasDeCredito
   **/
  
  @Schema(description = "")
  @Valid
  public List<TarjetaCredito> getTarjetasDeCredito() {  
    return tarjetasDeCredito;
  }



  public void setTarjetasDeCredito(List<TarjetaCredito> tarjetasDeCredito) { 
    this.tarjetasDeCredito = tarjetasDeCredito;
  }

  public User idioma(Language idioma) { 

    this.idioma = idioma;
    return this;
  }

  /**
   * Get idioma
   * @return idioma
   **/
  
  @Schema(description = "")
  
@Valid
  public Language getIdioma() {  
    return idioma;
  }



  public void setIdioma(Language idioma) { 
    this.idioma = idioma;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.nombre, user.nombre) &&
        Objects.equals(this.apellidos, user.apellidos) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.fechaAltaReciente, user.fechaAltaReciente) &&
        Objects.equals(this.fotoPerfil, user.fotoPerfil) &&
        Objects.equals(this.fechaRegistro, user.fechaRegistro) &&
        Objects.equals(this.perfilesUsuario, user.perfilesUsuario) &&
        Objects.equals(this.tarjetasDeCredito, user.tarjetasDeCredito) &&
        Objects.equals(this.idioma, user.idioma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellidos, username, email, password, fechaAltaReciente, fotoPerfil, fechaRegistro, perfilesUsuario, tarjetasDeCredito, idioma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    fechaAltaReciente: ").append(toIndentedString(fechaAltaReciente)).append("\n");
    sb.append("    fotoPerfil: ").append(toIndentedString(fotoPerfil)).append("\n");
    sb.append("    fechaRegistro: ").append(toIndentedString(fechaRegistro)).append("\n");
    sb.append("    perfilesUsuario: ").append(toIndentedString(perfilesUsuario)).append("\n");
    sb.append("    tarjetasDeCredito: ").append(toIndentedString(tarjetasDeCredito)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
