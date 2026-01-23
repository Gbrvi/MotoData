package com.almeida.MotoData.Service;

import com.almeida.MotoData.entity.Moto;
import com.almeida.MotoData.repository.MotoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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

    public Moto getMotoById(Long id)
    {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Moto update(Long id, Moto moto)
    {
        Moto real_moto = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Moto não encontrada"));


        real_moto.setBrand(moto.getBrand());
        real_moto.setOwner(moto.getOwner());
        real_moto.setLicensePlate(moto.getLicensePlate());

        return repository.save(real_moto);
    }

    public void deleteMotoById(Long id)
    {
        Moto moto = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        try
        {
            repository.delete(moto);
        } catch(DataIntegrityViolationException e)
        {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Não é possivel deletar uma moto que contém registro combustivel");
        }
    }

}
