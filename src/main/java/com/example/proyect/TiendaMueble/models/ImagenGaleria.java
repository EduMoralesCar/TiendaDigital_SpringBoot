package com.example.proyect.TiendaMueble.models;

public class ImagenGaleria {
    private String id;
    private String ruta;
    private String alt;

    // Constructor
    public ImagenGaleria(String id, String ruta, String alt) {
        this.id = id;
        this.ruta = ruta;
        this.alt = alt;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getRuta() {
        return ruta;
    }

    public String getAlt() {
        return alt;
    }
}