package com.nttdata.microservicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microservicio1Application {
	//Para crear varias instacias de un microservicio duplicamos 
	//el .yml y el archivo de ejecución e indicamos el puerto
	public static void main(String[] args) {
		SpringApplication.run(Microservicio1Application.class, args);
	}
}
