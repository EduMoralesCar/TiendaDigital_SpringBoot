package com.example.proyect.TiendaMueble.models;

public class Pais {
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