package com.strange.matheusApiResttraining.controller;


import com.strange.matheusApiResttraining.model.JogoModel;
import com.strange.matheusApiResttraining.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JogoController {

    @Autowired
    private JogoRepository repository;

    @GetMapping (path = "/jogo/buscar")
    public List <JogoModel> list_all(){

        return repository.findAll();

    }

    @GetMapping (path = "jogo/buscar/{cod}")
    public JogoModel search (@PathVariable Integer cod){

        return repository.findById(cod).get();

    }

    @PostMapping (path = "/jogo/salvar")
    public JogoModel save (@RequestBody JogoModel jogo){

        return repository.save(jogo);

    }

    @DeleteMapping (path = "/jogo/delete/{id}")
    public void delete (@PathVariable ("id") Integer id ){
        repository.deleteById(id);
    }

}
