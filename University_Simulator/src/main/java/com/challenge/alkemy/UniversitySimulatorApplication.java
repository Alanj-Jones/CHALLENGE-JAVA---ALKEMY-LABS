package com.challenge.alkemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// (exclude = {DataSourceAutoConfiguration.class })
//Quitar los parentesis cuando configuremos la base de datos.
@SpringBootApplication
public class UniversitySimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitySimulatorApplication.class, args);
	}

}
