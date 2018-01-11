package com.greenfox.demo;

import com.greenfox.demo.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDiApplication implements CommandLineRunner{

	@Autowired
	Printer printer;

	public static void main(String[] args) {
		SpringApplication.run(HelloDiApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    printer.log("Skraaaaa");
  }
}
