// package es.unex.asee.gb01.contents.Entities;

// import javax.persistence.*;
// import javax.validation.constraints.NotNull;
// import java.util.List;
// import java.util.Objects;

// @Entity
// @Table(name = "lista_contenido")
// public class ListaContenidoEntity {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_lista")
//     private Long idLista;

//     @NotNull
//     @Column(name = "id_usuario", nullable = false)
//     private Long idUsuario;

//     @NotNull
//     @Column(name = "nombre_lista", nullable = false)
//     private String nombreLista;

//     // Relación con la entidad Contenido (si está definida)
//     @OneToMany(mappedBy = "listaContenido", cascade = CascadeType.ALL, orphanRemoval = true)
//     private List<ContenidoEntity> contenidos;

//     // Getters y Setters

//     public Long getIdLista() {
//         return idLista;
//     }

//     public void setIdLista(Long idLista) {
//         this.idLista = idLista;
//     }

//     public Long getIdUsuario() {
//         return idUsuario;
//     }

//     public void setIdUsuario(Long idUsuario) {
//         this.idUsuario = idUsuario;
//     }

//     public String getNombreLista() {
//         return nombreLista;
//     }

//     public void setNombreLista(String nombreLista) {
//         this.nombreLista = nombreLista;
//     }

//     public List<ContenidoEntity> getContenidos() {
//         return contenidos;
//     }

//     public void setContenidos(List<ContenidoEntity> contenidos) {
//         this.contenidos = contenidos;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         ListaContenidoEntity that = (ListaContenidoEntity) o;
//         return Objects.equals(idUsuario, that.idUsuario) &&
//                Objects.equals(idLista, that.idLista) &&
//                Objects.equals(nombreLista, that.nombreLista);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(idUsuario, idLista, nombreLista);
//     }

//     @Override
//     public String toString() {
//         return "ListaContenidoEntity{" +
//                "idUsuario=" + idUsuario +
//                ", idLista=" + idLista +
//                ", nombreLista='" + nombreLista + '\'' +
//                '}';
//     }
// }

