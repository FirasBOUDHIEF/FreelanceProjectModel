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
@Table(name = "certificat")
public class Certificat extends AbstractEntity {

    private String nom;       // e.g., "AWS Certified Solutions Architect"
    private String institution; // e.g., "Amazon Web Services"
    private String dateObtention; // e.g., "2021-05-10"
    private String url;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;
}
