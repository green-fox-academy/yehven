package com.greenfoxacademy.exercise02.repositories;

import com.greenfoxacademy.exercise02.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

  List<Todo> findAllByTitleContaining (String title);
}
