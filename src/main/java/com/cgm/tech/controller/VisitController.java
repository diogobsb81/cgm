package com.cgm.tech.controller;

import com.cgm.tech.model.dto.VisitDTO;
import com.cgm.tech.service.VisitService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit")
@RequiredArgsConstructor
@CrossOrigin
public class VisitController {

    private final VisitService visitService;

    @GetMapping("/patient/{patientId}")
    @Operation(summary = "List all visits by Patient Id")
    public List<VisitDTO> getAllVisitsByPatientId(@PathVariable Long patientId){
        return visitService.getAllVisits(patientId);
    }
    @PostMapping("/create")
    @Operation(summary = "Create a new visit for a patient")
    public void createVisit(@RequestBody VisitDTO dto){
        visitService.createVisit(dto);
    }
    @PutMapping("/update/{visit}")
    @Operation(summary = "Update a new visit for a patient")
    public void updateVisit(@RequestBody VisitDTO visit){
        visitService.updateVisit(visit);
    }

    @GetMapping("/{visitId}")
    @Operation(summary = "get Visit by ID")
    public VisitDTO getVisitById(@PathVariable Long visitId){
        return visitService.getVisitById(visitId);
    }
}
