package com.resiqueira.tdd.controller;

import com.resiqueira.tdd.exception.PersonNotFoundExcepton;
import com.resiqueira.tdd.model.Pessoa;
import com.resiqueira.tdd.repository.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/persons")
public class PessoaController {

    @Autowired
    private IPessoaRepository pessoaRepository;


    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable Long id){
        return this.pessoaRepository.findById(id).orElseThrow(PersonNotFoundExcepton::new);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa create(@RequestBody Pessoa pessoa){
        return this.pessoaRepository.save(pessoa);
    }
}
