package com.gov.ensino.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "QTD_ALUNOS", nullable = false)
    private BigDecimal quantidadeAlunos;

    @Column(name = "HORA_AULA")
    private Timestamp horaAula;

    @Column(name = "DURAÇÃO_AULA")
    private Timestamp duracaoAula;

    @Column(name = "DATA_INICIO")
    private Date dataInicio;

    @Column(name = "DATA_FIM")
    private Date dataFim;

    @Column(name = "ATIVIDADE")
    private BigDecimal Atividade;

    @OneToMany(mappedBy = "matricula")
    private List<Aluno> alunos;

    @OneToOne(mappedBy = "turma")
    private Aluno aluno;

    @ManyToMany(mappedBy = "id")
    private List<Instrutor> instrutores;

}
