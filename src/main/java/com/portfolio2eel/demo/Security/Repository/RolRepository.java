
package com.portfolio2eel.demo.Security.Repository;

import com.portfolio2eel.demo.Security.Enums.RolNombre;
import com.portfolio2eel.demo.Security.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
