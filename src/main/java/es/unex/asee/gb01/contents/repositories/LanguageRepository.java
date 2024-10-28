package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Long> {
    // Aquí puedes añadir métodos de consulta personalizados si se necesitan
}
