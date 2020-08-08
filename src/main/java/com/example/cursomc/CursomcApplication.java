package com.example.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

}
//Se quiser trocar de servidor, acessar "aplication.properties" >> digitar "server.port=${port:xxxx}"