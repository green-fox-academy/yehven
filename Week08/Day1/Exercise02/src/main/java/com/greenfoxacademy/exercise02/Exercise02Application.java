package com.greenfoxacademy.exercise02;

import com.greenfoxacademy.exercise02.models.Todo;
import com.greenfoxacademy.exercise02.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise02Application implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercise02Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}

