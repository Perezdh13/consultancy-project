package com.example.CRUD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@SpringBootApplication
@Controller
public class CrudApplication {


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
		@GetMapping("/")
		public String inicio () {
			return "index";
		}




}
