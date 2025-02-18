package com.PFA.Freelance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "abonnement")
public class Abonnement extends AbstractEntity {

    private String subscriptionType;
    private Instant startDate;
    private Instant endDate;
    private boolean isActive; // Flag to check if the abonnement is active

    @OneToMany(mappedBy = "abonnement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Freelancer> freelancers; // One Abonnement can have many Freelancers
}
