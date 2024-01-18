package com.gov.ensino.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instrutor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
