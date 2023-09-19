package com.cgm.tech.model;

import com.cgm.tech.model.enumeration.VisitReason;
import com.cgm.tech.model.enumeration.VisitType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="VISIT")
@Data
public class Visit {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name="VISIT_TIME")
    private LocalDateTime visitTime = LocalDateTime.now();

    @Column(name="VISIT_TYPE")
    @Enumerated(EnumType.STRING)
    private VisitType visitType;

    @Column(name="FAMILY_HISTORY")
    private String familyHistory;

    @Column(name="VISIT_REASON")
    @Enumerated(EnumType.STRING)
    private VisitReason visityReason;

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

}
