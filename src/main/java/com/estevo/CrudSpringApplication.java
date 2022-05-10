package com.estevo;

import com.estevo.model.Tarefa;
import com.estevo.repositorio.TarefaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(TarefaRepository tarefaRepository){
		return args -> {
			tarefaRepository.deleteAll();

			Tarefa t1 = new Tarefa();
			t1.setTitulo("Estudar");
			t1.setDescricao("Estudar à noite");
			t1.setResponsavel("Eu mesmo");
			t1.setPrioridade("Alta");
			t1.setData("09/05/2022");

			tarefaRepository.save(t1);

			Tarefa t2 = new Tarefa();
			t2.setTitulo("Fazer Projeto");
			t2.setDescricao("Fazero o Projeto para ESIG");
			t2.setResponsavel("Estevo");
			t2.setPrioridade("Baixa");
			t2.setData("09/05/2022");

			tarefaRepository.save(t2);
		};
	}

}
