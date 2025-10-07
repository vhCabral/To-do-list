package br.com.victorcabral.desafio_todolist.controller;

import br.com.victorcabral.desafio_todolist.entity.Todo;
import br.com.victorcabral.desafio_todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping()
    public List<Todo> list(){
        return todoService.list();
    }

    @PostMapping()
    public List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @PutMapping()
    public List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    public List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
}
