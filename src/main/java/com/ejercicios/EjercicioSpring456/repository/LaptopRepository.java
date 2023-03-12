package com.ejercicios.EjercicioSpring456.repository;

import com.ejercicios.EjercicioSpring456.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
