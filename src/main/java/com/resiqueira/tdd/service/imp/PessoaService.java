package com.resiqueira.tdd.service.imp;

import com.resiqueira.tdd.model.Pessoa;
import com.resiqueira.tdd.repository.IPessoaRepository;
import com.resiqueira.tdd.service.IPessoaService;

public class PessoaService implements IPessoaService {

    private final IPessoaRepository pessoaRepository;

    public PessoaService(IPessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa save(Pessoa pessoa) {

        return this.pessoaRepository.save(pessoa);
    }
}
