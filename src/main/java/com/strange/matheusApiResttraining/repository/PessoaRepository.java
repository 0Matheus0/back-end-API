package com.strange.matheusApiResttraining.repository;

import com.strange.matheusApiResttraining.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {

}
