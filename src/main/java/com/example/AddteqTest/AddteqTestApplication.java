package com.example.AddteqTest;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddteqTestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AddteqTestApplication.class, args); 
		SpringApplication app = new SpringApplication(AddteqTestApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8084"));
        app.run(args);
       
	}

}
