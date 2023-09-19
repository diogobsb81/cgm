package com.cgm.tech.service;

import com.cgm.tech.model.dto.PatientDTO;
import com.cgm.tech.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    private final ModelMapper mapper = new ModelMapper();

    public List<PatientDTO> getAllPatients() {
        List<PatientDTO> listPatientDTO = new ArrayList<>();
        return mapper.map(patientRepository.findAll(), listPatientDTO.getClass());
    }

}
