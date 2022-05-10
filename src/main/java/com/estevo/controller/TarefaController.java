package com.estevo.controller;

import java.util.List;

import com.estevo.model.Tarefa;
import com.estevo.repositorio.TarefaRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Tarefa create(@RequestBody Tarefa tarefa){
        //System.out.println(tarefa.getTitulo());

        // salvando valores no BD
         return tarefaRepository.save(tarefa);
        // return ResponseEntity.status(HttpStatus.CREATED).body(tarefaRepository.save(tarefa));
    }
    
}
