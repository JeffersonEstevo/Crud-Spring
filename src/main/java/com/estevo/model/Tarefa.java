package com.estevo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // para gerar getters e setters atraves do lombok
@Entity // pois essa classe sera uma tabela no BD
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column
    private String responsavel;

    @Column
    private String prioridade;

    @Column
    private String data;


}
