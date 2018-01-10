package com.greenfoxacademy.springintro.controllers;

import com.greenfoxacademy.springintro.Models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong counter = new AtomicLong(1);
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  String [] colors = {"blue", "red", "green", "yellow", "pink", "grey", "brown", "orange", "plum", "purple", "lime", "aqua", "cornsilk", "peru", "lightslategrey", "beige"};
  @GetMapping("/hello")
    public String helloWebPage (Model model, @RequestParam(value = "name", required = false) String name){
      if (name == null) {
        name = "World";
      }
      model.addAttribute("name", name);
      model.addAttribute("counter", counter.incrementAndGet());
      model.addAttribute("hello", hellos[new Random().nextInt(hellos.length)]);
      model.addAttribute("color", colors[new Random().nextInt(colors.length)]);
      model.addAttribute("fontsize", (int) (Math.random()*(100-6))+6);
      return "Hello";
    }

}
