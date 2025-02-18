package com.PFA.Freelance.model;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class InfoFormationExperience {

    private String intitule;
    private Instant date_debut;
    private Instant date_fin;
    private String description;
}
