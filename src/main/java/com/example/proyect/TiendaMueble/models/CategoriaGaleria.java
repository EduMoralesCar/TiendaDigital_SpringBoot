package com.example.proyect.TiendaMueble.models;

import java.util.List;

public class CategoriaGaleria {
    private String id;
    private String nombre;
    private List<ImagenGaleria> imagenes;

    // Constructor
    public CategoriaGaleria(String id, String nombre, List<ImagenGaleria> imagenes) {
        this.id = id;
        this.nombre = nombre;
        this.imagenes = imagenes;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<ImagenGaleria> getImagenes() {
        return imagenes;
    }
}
