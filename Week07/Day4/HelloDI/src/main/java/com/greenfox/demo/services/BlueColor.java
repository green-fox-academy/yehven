package com.greenfox.demo.services;

import org.springframework.stereotype.Service;


public class BlueColor implements MyColor {
  @Override
  public String printColor() {
    return "It is blue ya nigga! Can't you see???";
  }
}
