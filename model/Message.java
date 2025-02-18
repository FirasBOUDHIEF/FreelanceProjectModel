package com.PFA.Freelance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper=true)
@Table(name = "message")
public class Message extends AbstractEntity {

    private String message;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Utilisateur sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Utilisateur receiver;


    @OneToOne(mappedBy = "message", cascade = CascadeType.ALL)
    private Notification notification;

}
