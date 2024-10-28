package es.unex.asee.gb01.contents.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tarjeta_credito")
public class TarjetaCreditoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_tarjeta")
    // private Long idTarjeta;

    // @NotNull
    @Column(name = "IBAN", nullable = false, unique = true)
    private String IBAN;
    // @NotNull
    // @ManyToOne
    // @JoinColumn(name = "id_usuario", nullable = false)
    // private UserEntity idUsuario;
    @NotNull
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;


    @NotNull
    @Column(name = "CVC", nullable = false)
    private String CVC;

    @NotNull
    @Column(name = "banco", nullable = false)
    private String banco;

    // Getters y Setters
    // public Long getIdTarjeta() {
    //     return idTarjeta;
    // }

    // public void setIdTarjeta(Long idTarjeta) {
    //     this.idTarjeta = idTarjeta;
    // }

    // public UserEntity getIdUsuario() {
    //     return idUsuario;
    // }

    // public void setIdUsuario(UserEntity idUsuario) {
    //     this.idUsuario = idUsuario;
    // }
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     TarjetaCreditoEntity that = (TarjetaCreditoEntity) o;
    //     return Objects.equals(idUsuario, that.idUsuario) &&
    //            Objects.equals(IBAN, that.IBAN) &&
    //            Objects.equals(CVC, that.CVC) &&
    //            Objects.equals(banco, that.banco);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(idUsuario, IBAN, CVC, banco);
    // }

    // @Override
    // public String toString() {
    //     return "TarjetaCreditoEntity{" +
    //            "idTarjeta=" + idTarjeta +
    //            ", idUsuario=" + idUsuario +
    //            ", IBAN='" + IBAN + '\'' +
    //            ", CVC='" + CVC + '\'' +
    //            ", banco='" + banco + '\'' +
    //            '}';
    // }
}

