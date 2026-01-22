package com.almeida.MotoData.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Integer km;

    private BigDecimal amountGas;
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "moto_id", nullable = false)
    private Moto moto;
}
