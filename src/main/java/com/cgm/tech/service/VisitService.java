package com.cgm.tech.service;

import com.cgm.tech.model.dto.VisitDTO;

import java.util.List;


public interface VisitService {
    public List<VisitDTO> getAllVisits(Long Id);
    public void createVisit(VisitDTO dto);
    public void updateVisit(VisitDTO dto);
    public VisitDTO getVisitById(Long id);
}
