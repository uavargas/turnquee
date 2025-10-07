package com.alonsocode.turnquee_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "ticket", indexes = {@Index(columnList = "status"), @Index(columnList = "calledAt")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Clase Ticket que representa un ticket en la base de datos
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigo;
    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    private Instant createdAt;
    private Instant calledAt;
    private Instant servedAt;
    //Relaciones con Usuario y Cola
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Cola cola;


}
