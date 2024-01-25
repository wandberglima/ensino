package com.gov.ensino.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MATRICULA")
    private Long matricula;

    @Column(name = "DATA_MATRICULA")
    private Date dataMatricula;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "ENDEREÇO")
    private String endereco;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "NASCIMENTO")
    private Timestamp nascimento;

    @Column(name = "ALTURA")
    private Float altura;

    @Column(name = "PESO")
    private Float peso;

    @OneToOne
    @JoinColumn(name = "id_turma")
    private Turma turma;

}
