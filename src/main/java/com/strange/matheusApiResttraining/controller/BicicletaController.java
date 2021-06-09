package com.strange.matheusApiResttraining.controller;


import com.strange.matheusApiResttraining.model.BicicletaModel;
import com.strange.matheusApiResttraining.repository.BicicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BicicletaController {

    @Autowired
    private BicicletaRepository repository;

    @GetMapping (path = "/bicicleta/buscar")
    public List <BicicletaModel> list_all(){

        return repository.findAll();

    }

    @GetMapping (path = "/bicicleta/buscar/{cod}")
    public BicicletaModel search (@PathVariable ("cod") Integer cod){

        return repository.findById(cod).get();

    }

    @PostMapping (path = "/bicicleta/salvar")
    public BicicletaModel save (@RequestBody BicicletaModel bike){

        return repository.save(bike);

    }

    @DeleteMapping (path = "/bicicleta/delete/{cod}")
    public void delete (@PathVariable Integer cod){

        repository.deleteById(cod);

    }


}
