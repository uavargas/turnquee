package com.alonsocode.turnquee_backend.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "colas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @Column(length = 200, nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "cola")
    private List<Ticket> tickets = new ArrayList<>();
}
