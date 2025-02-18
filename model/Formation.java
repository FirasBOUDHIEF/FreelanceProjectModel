package com.PFA.Freelance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "formation")
public class Formation extends AbstractEntity {

    @Embedded
    private InfoFormationExperience infoFormationExperience;
    private String nomEtablissement;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;
}
