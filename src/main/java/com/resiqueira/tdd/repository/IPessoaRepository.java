package com.resiqueira.tdd.repository;

import com.resiqueira.tdd.model.Pessoa;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {

}
