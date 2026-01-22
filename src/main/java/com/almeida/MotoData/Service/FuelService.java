package com.almeida.MotoData.Service;

import com.almeida.MotoData.dto.FuelRequestDTO;
import com.almeida.MotoData.entity.Fuel;
import com.almeida.MotoData.entity.Moto;
import com.almeida.MotoData.repository.FuelRepository;
import com.almeida.MotoData.repository.MotoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FuelService {
    private final FuelRepository fuelRepository;
    private final MotoRepository motoRepository;

    public FuelService(FuelRepository fuelRepository, MotoRepository motoRepository) {
        this.fuelRepository = fuelRepository;
        this.motoRepository = motoRepository;
    }

    @Transactional
    public Fuel save(Fuel fuel)
    {
        return fuelRepository.save(fuel);

    }

    public List<Fuel> getAllFuels()
    {
        return fuelRepository.findAll();
    }


}
