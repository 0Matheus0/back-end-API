package com.strange.matheusApiResttraining.controller;

import com.strange.matheusApiResttraining.model.AgendaModel;
import com.strange.matheusApiResttraining.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    public AgendaRepository repository;


    @GetMapping (path = "/agenda/buscar")
    public List <AgendaModel> list_all(){

        return repository.findAll();

    }

    @GetMapping (path = "/agenda/buscar/{id}")                   //@PathVariable = Passar valor diretamente na URL
    public AgendaModel search (@PathVariable ("id")Integer id ){

        return repository.findById(id).get();

    }

    @PostMapping (path = "/agenda/salvar")
    public AgendaModel save (@RequestBody AgendaModel agenda){

        return repository.save(agenda);

    }

    @DeleteMapping (path = "/agenda/deletar/{id}")
    public void  delete (@PathVariable ("id")Integer id){

        repository.deleteById(id);

    }

    




}
