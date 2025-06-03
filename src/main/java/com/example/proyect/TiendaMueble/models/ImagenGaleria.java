package com.example.proyect.TiendaMueble.models;
import jakarta.persistence.*;

@Entity
@Table(name = "imagenes_galeria")
public class ImagenGaleria {
    @Id
    private String id;

    @Column(nullable = false, length = 255)
    private String ruta;

    @Column(nullable = false, length = 100)
    private String alt;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriaGaleria categoria;

    // Constructor vacío necesario para JPA
    public ImagenGaleria() {
    }

    // Constructor con parámetros
    public ImagenGaleria(String id, String ruta, String alt, CategoriaGaleria categoria) {
        this.id = id;
        this.ruta = ruta;
        this.alt = alt;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public CategoriaGaleria getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaGaleria categoria) {
        this.categoria = categoria;
    }
}