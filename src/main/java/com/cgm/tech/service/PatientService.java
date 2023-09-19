package com.cgm.tech.service;

import com.cgm.tech.model.dto.PatientDTO;
import com.cgm.tech.model.dto.VisitDTO;

import java.util.List;


public interface PatientService {
    public List<PatientDTO> getAllPatients();
}
