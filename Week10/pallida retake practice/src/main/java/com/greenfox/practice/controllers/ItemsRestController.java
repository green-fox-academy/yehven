package com.greenfox.practice.controllers;

import com.greenfox.practice.models.Response;
import com.greenfox.practice.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsRestController {

  @Autowired
  ItemsService itemsService;

  @GetMapping("/shoppingplanner/query")
  public Response response (@RequestParam Integer price,@RequestParam String type){
    return itemsService.result(price,type);
  }
}
