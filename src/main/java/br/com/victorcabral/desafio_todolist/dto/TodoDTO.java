package br.com.victorcabral.desafio_todolist.dto;

import br.com.victorcabral.desafio_todolist.entity.Todo;
import org.springframework.beans.BeanUtils;

public class TodoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

    public TodoDTO(){
    }

    public TodoDTO(Todo entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
