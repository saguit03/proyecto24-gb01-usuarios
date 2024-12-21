package es.unex.asee.gb01.contents.entities;

import javax.persistence.*;

@Entity
@Table(name = "creditCards")
public class CreditCardEntity {

    @Id
    @GeneratedValue
    private Long idCard;

    @Column(name = "IBAN", nullable = false, unique = true)
    private String IBAN;
   
    @Column(name = "idUser", nullable = false)
    private Long idUser;

    @Column(name = "CVC", nullable = false)
    private String CVC;

    
    @Column(name = "bank", nullable = false)
    private String bank;

    public Long getidUser() {
        return idUser;
    }

    public void setidUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getCVC() {
        return CVC;
    }

    public void setCVC(String CVC) {
        this.CVC = CVC;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

}

