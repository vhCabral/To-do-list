package br.com.victorcabral.desafio_todolist.repository;

import br.com.victorcabral.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
