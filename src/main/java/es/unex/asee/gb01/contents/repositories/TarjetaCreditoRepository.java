package es.unex.asee.gb01.contents.repositories;


import es.unex.asee.gb01.contents.Entities.TarjetaCreditoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaCreditoRepository extends JpaRepository<TarjetaCreditoEntity, Long> {
    // Métodos adicionales pueden agregarse aquí si son necesarios para consultas específicas.
}

