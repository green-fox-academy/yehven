package com.greenfoxacademy.exercise1.services;

import com.greenfoxacademy.exercise1.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getAlltodos();
  Todo getTodo(int id);
  void modifyTitle(Todo todo);
  void save (Todo todo);
  void delete(int id);

}
