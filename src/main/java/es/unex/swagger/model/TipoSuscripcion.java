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
 * TipoSuscripcion
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class TipoSuscripcion   {
  @JsonProperty("id-tipo-suscripcion")

  private Long idTipoSuscripcion = null;

  @JsonProperty("Nombre-tipo-suscripcion")

  private String nombreTipoSuscripcion = null;

  @JsonProperty("Cantidad")

  private Float cantidad = null;


  public TipoSuscripcion idTipoSuscripcion(Long idTipoSuscripcion) { 

    this.idTipoSuscripcion = idTipoSuscripcion;
    return this;
  }

  /**
   * Get idTipoSuscripcion
   * @return idTipoSuscripcion
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Long getIdTipoSuscripcion() {  
    return idTipoSuscripcion;
  }



  public void setIdTipoSuscripcion(Long idTipoSuscripcion) { 

    this.idTipoSuscripcion = idTipoSuscripcion;
  }

  public TipoSuscripcion nombreTipoSuscripcion(String nombreTipoSuscripcion) { 

    this.nombreTipoSuscripcion = nombreTipoSuscripcion;
    return this;
  }

  /**
   * Get nombreTipoSuscripcion
   * @return nombreTipoSuscripcion
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getNombreTipoSuscripcion() {  
    return nombreTipoSuscripcion;
  }



  public void setNombreTipoSuscripcion(String nombreTipoSuscripcion) { 

    this.nombreTipoSuscripcion = nombreTipoSuscripcion;
  }

  public TipoSuscripcion cantidad(Float cantidad) { 

    this.cantidad = cantidad;
    return this;
  }

  /**
   * Get cantidad
   * @return cantidad
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Float getCantidad() {  
    return cantidad;
  }



  public void setCantidad(Float cantidad) { 

    this.cantidad = cantidad;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoSuscripcion tipoSuscripcion = (TipoSuscripcion) o;
    return Objects.equals(this.idTipoSuscripcion, tipoSuscripcion.idTipoSuscripcion) &&
        Objects.equals(this.nombreTipoSuscripcion, tipoSuscripcion.nombreTipoSuscripcion) &&
        Objects.equals(this.cantidad, tipoSuscripcion.cantidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoSuscripcion, nombreTipoSuscripcion, cantidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoSuscripcion {\n");
    
    sb.append("    idTipoSuscripcion: ").append(toIndentedString(idTipoSuscripcion)).append("\n");
    sb.append("    nombreTipoSuscripcion: ").append(toIndentedString(nombreTipoSuscripcion)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
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
