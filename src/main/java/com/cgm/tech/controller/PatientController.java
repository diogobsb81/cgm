package com.cgm.tech.controller;

import com.cgm.tech.model.dto.PatientDTO;
import com.cgm.tech.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
@CrossOrigin
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/getAllPatients")
    @Operation(summary = "List all patients")
    public List<PatientDTO> getAllVisitsByPatientId(){
        return patientService.getAllPatients();
    }
}
