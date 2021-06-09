package com.strange.matheusApiResttraining.controller;


import com.strange.matheusApiResttraining.model.PessoaModel;
import com.strange.matheusApiResttraining.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository repository;                                   //O que acontece se deixar public?

    @GetMapping (path = "/pessoa/buscar")
    public List  <PessoaModel> list_all(){
        return repository.findAll();
    }

    @GetMapping (path = "/pessoa/buscar/{codigo}")
    public PessoaModel search (@PathVariable Integer id){

        return repository.findById(id).get();

    }

    @PostMapping (path = "/pessoa/salvar")
    public PessoaModel save (@RequestBody PessoaModel pessoa){

        return repository.save(pessoa);

    }

    @DeleteMapping (path = "/pessoa/deletar/{codigo}")
    public void delete(@PathVariable ("codigo") Integer codigo){

        repository.deleteById(codigo);

    }




}
