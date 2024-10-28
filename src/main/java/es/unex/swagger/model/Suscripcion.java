package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.unex.swagger.model.TipoSuscripcion;
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
 * Suscripcion
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class Suscripcion   {
  @JsonProperty("tipo-suscripcion")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TipoSuscripcion tipoSuscripcion = null;

  @JsonProperty("id-usuario")

  private Long idUsuario = null;

  @JsonProperty("id-suscripcion")

  private Long idSuscripcion = null;

  @JsonProperty("Fecha-alta")

  private String fechaAlta = null;

  @JsonProperty("Fecha-baja")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String fechaBaja = null;


  public Suscripcion tipoSuscripcion(TipoSuscripcion tipoSuscripcion) { 

    this.tipoSuscripcion = tipoSuscripcion;
    return this;
  }

  /**
   * Get tipoSuscripcion
   * @return tipoSuscripcion
   **/
  
  @Schema(description = "")
  
@Valid
  public TipoSuscripcion getTipoSuscripcion() {  
    return tipoSuscripcion;
  }



  public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) { 
    this.tipoSuscripcion = tipoSuscripcion;
  }

  public Suscripcion idUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Get idUsuario
   * @return idUsuario
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Long getIdUsuario() {  
    return idUsuario;
  }



  public void setIdUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
  }

  public Suscripcion idSuscripcion(Long idSuscripcion) { 

    this.idSuscripcion = idSuscripcion;
    return this;
  }

  /**
   * Get idSuscripcion
   * @return idSuscripcion
   **/
  
  @Schema(example = "1", required = true, description = "")
  
  @NotNull
  public Long getIdSuscripcion() {  
    return idSuscripcion;
  }



  public void setIdSuscripcion(Long idSuscripcion) { 

    this.idSuscripcion = idSuscripcion;
  }

  public Suscripcion fechaAlta(String fechaAlta) { 

    this.fechaAlta = fechaAlta;
    return this;
  }

  /**
   * Get fechaAlta
   * @return fechaAlta
   **/
  
  @Schema(example = "08/10/2022", required = true, description = "")
  
  @NotNull
  public String getFechaAlta() {  
    return fechaAlta;
  }



  public void setFechaAlta(String fechaAlta) { 

    this.fechaAlta = fechaAlta;
  }

  public Suscripcion fechaBaja(String fechaBaja) { 

    this.fechaBaja = fechaBaja;
    return this;
  }

  /**
   * Get fechaBaja
   * @return fechaBaja
   **/
  
  @Schema(example = "08/10/2024", description = "")
  
  public String getFechaBaja() {  
    return fechaBaja;
  }



  public void setFechaBaja(String fechaBaja) { 
    this.fechaBaja = fechaBaja;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suscripcion suscripcion = (Suscripcion) o;
    return Objects.equals(this.tipoSuscripcion, suscripcion.tipoSuscripcion) &&
        Objects.equals(this.idUsuario, suscripcion.idUsuario) &&
        Objects.equals(this.idSuscripcion, suscripcion.idSuscripcion) &&
        Objects.equals(this.fechaAlta, suscripcion.fechaAlta) &&
        Objects.equals(this.fechaBaja, suscripcion.fechaBaja);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoSuscripcion, idUsuario, idSuscripcion, fechaAlta, fechaBaja);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suscripcion {\n");
    
    sb.append("    tipoSuscripcion: ").append(toIndentedString(tipoSuscripcion)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    idSuscripcion: ").append(toIndentedString(idSuscripcion)).append("\n");
    sb.append("    fechaAlta: ").append(toIndentedString(fechaAlta)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
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
