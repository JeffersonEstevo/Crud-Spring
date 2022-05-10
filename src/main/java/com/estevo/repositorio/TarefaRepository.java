package com.estevo.repositorio;

import com.estevo.model.Tarefa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // interface para extender interfaces JPA para acessa BD
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}
