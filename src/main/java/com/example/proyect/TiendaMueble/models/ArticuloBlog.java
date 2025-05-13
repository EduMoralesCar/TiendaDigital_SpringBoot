package com.example.proyect.TiendaMueble.models;

public class ArticuloBlog {

    private String id;
    private String titulo;
    private String imagen;
    private String fecha;
    private String autor;
    private String subtitulo;
    private String contenido;
    private String enlace;

    // Constructor
    public ArticuloBlog(String id, String titulo, String imagen, String fecha,
                        String autor, String subtitulo, String contenido, String enlace) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.fecha = fecha;
        this.autor = autor;
        this.subtitulo = subtitulo;
        this.contenido = contenido;
        this.enlace = enlace;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public String getAutor() {
        return autor;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getEnlace() {
        return enlace;
    }
}