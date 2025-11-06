package br.com.victorcabral.desafio_todolist.service;

import br.com.victorcabral.desafio_todolist.dto.TodoDTO;
import br.com.victorcabral.desafio_todolist.entity.Todo;
import br.com.victorcabral.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoDTO> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<TodoDTO> list(){

        return todoRepository.findAll(Sort.by("prioridade").descending().and(Sort.by("nome").ascending()))
                .stream().map(TodoDTO::new).toList();

        //Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        //return todoRepository.findAll(sort);
    }

    public List<TodoDTO> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<TodoDTO> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

}
