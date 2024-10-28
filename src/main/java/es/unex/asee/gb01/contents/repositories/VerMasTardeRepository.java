package es.unex.asee.gb01.contents.repositories;


import es.unex.asee.gb01.contents.Entities.VerMasTardeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerMasTardeRepository extends JpaRepository<VerMasTardeEntity, Long> {
    // Métodos de consulta personalizados pueden añadirse aquí
}

