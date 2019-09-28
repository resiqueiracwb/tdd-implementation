package com.resiqueira.tdd.repository;

import com.resiqueira.tdd.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {
}
