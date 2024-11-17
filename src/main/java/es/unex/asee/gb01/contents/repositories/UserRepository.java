package es.unex.asee.gb01.contents.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import es.unex.asee.gb01.contents.Entities.UserEntity;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long>{
    UserEntity findByUsername(String username);

    UserEntity findByEmail (String email);
}
