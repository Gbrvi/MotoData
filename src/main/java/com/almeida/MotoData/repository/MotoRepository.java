package com.almeida.MotoData.repository;

import com.almeida.MotoData.entity.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}
