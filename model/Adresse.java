package com.PFA.Freelance.model;

import jakarta.persistence.Embeddable;
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
public class Adresse implements Serializable {

    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;

}
