package com.greenfox.demo.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  public String log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    return message;
  }
}
