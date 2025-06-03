package com.example.proyect.TiendaMueble.repositories;

import com.example.proyect.TiendaMueble.models.ArticuloBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloBlogRepository extends JpaRepository<ArticuloBlog, String> {
    // Nada adicional por ahora
}