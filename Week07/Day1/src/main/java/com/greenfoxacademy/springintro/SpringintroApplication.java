package com.greenfoxacademy.springintro;

import jdk.internal.org.objectweb.asm.util.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringintroApplication {

		public void main(String[] args) {
			SpringApplication.run(SpringintroApplication.class, args);
		}
}
