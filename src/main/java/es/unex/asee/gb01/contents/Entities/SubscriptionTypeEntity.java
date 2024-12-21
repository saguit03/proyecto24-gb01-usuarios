package es.unex.asee.gb01.contents.entities;

import javax.persistence.*;

@Entity
@Table(name = "subscriptionTypes")
public class SubscriptionTypeEntity {

    @Id
    @GeneratedValue
    private Long idSubscriptionType;
    
    @Column(name = "subscriptionTypeName", nullable = false)
    private String subscriptionTypeName;

    @Column(name = "quantity", nullable = false)
    private Float quantity;

    public SubscriptionTypeEntity() {}

    public SubscriptionTypeEntity(Long idSubscriptionType, String subscriptionTypeName, Float quantity) {
        this.idSubscriptionType = idSubscriptionType;
        this.subscriptionTypeName = subscriptionTypeName;
        this.quantity = quantity;
    }

    public SubscriptionTypeEntity(String subscriptionTypeName, Float quantity) {
        this.subscriptionTypeName = subscriptionTypeName;
        this.quantity = quantity;
    }

    // Getters y setters
    public Long getIdSubscriptionType() {
        return idSubscriptionType;
    }

    public void setIdSubscriptionType(Long idSubscriptionType) {
        this.idSubscriptionType = idSubscriptionType;
    }

    public String getSubscriptionTypeName() {
        return subscriptionTypeName;
    }

    public void setSubscriptionTypeName(String subscriptionTypeName) {
        this.subscriptionTypeName = subscriptionTypeName;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

}
