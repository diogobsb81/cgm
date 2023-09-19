package com.cgm.tech.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientDTO {
    private Long id;
    private String name;
    private String surName;
    private LocalDate birth;
    private Long socialNumber;
}
