package com.resiqueira.tdd.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RUA")
    private String rua;

    @Column(name = "CEP")
    private String cep;

  /**  @OneToOne
    @MapsId
    private Pessoa pessoa;**/
}
