package com.almeida.MotoData.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

public record FuelRequestDTO(
        @NotNull(message = "O ID da moto é obrigatório")
        Long motoId,

        @NotNull(message = "A data é obrigatória")
        LocalDate date,

        @NotNull(message = "O KM atual é obrigatório")
        @Positive
        Integer km,

        @NotNull(message = "A quantidade de litros é obrigatória")
        @Positive
        BigDecimal amountGas,

        @NotNull(message = "O valor total é obrigatório")
        @Positive
        BigDecimal totalPrice
) {}