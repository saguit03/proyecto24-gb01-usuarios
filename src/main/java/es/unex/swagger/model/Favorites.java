// package es.unex.swagger.model;

// import java.util.Objects;
// import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.annotation.JsonCreator;
// import io.swagger.v3.oas.annotations.media.Schema;
// import org.springframework.validation.annotation.Validated;
// import org.openapitools.jackson.nullable.JsonNullable;
// import es.unex.swagger.configuration.NotUndefined;
// import com.fasterxml.jackson.annotation.JsonInclude;
// import com.fasterxml.jackson.annotation.JsonSetter;
// import com.fasterxml.jackson.annotation.Nulls;
// import javax.validation.Valid;
// import javax.validation.constraints.*;

// /**
//  * Favorites
//  */
// @Validated
// @NotUndefined
// @javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


// public class Favorites   {
//   @JsonProperty("idUser")

//   private Long idUser = null;

//   @JsonProperty("idContent")

//   private Long idContent = null;


//   public Favorites idUser(Long idUser) { 

//     this.idUser = idUser;
//     return this;
//   }

//   /**
//    * Id del user al que pertenece esta lista de content
//    * @return idUser
//    **/
  
//   @Schema(required = true, description = "Id del user al que pertenece esta lista de content")
  
  
//   public Long getidUser() {  
//     return idUser;
//   }



//   public void setidUser(Long idUser) { 

//     this.idUser = idUser;
//   }

//   public Favorites idContent(Long idContent) { 

//     this.idContent = idContent;
//     return this;
//   }

//   /**
//    * Get idContent
//    * @return idContent
//    **/
  
//   @Schema(required = true, description = "")
  
  
//   public Long getidContent() {  
//     return idContent;
//   }



//   public void setidContent(Long idContent) { 

//     this.idContent = idContent;
//   }

//   @Override
//   public boolean equals(java.lang.Object o) {
//     if (this == o) {
//       return true;
//     }
//     if (o == null || getClass() != o.getClass()) {
//       return false;
//     }
//     Favorites favorites = (Favorites) o;
//     return Objects.equals(this.idUser, favorites.idUser) &&
//         Objects.equals(this.idContent, favorites.idContent);
//   }

//   @Override
//   public int hashCode() {
//     return Objects.hash(idUser, idContent);
//   }

//   @Override
//   public String toString() {
//     StringBuilder sb = new StringBuilder();
//     sb.append("class Favorites {\n");
    
//     sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
//     sb.append("    idContent: ").append(toIndentedString(idContent)).append("\n");
//     sb.append("}");
//     return sb.toString();
//   }

//   /**
//    * Convert the given object to string with each line indented by 4 spaces
//    * (except the first line).
//    */
//   private String toIndentedString(java.lang.Object o) {
//     if (o == null) {
//       return "null";
//     }
//     return o.toString().replace("\n", "\n    ");
//   }
// }
