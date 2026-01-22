package com.almeida.MotoData.Controller;

import com.almeida.MotoData.Service.FuelService;
import com.almeida.MotoData.entity.Fuel;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fuel")
public class FuelController {
    private final FuelService service;

    public FuelController(FuelService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Fuel> create(@RequestBody Fuel fuel)
    {
        Fuel salvo = service.save(fuel);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Fuel>> getAllFuels()
    {
        return ResponseEntity.ok(service.getAllFuels());
    }

}
