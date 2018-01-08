package com.greenfoxacademy.springintro.controllers;

import com.greenfoxacademy.springintro.Models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @GetMapping("/hello")
    public String helloWebPage (Model model, @RequestParam(value = "name", required = false) String name){
      if (name == null) {
        name = "World";
      }
      model.addAttribute("name", name);
      return "Hello";
    }

}
