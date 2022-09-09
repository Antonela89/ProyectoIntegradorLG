package com.Argprog.porfolio.security.repository;

import com.Argprog.porfolio.security.models.Rol;
import com.Argprog.porfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository <Rol, Integer>{
	Optional<Rol>findByRolNombre(RolNombre rolNombre);	
}
