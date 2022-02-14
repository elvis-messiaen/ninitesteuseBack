package fr.nini.repository;

import fr.nini.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findById(int id);


    public Role save (Role role);

}
