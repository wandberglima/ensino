package com.gov.ensino.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "REGISTRO")
@Data
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal ausencia;

    @OneToOne
    @JoinColumn(name = "matricula")
    private Aluno idAluno;

    @OneToOne
    @JoinColumn(name = "id_turma")
    private Turma idTurma;

}
