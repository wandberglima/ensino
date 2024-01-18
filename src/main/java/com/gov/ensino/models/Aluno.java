package com.gov.ensino.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matricula;

    private LocalDate dataMatricula;

    private String nome;

    private String endereco;

    private String telefone;

    private LocalDate nascimento;

    private Float altura;

    private Float peso;

    @OneToOne(mappedBy = "turma")
    private Turma idTurma;

}
