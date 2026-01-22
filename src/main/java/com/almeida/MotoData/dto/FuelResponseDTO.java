package com.almeida.MotoData.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record FuelResponseDTO (
        Long id,
        LocalDate date,
        Integer km,
        BigDecimal amountGas,
        BigDecimal totalPrice,
        BigDecimal pricePerLitre,
        BigDecimal consumption
) {}
