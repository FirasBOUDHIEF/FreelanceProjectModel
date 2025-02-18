package com.PFA.Freelance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "projet")
public class Project extends AbstractEntity {


    private String nomProjet;
    private String description;
    private String url;
    private String file;
    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;
}
