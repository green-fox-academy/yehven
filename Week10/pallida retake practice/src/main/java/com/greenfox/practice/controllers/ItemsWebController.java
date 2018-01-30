package com.greenfox.practice.controllers;

import com.greenfox.practice.models.Items;
import com.greenfox.practice.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsWebController {
  @Autowired
  ItemsService itemsService;

  @GetMapping ("/shoppingplanner")
  public String listAllItems (Model model){
    model.addAttribute("listOfItems", itemsService.listAllItems());
    model.addAttribute("distinctItem", itemsService.getDistinctItemNames());
    model.addAttribute("distinctSize", itemsService.getDistinctItemSizes());
    return "index";
  }

  @PostMapping ("/shoppingplanner/summary")
  public String showSummary (@RequestParam String itemName,
                             @RequestParam String distinctSize,
                             @RequestParam int quantity, Model model) {
    Items item = itemsService.getNameAndSize(itemName,distinctSize);
    item.setInStore(quantity);
    int totalPrice = item.getInStore()*item.getUnitPrice();
    model.addAttribute("listOfItem", item);
    model.addAttribute("totalPrice", totalPrice);
  return "summary";
  }
}
