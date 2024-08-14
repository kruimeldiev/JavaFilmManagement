package nl.casperdaris.filmmanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.casperdaris.filmmanagementsystem.models.UserEntity;

// TODO: DOCS
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUsername(String username);

    Boolean existsByUsername(String username);

}
