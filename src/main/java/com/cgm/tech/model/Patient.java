package com.cgm.tech.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="PATIENT")
@Data
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String name;

    @Column(name = "SUR_NAME")
    private String surName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birth;

    @Column(name = "SOCIAL_SEC_NUMBER")
    private Long socialNumber;

}
