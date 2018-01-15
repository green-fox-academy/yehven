package com.greenfoxacademy.exercise1;

import com.greenfoxacademy.exercise1.models.Todo;
import com.greenfoxacademy.exercise1.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise1Application implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercise1Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		todoRepository.save(new Todo("Get some water"));
		todoRepository.save(new Todo("Eat some food"));
		todoRepository.save(new Todo("Kick some asses"));
		todoRepository.save(new Todo("Get some sleep"));
	}
}
