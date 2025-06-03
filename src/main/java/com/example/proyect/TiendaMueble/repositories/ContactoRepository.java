package com.example.proyect.TiendaMueble.repositories;

import com.example.proyect.TiendaMueble.models.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Long> {
    // Nada adicional por ahora
}
