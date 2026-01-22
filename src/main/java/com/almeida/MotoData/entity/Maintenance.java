package com.almeida.MotoData.entity;

import com.almeida.MotoData.enums.EnumMaintenance;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Integer km;
    private Integer nextKm;
    private String description;

    private BigDecimal partsCost;
    private BigDecimal laborCost;

    @Enumerated(EnumType.STRING)
    private EnumMaintenance tagMaintenance; // PREVENTIVA, CORRETIVA, TROCA_OLEO

    @ManyToOne
    @JoinColumn(name = "moto_id", nullable = false)
    private Moto moto;

    @ManyToOne
    @JoinColumn(name = "mechanic_id", nullable = false)
    private Mechanic mechanic;

}
