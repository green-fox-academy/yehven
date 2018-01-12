package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

  static List <BankAccount> listOfAccounts = new ArrayList<>();

  public WebController() {
    listOfAccounts.add(new BankAccount("Simba", 2000.00, "lion", true,true));
    listOfAccounts.add(new BankAccount("Nala", 1900.00, "lion",false, true));
    listOfAccounts.add(new BankAccount("Mufasza", 1000.00, "lion",false,false));
    listOfAccounts.add(new BankAccount("Timon", 1000.00, "meerkat", true, true));
    listOfAccounts.add(new BankAccount("Pumbaa", 1000.00, "warthog", false,true));
  }

  @RequestMapping (value = "/show")
  public String showOneAccount(Model model){
    BankAccount showOneAccount = new BankAccount("Simba", 2000.00, "lion", true,true);
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
    model.addAttribute("accounts", listOfAccounts);
    model.addAttribute("selectedaccount", new BankAccount());
    return "basicTemplate3";
  }

  @RequestMapping(value = "/multiaccounts/raise", method = RequestMethod.POST)
  public ModelAndView raise(Model model, @ModelAttribute BankAccount bankAccount) {
    for (BankAccount account1 : listOfAccounts) {
      if (account1.getName().equals(bankAccount.getName())) {
        account1.increaseBalance();
      }
    }
    model.addAttribute("listOfAccounts", listOfAccounts);
    return new ModelAndView("redirect:/multiaccounts");
  }

}
