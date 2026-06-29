package com.Wilian.Usuario.Infrastructure.repository;

import com.Aprendendo_Java.Aprendendo_Java.Infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
