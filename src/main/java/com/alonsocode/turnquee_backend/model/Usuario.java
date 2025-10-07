package com.alonsocode.turnquee_backend.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios",indexes = {@Index(columnList = "documentoIdentidad",unique = true)} ) // Indice único para el documento de identidad
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Genera un ID autoincremental
    private Long id;
    private String nombre;
    private String apellido;
    @Column(unique = true, nullable = false, length = 10)
    private String documentoIdentidad;
    private String correo;

}