package com.example.proyect.TiendaMueble.models;
import jakarta.persistence.*;

@Entity
@Table(name = "articulos_blog")
public class ArticuloBlog {
    @Id
    private String id;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(nullable = false, length = 255)
    private String imagen;

    @Column(nullable = false, length = 50)
    private String fecha;

    @Column(nullable = false, length = 100)
    private String autor;

    @Column(nullable = false, length = 200)
    private String subtitulo;

    @Column(nullable = false, length = 2000)
    private String contenido;

    @Column(nullable = false, length = 255)
    private String enlace;

    // Constructor vacío necesario para JPA
    public ArticuloBlog() {
    }

    // Constructor con parámetros
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}