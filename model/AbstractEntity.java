package com.PFA.Freelance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name = "creationDate" , nullable = false)
    @JsonIgnore
    private Instant creationDate;


    @Column(name = "lastModifiedDate")
    @JsonIgnore
    private Instant lastModifiedDate;
}
