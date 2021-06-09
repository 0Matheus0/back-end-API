package com.strange.matheusApiResttraining.repository;

import com.strange.matheusApiResttraining.model.JogoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository <JogoModel, Integer> {

}


// nome interface extende LigaçãoBanco <Nome da entidade, tipo do identificador>
