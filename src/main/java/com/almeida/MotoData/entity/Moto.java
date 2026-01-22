package com.almeida.MotoData.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String owner;
    private String brand;

    @Column(unique = true, nullable = false)
    private String licensePlate;
}
