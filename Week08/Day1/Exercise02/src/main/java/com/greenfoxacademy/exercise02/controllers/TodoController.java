package com.greenfoxacademy.exercise02.controllers;

import com.greenfoxacademy.exercise02.models.Todo;
import com.greenfoxacademy.exercise02.repositories.TodoRepository;
import com.greenfoxacademy.exercise02.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping(value = {"/", "/list"})
  public String list (Model model){
    List<Todo> listOfTodos = todoService.getAlltodos();
    model.addAttribute("listOfTodos",listOfTodos);
    return "todoslist";
  }

}

