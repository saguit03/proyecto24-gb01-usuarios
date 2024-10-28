package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.FavoritosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends JpaRepository<FavoritosEntity, Long> {
    // Métodos de consulta personalizados pueden añadirse aquí
}
