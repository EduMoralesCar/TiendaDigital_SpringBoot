package com.example.proyect.TiendaMueble.repositories;

import com.example.proyect.TiendaMueble.models.CategoriaGaleria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaGaleriaRepository extends JpaRepository<CategoriaGaleria, String> {
    // Nada adicional por ahora
}