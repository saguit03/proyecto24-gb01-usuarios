package es.unex.asee.gb01.contents.repositories;

import es.unex.asee.gb01.contents.Entities.PerfilUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {
    // Métodos personalizados pueden ser añadidos aquí
}
