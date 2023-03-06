package com.example.CRUD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "every body") String name) {
		return String.format("Hello  peopleee %s!", name);
	}
	@GetMapping("/createtask")
	public String create(@RequestParam(value = "task", defaultValue = "pan")String task){
		return String.format("comprar %s!", task);
	}
}
