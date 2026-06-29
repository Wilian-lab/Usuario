package com.Wilian.Usuario.Infrastructure.repository;

import com.Aprendendo_Java.Aprendendo_Java.Infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
    Optional<Usuario> findByEmail(String email);


}
