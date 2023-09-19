package com.cgm.tech.model.dto;

import com.cgm.tech.model.Patient;
import com.cgm.tech.model.enumeration.VisitReason;
import com.cgm.tech.model.enumeration.VisitType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
public class VisitDTO {
    private Long id;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime visitTime;
    private VisitType visitType;
    private String familyHistory;
    @Enumerated(EnumType.STRING)
    private VisitReason visityReason;
    private Patient patient;
}
