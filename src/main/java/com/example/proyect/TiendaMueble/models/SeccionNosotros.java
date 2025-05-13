package com.example.proyect.TiendaMueble.models;

public class SeccionNosotros {
    private String id;
    private String titulo;
    private String contenido;
    private String imagen;
    private boolean imagenIzquierda;

    // Constructor
    public SeccionNosotros(String id, String titulo, String contenido, String imagen, boolean imagenIzquierda) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.imagen = imagen;
        this.imagenIzquierda = imagenIzquierda;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getImagen() {
        return imagen;
    }

    public boolean isImagenIzquierda() {
        return imagenIzquierda;
    }
}