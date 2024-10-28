package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import es.unex.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerfilUsuario
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class PerfilUsuario   {
  @JsonProperty("id-perfil")

  private Long idPerfil = null;

  @JsonProperty("id-usuario")

  private Long idUsuario = null;

  @JsonProperty("Nombre-perfil")

  private String nombrePerfil = null;

  @JsonProperty("Pin")

  private String pin = null;


  public PerfilUsuario idPerfil(Long idPerfil) { 

    this.idPerfil = idPerfil;
    return this;
  }

  /**
   * Get idPerfil
   * @return idPerfil
   **/
  
  @Schema(example = "1", required = true, description = "")
  
  @NotNull
  public Long getIdPerfil() {  
    return idPerfil;
  }



  public void setIdPerfil(Long idPerfil) { 

    this.idPerfil = idPerfil;
  }

  public PerfilUsuario idUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Id del usuario al que pertenece ese perfil
   * @return idUsuario
   **/
  
  @Schema(example = "1", required = true, description = "Id del usuario al que pertenece ese perfil")
  
  @NotNull
  public Long getIdUsuario() {  
    return idUsuario;
  }



  public void setIdUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
  }

  public PerfilUsuario nombrePerfil(String nombrePerfil) { 

    this.nombrePerfil = nombrePerfil;
    return this;
  }

  /**
   * Get nombrePerfil
   * @return nombrePerfil
   **/
  
  @Schema(example = "Pablito", required = true, description = "")
  
  @NotNull
  public String getNombrePerfil() {  
    return nombrePerfil;
  }



  public void setNombrePerfil(String nombrePerfil) { 

    this.nombrePerfil = nombrePerfil;
  }

  public PerfilUsuario pin(String pin) { 

    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
   **/
  
  @Schema(example = "1234", required = true, description = "")
  
  @NotNull
  public String getPin() {  
    return pin;
  }



  public void setPin(String pin) { 

    this.pin = pin;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilUsuario perfilUsuario = (PerfilUsuario) o;
    return Objects.equals(this.idPerfil, perfilUsuario.idPerfil) &&
        Objects.equals(this.idUsuario, perfilUsuario.idUsuario) &&
        Objects.equals(this.nombrePerfil, perfilUsuario.nombrePerfil) &&
        Objects.equals(this.pin, perfilUsuario.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPerfil, idUsuario, nombrePerfil, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilUsuario {\n");
    
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    nombrePerfil: ").append(toIndentedString(nombrePerfil)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
