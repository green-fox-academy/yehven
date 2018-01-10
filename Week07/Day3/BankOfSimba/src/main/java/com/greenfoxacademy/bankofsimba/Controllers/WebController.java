package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

  @RequestMapping (value = "/show")
  public String showOneAccount(Model model){
    BankAccount showOneAccount = new BankAccount("Simba", 2000.00, "lion");
    model.addAttribute("name", showOneAccount.getName());
    model.addAttribute("balance", String.format("%.2f",showOneAccount.getBalance()));
    model.addAttribute("animalType", showOneAccount.getAnimalType());
    return "basicTemplate";
  }
}
