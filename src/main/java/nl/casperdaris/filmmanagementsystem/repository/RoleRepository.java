package nl.casperdaris.filmmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.casperdaris.filmmanagementsystem.models.Role;

import java.util.Optional;

// TODO: DOCS
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
