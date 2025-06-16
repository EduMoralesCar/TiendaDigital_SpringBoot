package com.example.proyect.TiendaMueble.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;

    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}

//@Entity marca una clase como una entidad JPA, lo que significa que se mapeará a una tabla en la base de datos.
//@Id indica que un campo es la clave primaria (PK) de la tabla.
//@Column personaliza cómo un campo se mapea a una columna en la BD (nombre, longitud, si es nullable, etc.).
//@OneToMany / @ManyToOne: Definen relaciones entre entidades (1-N, N-1).
//@Table especifica el nombre de la tabla en la base de datos