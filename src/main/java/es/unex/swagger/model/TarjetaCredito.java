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
 * TarjetaCredito
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class TarjetaCredito   {
  @JsonProperty("id-usuario")

  private Long idUsuario = null;

  @JsonProperty("IBAN")

  private String IBAN = null;

  @JsonProperty("CVC")

  private String CVC = null;

  @JsonProperty("Banco")

  private String banco = null;


  public TarjetaCredito idUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Id del usuario al que pertenece esa tarjeta de credito.
   * @return idUsuario
   **/
  
  @Schema(example = "1", required = true, description = "Id del usuario al que pertenece esa tarjeta de credito.")
  
  @NotNull
  public Long getIdUsuario() {  
    return idUsuario;
  }



  public void setIdUsuario(Long idUsuario) { 

    this.idUsuario = idUsuario;
  }

  public TarjetaCredito IBAN(String IBAN) { 

    this.IBAN = IBAN;
    return this;
  }

  /**
   * Get IBAN
   * @return IBAN
   **/
  
  @Schema(example = "ES11111111111111111", required = true, description = "")
  
  @NotNull
  public String getIBAN() {  
    return IBAN;
  }



  public void setIBAN(String IBAN) { 

    this.IBAN = IBAN;
  }

  public TarjetaCredito CVC(String CVC) { 

    this.CVC = CVC;
    return this;
  }

  /**
   * Get CVC
   * @return CVC
   **/
  
  @Schema(example = "123", required = true, description = "")
  
  @NotNull
  public String getCVC() {  
    return CVC;
  }



  public void setCVC(String CVC) { 

    this.CVC = CVC;
  }

  public TarjetaCredito banco(String banco) { 

    this.banco = banco;
    return this;
  }

  /**
   * Get banco
   * @return banco
   **/
  
  @Schema(example = "Santander", required = true, description = "")
  
  @NotNull
  public String getBanco() {  
    return banco;
  }



  public void setBanco(String banco) { 

    this.banco = banco;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TarjetaCredito tarjetaCredito = (TarjetaCredito) o;
    return Objects.equals(this.idUsuario, tarjetaCredito.idUsuario) &&
        Objects.equals(this.IBAN, tarjetaCredito.IBAN) &&
        Objects.equals(this.CVC, tarjetaCredito.CVC) &&
        Objects.equals(this.banco, tarjetaCredito.banco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, IBAN, CVC, banco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TarjetaCredito {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    CVC: ").append(toIndentedString(CVC)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
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
