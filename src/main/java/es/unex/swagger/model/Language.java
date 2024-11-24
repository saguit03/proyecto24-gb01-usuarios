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
 * Language
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class Language {
  
  @JsonProperty("idLanguage")

  private Long idLanguage = null;

  @JsonProperty("name")

  private String name = null;


  public Language idLanguage(Long idLanguage) { 

    this.idLanguage = idLanguage;
    return this;
  }

  /**
   * Get idLanguage
   * @return idLanguage
   **/
  
  @Schema(example = "123456789", required = true, description = "")
  
  
  public Long getIdLanguage() {  
    return idLanguage;
  }



  public void setIdLanguage(Long idLanguage) { 

    this.idLanguage = idLanguage;
  }

  public Language name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  
  @Schema(example = "Spanish", required = true, description = "")
  
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 

    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.idLanguage, language.idLanguage) &&
        Objects.equals(this.name, language.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLanguage, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("    idLanguage: ").append(toIndentedString(idLanguage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
