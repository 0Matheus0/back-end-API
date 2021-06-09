package com.strange.matheusApiResttraining.repository;

import com.strange.matheusApiResttraining.model.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository <AgendaModel, Integer> {


}
