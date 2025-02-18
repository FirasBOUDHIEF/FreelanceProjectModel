package com.PFA.Freelance.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class InfoPersonnelle implements Serializable {

    private String nom;
    private String prenom;
    private String numTel;
    private String photo;
    private String societe;

    @Enumerated(EnumType.STRING)  // Ensure Enums are stored as Strings
    private TailleSociete tailleSociete;

    @Enumerated(EnumType.STRING)  // Ensure Enums are stored as Strings
    private ServiceSociete serviceSociete;

    @Embedded
    private Adresse adresse;

}
