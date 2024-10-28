package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.HistorialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<HistorialEntity, Long> {
    // Métodos de consulta personalizados se pueden agregar aquí
}
