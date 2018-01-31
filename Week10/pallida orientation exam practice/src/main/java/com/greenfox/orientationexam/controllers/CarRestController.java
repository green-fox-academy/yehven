package com.greenfox.orientationexam.controllers;

import com.greenfox.orientationexam.models.Response;
import com.greenfox.orientationexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {
  @Autowired
  CarService carService;

  @GetMapping("/api/search/{brand}")
  public Response restBrandResponse(@PathVariable String brand) {
    return carService.restRespoonse(brand);
  }
}
