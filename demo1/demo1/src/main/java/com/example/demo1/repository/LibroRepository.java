package com.example.demo1.repository;

import com.example.demo1.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByAutorContainingIgnoreCase(String autor);
}
