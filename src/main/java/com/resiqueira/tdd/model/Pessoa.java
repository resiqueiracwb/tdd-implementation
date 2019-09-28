package com.resiqueira.tdd.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CPF")
    private String cpf;
/**
    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Endereco endereco;*/
}
