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
@Table(name = "competence")
public class Competence extends AbstractEntity {

    private String competence;

    @ManyToOne
    @JoinColumn(name = "task_id") // Foreign key for Task
    private Task task;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

}
