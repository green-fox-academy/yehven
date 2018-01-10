package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

  @RequestMapping (value = "/end")
  public String htmlception (Model model){
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("lception", text);
    return "basicTemplate2";
  }

  @RequestMapping (value = "/multiaccounts")
  public String multiaccounts (Model model){
    List <BankAccount> listOfAccounts = new ArrayList<BankAccount>();
    BankAccount account1 = new BankAccount("Simba", 2000.00, "lion");
    BankAccount account2 = new BankAccount("Nala", 1900.00, "lion");
    BankAccount account3 = new BankAccount("Zazu", 3000.00, "bird");
    BankAccount account4 = new BankAccount("Timon", 1000.00, "meerkat");
    BankAccount account5 = new BankAccount("Pumbaa", 1000.00, "warthog");
    listOfAccounts.add(account1);
    listOfAccounts.add(account2);
    listOfAccounts.add(account3);
    listOfAccounts.add(account4);
    listOfAccounts.add(account5);
    model.addAttribute("accounts", listOfAccounts);
    return "basicTemplate3";
  }
}
