package com.cgm.tech.service;

import com.cgm.tech.model.Visit;
import com.cgm.tech.model.dto.VisitDTO;
import com.cgm.tech.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitService {

    private final VisitRepository visitRepository;
    private final ModelMapper mapper = new ModelMapper();

    public List<VisitDTO> getAllVisits(Long id) {
        List<VisitDTO> listVisitDTO = new ArrayList<>();
        return mapper.map(visitRepository.findAllByPatientId(id), listVisitDTO.getClass());
    }
    public void createVisit(VisitDTO visitDTO){
        visitDTO.setVisitTime(LocalDateTime.now());
        visitRepository.save(mapper.map(visitDTO, Visit.class));
    }
    public void updateVisit(VisitDTO visitDTO){
        if (visitDTO.getId() == null) throw new NullPointerException("Visit ID cannot be NULL");
        visitDTO.setVisitTime(LocalDateTime.now());
        visitRepository.save(mapper.map(visitDTO, Visit.class));
    }

    public VisitDTO getVisitById(Long id) {
        return mapper.map(visitRepository.findById(id), VisitDTO.class);
    }
}
