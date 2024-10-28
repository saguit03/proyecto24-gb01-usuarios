package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.SuscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends JpaRepository<SuscripcionEntity, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas.
}
