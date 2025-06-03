package com.example.proyect.TiendaMueble.repositories;

import com.example.proyect.TiendaMueble.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Nada adicional por ahora
}