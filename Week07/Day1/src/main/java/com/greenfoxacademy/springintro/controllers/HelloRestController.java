package com.greenfoxacademy.springintro.controllers;

import com.greenfoxacademy.springintro.Models.Greeting;
import com.greenfoxacademy.springintro.Models.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {
  private AtomicLong counter = new AtomicLong(1);
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting sayHello(Model model, @RequestParam (value = "name", required = false) String name) {
      if (name == null) {
        name = "World";
      }
      model.addAttribute("name", name);
      return new Greeting(counter.incrementAndGet(),"Hello, " + name + "!");
    }
}
