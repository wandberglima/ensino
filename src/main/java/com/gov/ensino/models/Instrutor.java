package com.gov.ensino.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "NASCIMENTO", nullable = false)
    private Date nascimento;

    @Column(name = "TITULAÇÃO", nullable = false)
    private String titulacao;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;


    @ManyToMany
    @JoinTable(
            name = "turma",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_instrutor"))
    private List<Turma> turmasAlocado;

}
