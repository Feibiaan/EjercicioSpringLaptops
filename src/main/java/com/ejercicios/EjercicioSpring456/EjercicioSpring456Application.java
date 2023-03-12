package com.ejercicios.EjercicioSpring456;

import com.ejercicios.EjercicioSpring456.entities.Laptop;
import com.ejercicios.EjercicioSpring456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class EjercicioSpring456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioSpring456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// CRUD
		// Crear ordenador
		Laptop laptop1 = new Laptop(null,
				"HP",
				"Omen",
				750.99,
				LocalDate.of(2019, 4, 4));
		Laptop laptop2 = new Laptop(null,
				"DELL",
				"Agatha",
				885.99,
				LocalDate.of(2022, 7, 4));

		// Almacenar un ordenador
		repository.save(laptop1);
		repository.save(laptop2);
	}

}
