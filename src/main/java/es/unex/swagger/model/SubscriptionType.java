package es.unex.swagger.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import es.unex.swagger.configuration.NotUndefined;
import javax.validation.constraints.*;

/**
 * SubscriptionType
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")


public class SubscriptionType   {
  @JsonProperty("id-tipo-subscription")

  private Long idSubscriptionType = null;

  @JsonProperty("Name-tipo-subscription")

  private String subscriptionTypeName = null;

  @JsonProperty("Quantity")

  private Float quantity = null;

  public SubscriptionType() {
  }

  public SubscriptionType(String subscriptionTypeName, Float quantity) {
    this.subscriptionTypeName = subscriptionTypeName;
    this.quantity = quantity;
  }

  public SubscriptionType(Long idSubscriptionType, String subscriptionTypeName, Float quantity) {
    this.idSubscriptionType = idSubscriptionType;
    this.subscriptionTypeName = subscriptionTypeName;
    this.quantity = quantity;
  }

  /**
   * Get idSubscriptionType
   * @return idSubscriptionType
   **/
  
  @Schema(required = true, description = "")
  
  
  public Long getIdSubscriptionType() {  
    return idSubscriptionType;
  }



  public void setIdSubscriptionType(Long idSubscriptionType) { 

    this.idSubscriptionType = idSubscriptionType;
  }



  /**
   * Get subscriptionTypeName
   * @return subscriptionTypeName
   **/
  
  @Schema(required = true, description = "")
  
  
  public String getSubscriptionTypeName() {  
    return subscriptionTypeName;
  }



  public void setSubscriptionTypeName(String subscriptionTypeName) { 

    this.subscriptionTypeName = subscriptionTypeName;
  }


  /**
   * Get quantity
   * @return quantity
   **/
  
  @Schema(required = true, description = "")
  
  
  public Float getQuantity() {  
    return quantity;
  }



  public void setQuantity(Float quantity) { 

    this.quantity = quantity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionType subscriptionType = (SubscriptionType) o;
    return Objects.equals(this.idSubscriptionType, subscriptionType.idSubscriptionType) &&
        Objects.equals(this.subscriptionTypeName, subscriptionType.subscriptionTypeName) &&
        Objects.equals(this.quantity, subscriptionType.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSubscriptionType, subscriptionTypeName, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionType {\n");
    
    sb.append("    idSubscriptionType: ").append(toIndentedString(idSubscriptionType)).append("\n");
    sb.append("    subscriptionTypeName: ").append(toIndentedString(subscriptionTypeName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
