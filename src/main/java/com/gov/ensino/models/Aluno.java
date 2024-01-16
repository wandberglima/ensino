package com.gov.ensino.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Aluno implements Serializable {

    private Float peso;

    private Float altura;

    private LocalDate nascimento;

    private String telefone;

    private String endereco;

    private String nome;

    private LocalDate dataMatricula;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matricula;


    @OneToMany(mappedBy = "turma")
    private List<Turma> idTurma;

}
