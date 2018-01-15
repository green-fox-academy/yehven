package com.greenfoxacademy.exercise1.repositories;

import com.greenfoxacademy.exercise1.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
