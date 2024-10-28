package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.TipoSuscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSuscripcionRepository extends JpaRepository<TipoSuscripcionEntity, Long> {
    // Métodos de búsqueda personalizados pueden añadirse aquí, si son necesarios.
}

