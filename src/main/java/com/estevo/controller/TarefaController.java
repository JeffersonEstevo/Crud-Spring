package com.estevo.controller;

import java.util.List;

import com.estevo.model.Tarefa;
import com.estevo.repositorio.TarefaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController // para informar que esta classe é um endpoint, para acessar a API
@RequestMapping("/api/tarefas")
@AllArgsConstructor
public class TarefaController {
    
    private TarefaRepository tarefaRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping // para usar metodo GET do SERVLET
    public List<Tarefa> list() {
        return tarefaRepository.findAll();
    }

    
}
