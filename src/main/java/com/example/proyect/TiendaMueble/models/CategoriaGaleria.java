package com.example.proyect.TiendaMueble.models;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias_galeria")
public class CategoriaGaleria {
    @Id
    private String id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ImagenGaleria> imagenes;

    // Constructor vacío necesario para JPA
    public CategoriaGaleria() {
    }

    // Constructor con parámetros
    public CategoriaGaleria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ImagenGaleria> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenGaleria> imagenes) {
        this.imagenes = imagenes;
    }
}
