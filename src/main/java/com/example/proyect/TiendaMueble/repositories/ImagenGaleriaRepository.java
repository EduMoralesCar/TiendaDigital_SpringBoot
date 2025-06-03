package com.example.proyect.TiendaMueble.repositories;

import com.example.proyect.TiendaMueble.models.ImagenGaleria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ImagenGaleriaRepository extends JpaRepository<ImagenGaleria, String> {
    List<ImagenGaleria> findByCategoriaId(String categoriaId);
    // Nada adicional por ahora
}