package com.almeida.MotoData.Controller;

import com.almeida.MotoData.Service.MotoService;
import com.almeida.MotoData.entity.Moto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotoController {
    private final MotoService service;

    public MotoController(MotoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Moto> create(@RequestBody Moto moto)
    {
        service.save(moto);
        return ResponseEntity.ok(moto);
    }

    @GetMapping
    public ResponseEntity<List<Moto>> GetMotos()
    {
        return ResponseEntity.ok(service.getAllMotos());
    }


}
