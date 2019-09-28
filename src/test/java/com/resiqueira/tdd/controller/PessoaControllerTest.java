package com.resiqueira.tdd.controller;

import com.github.javafaker.Faker;
import com.resiqueira.tdd.model.Pessoa;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



import static org.junit.Assert.assertEquals;

public class PessoaControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    private Pessoa pessoa;

    @Test
    public void createPessoa() throws Exception {
        String uri =  "/api/persons";
        pessoa = mountPessoa();

        String inputJson =  super.mapToJson(pessoa);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();

        assertEquals(201, status);

        String content = mvcResult.getResponse().getContentAsString();

        assertEquals(content, "");

    }


    private Pessoa mountPessoa() {
        Faker faker = new Faker();

        pessoa = new Pessoa();

        pessoa.setName(faker.name().name());
        pessoa.setCpf(faker.address().cityName());
        return pessoa;

    }
}
