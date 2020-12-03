package com.example.semana06_reclycleview;

public class Restaurante {

    private String name;
    private String foto;
    private float  valoracion;
    private String direccion;

    public Restaurante(String name, String foto, float valoracion, String direccion) {
        this.name = name;
        this.foto = foto;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
