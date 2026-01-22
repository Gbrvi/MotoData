package com.almeida.MotoData.repository;

import com.almeida.MotoData.entity.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository  extends JpaRepository<Fuel, Long> {
}
