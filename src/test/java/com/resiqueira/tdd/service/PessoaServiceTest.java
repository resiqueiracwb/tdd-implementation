package com.resiqueira.tdd.service;

import com.resiqueira.tdd.model.Endereco;
import com.resiqueira.tdd.model.Pessoa;
import com.resiqueira.tdd.repository.IPessoaRepository;
import com.resiqueira.tdd.service.imp.PessoaService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
public class PessoaServiceTest {
//Repository  == antigo DAO

    private IPessoaService pessoaService;

    @MockBean
    private IPessoaRepository pessoaRepository;

    private Endereco endereco;
    private Pessoa pessoa;

    @Before
    public void setUp() throws Exception {
    this.pessoaService= new PessoaService(pessoaRepository);

    endereco = new Endereco();
    endereco.setRua("Rua de cima, 56");
    endereco.setCep("1234455");

    pessoa = new Pessoa();
    pessoa.setName("Renato paz Siqueira");
    pessoa.setCpf("98987987");


    }

    @Test
    public void deve_salvar_pessoa_com_repository_mockado() {
        this.pessoaService.save(pessoa); //chegue aqui e depois chama o qu eesta abaixo

        verify(pessoaRepository).save(pessoa);
    }
}
