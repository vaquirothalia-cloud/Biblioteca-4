package com.biblioteca.demo.service;

import com.biblioteca.demo.model.Libro;
import com.biblioteca.demo.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository repo;

    public LibroService(LibroRepository repo) {
        this.repo = repo;
    }

    public List<Libro> listarTodos() {
        return repo.findAll();
    }

    public List<Libro> buscarPorAutor(String autor) {
        return repo.findByAutorContainingIgnoreCase(autor);
    }

    public Optional<Libro> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public Libro crear(Libro libro) {
        validar(libro);
        if (libro.getDisponible() == null) libro.setDisponible(Boolean.TRUE);
        return repo.save(libro);
    }

    public Libro actualizar(Long id, Libro cambios) {
        validar(cambios);
        return repo.findById(id).map(l -> {
            l.setTitulo(cambios.getTitulo());
            l.setAutor(cambios.getAutor());
            l.setAnioPublicacion(cambios.getAnioPublicacion());
            l.setDisponible(cambios.getDisponible());
            return repo.save(l);
        }).orElseThrow(() -> new RuntimeException("Libro no encontrado con id: " + id));
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    private void validar(Libro libro) {
        if (libro.getTitulo() == null || libro.getTitulo().isBlank()) {
            throw new IllegalArgumentException("El título es obligatorio");
        }
        if (libro.getAutor() == null || libro.getAutor().isBlank()) {
            throw new IllegalArgumentException("El autor es obligatorio");
        }
        if (libro.getAnioPublicacion() == null || libro.getAnioPublicacion() <= 0) {
            throw new IllegalArgumentException("El año de publicación debe ser un número positivo");
        }
    }
}
