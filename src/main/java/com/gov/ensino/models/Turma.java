package com.gov.ensino.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Turma {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    private BigDecimal quantidadeAlunos;

    private LocalTime horaAula;

    private LocalTime duracaoAula;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private BigDecimal Atividade;

    @ManyToOne
    private Instrutor idInstrutor;

    @OneToOne(mappedBy = "id")
    private Aluno idAluno;

}
