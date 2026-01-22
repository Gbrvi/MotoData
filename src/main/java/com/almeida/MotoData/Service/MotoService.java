package com.almeida.MotoData.Service;

import com.almeida.MotoData.entity.Moto;
import com.almeida.MotoData.repository.MotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {

    private final MotoRepository repository;

    public MotoService(MotoRepository repository) {
        this.repository = repository;
    }

    public Moto save(Moto moto)
    {
       return repository.save(moto);
    }

    public List<Moto> getAllMotos()
    {
        return repository.findAll();
    }

}
