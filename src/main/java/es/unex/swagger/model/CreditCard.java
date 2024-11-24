package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import es.unex.swagger.configuration.NotUndefined;
import javax.validation.constraints.*;

/**
 * CreditCard
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class CreditCard   {
  @JsonProperty("idUser")

  private Long idUser = null;

  @JsonProperty("IBAN")

  private String IBAN = null;

  @JsonProperty("CVC")

  private String CVC = null;

  @JsonProperty("Bank")

  private String bank = null;


  public CreditCard idUser(Long idUser) { 

    this.idUser = idUser;
    return this;
  }

  /**
   * Id del user al que pertenece esa card de credito.
   * @return idUser
   **/
  
  @Schema(example = "1", required = true, description = "Id del user al que pertenece esa card de credito.")
  
  
  public Long getidUser() {  
    return idUser;
  }



  public void setidUser(Long idUser) { 

    this.idUser = idUser;
  }

  public CreditCard IBAN(String IBAN) { 

    this.IBAN = IBAN;
    return this;
  }

  /**
   * Get IBAN
   * @return IBAN
   **/
  
  @Schema(example = "ES11111111111111111", required = true, description = "")
  
  
  public String getIBAN() {  
    return IBAN;
  }



  public void setIBAN(String IBAN) { 

    this.IBAN = IBAN;
  }

  public CreditCard CVC(String CVC) { 

    this.CVC = CVC;
    return this;
  }

  /**
   * Get CVC
   * @return CVC
   **/
  
  @Schema(example = "123", required = true, description = "")
  
  
  public String getCVC() {  
    return CVC;
  }



  public void setCVC(String CVC) { 

    this.CVC = CVC;
  }

  public CreditCard bank(String bank) { 

    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
   **/
  
  @Schema(example = "Santander", required = true, description = "")
  
  
  public String getBank() {  
    return bank;
  }



  public void setBank(String bank) { 

    this.bank = bank;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.idUser, creditCard.idUser) &&
        Objects.equals(this.IBAN, creditCard.IBAN) &&
        Objects.equals(this.CVC, creditCard.CVC) &&
        Objects.equals(this.bank, creditCard.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, IBAN, CVC, bank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    CVC: ").append(toIndentedString(CVC)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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
