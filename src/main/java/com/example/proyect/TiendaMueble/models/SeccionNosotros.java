package com.example.proyect.TiendaMueble.models;

import jakarta.persistence.*;

@Entity
@Table(name = "secciones_nosotros")
public class SeccionNosotros {
    @Id
    private String id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 2000)
    private String contenido;

    @Column(nullable = false, length = 255)
    private String imagen;

    @Column(nullable = false)
    private boolean imagenIzquierda;

    // Constructor vacío necesario para JPA
    public SeccionNosotros() {
    }

    // Constructor con parámetros
    public SeccionNosotros(String id, String titulo, String contenido, String imagen, boolean imagenIzquierda) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.imagen = imagen;
        this.imagenIzquierda = imagenIzquierda;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isImagenIzquierda() {
        return imagenIzquierda;
    }

    public void setImagenIzquierda(boolean imagenIzquierda) {
        this.imagenIzquierda = imagenIzquierda;
    }
}