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
 * Historial
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class Historial   {
  @JsonProperty("id-user")

  private Long idUser = null;

  @JsonProperty("id-visualizacion")

  private Long idVisualizacion = null;


  public Historial idUser(Long idUser) { 

    this.idUser = idUser;
    return this;
  }

  /**
   * Id del usuario al que pertenece esta lista de contenido
   * @return idUser
   **/
  
  @Schema(required = true, description = "Id del usuario al que pertenece esta lista de contenido")
  
  @NotNull
  public Long getIdUser() {  
    return idUser;
  }



  public void setIdUser(Long idUser) { 

    this.idUser = idUser;
  }

  public Historial idVisualizacion(Long idVisualizacion) { 

    this.idVisualizacion = idVisualizacion;
    return this;
  }

  /**
   * Get idVisualizacion
   * @return idVisualizacion
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Long getIdVisualizacion() {  
    return idVisualizacion;
  }



  public void setIdVisualizacion(Long idVisualizacion) { 

    this.idVisualizacion = idVisualizacion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Historial historial = (Historial) o;
    return Objects.equals(this.idUser, historial.idUser) &&
        Objects.equals(this.idVisualizacion, historial.idVisualizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, idVisualizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historial {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    idVisualizacion: ").append(toIndentedString(idVisualizacion)).append("\n");
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
