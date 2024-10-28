package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
// import io.swagger.model.HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid;
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
 * ListaContenido
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class ListaContenido   {
  @JsonProperty("id-usuario")

  private Long idUsuario = null;

  @JsonProperty("id-lista")

  private Long idLista = null;

  @JsonProperty("Nombre-lista")

  private String nombreLista = null;

//   @JsonProperty("contenidos")
//   @Valid
//   private List<HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid> contenidos = new ArrayList<HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid>();

  public ListaContenido idUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Id del usuario al que pertenece esta lista de contenido
   * @return idUsuario
   **/
  
  @Schema(example = "1", required = true, description = "Id del usuario al que pertenece esta lista de contenido")
  
  @NotNull
  public Long getIdUsuario() {  
    return idUsuario;
  }



  public void setIdUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
  }

  public ListaContenido idLista(Long idLista) { 

    this.idLista = idLista;
    return this;
  }

  /**
   * Get idLista
   * @return idLista
   **/
  
  @Schema(example = "1", required = true, description = "")
  
  @NotNull
  public Long getIdLista() {  
    return idLista;
  }



  public void setIdLista(Long idLista) { 

    this.idLista = idLista;
  }

  public ListaContenido nombreLista(String nombreLista) { 

    this.nombreLista = nombreLista;
    return this;
  }

  /**
   * Get nombreLista
   * @return nombreLista
   **/
  
  @Schema(example = "Mis favoritos", required = true, description = "")
  
  @NotNull
  public String getNombreLista() {  
    return nombreLista;
  }



  public void setNombreLista(String nombreLista) { 

    this.nombreLista = nombreLista;
  }

//   public ListaContenido contenidos(List<HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid> contenidos) { 

//     this.contenidos = contenidos;
//     return this;
//   }

//   public ListaContenido addContenidosItem(HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid contenidosItem) {
//     this.contenidos.add(contenidosItem);
//     return this;
//   }

//   /**
//    * Get contenidos
//    * @return contenidos
//    **/
  
//   @Schema(required = true, description = "")
  
// @Valid
//   @NotNull
// @Size(min=1)   public List<HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid> getContenidos() {  
//     return contenidos;
//   }



//   public void setContenidos(List<HttpsappSwaggerhubComapisdmocinhamedifliContenido100swaggerYamlcomponentsschemasMoviepropertiesid> contenidos) { 

//     this.contenidos = contenidos;
//   }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaContenido listaContenido = (ListaContenido) o;
    return Objects.equals(this.idUsuario, listaContenido.idUsuario) &&
        Objects.equals(this.idLista, listaContenido.idLista) &&
        Objects.equals(this.nombreLista, listaContenido.nombreLista); /* && */
        // Objects.equals(this.contenidos, listaContenido.contenidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, idLista, nombreLista /*, contenidos */);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaContenido {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    idLista: ").append(toIndentedString(idLista)).append("\n");
    sb.append("    nombreLista: ").append(toIndentedString(nombreLista)).append("\n");
    // sb.append("    contenidos: ").append(toIndentedString(contenidos)).append("\n");
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
