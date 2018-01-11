package com.greenfox.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
  @Override
  public String printColor() {
    return "It is green ya nigga! Can't you see???";
  }
}
