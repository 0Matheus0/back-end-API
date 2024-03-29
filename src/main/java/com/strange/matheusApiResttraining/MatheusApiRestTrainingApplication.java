package com.strange.matheusApiResttraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class MatheusApiRestTrainingApplication {

	@PostConstruct
	public void init (){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
	}

	public static void main(String[] args) {
		SpringApplication.run(MatheusApiRestTrainingApplication.class, args);
	}

}
