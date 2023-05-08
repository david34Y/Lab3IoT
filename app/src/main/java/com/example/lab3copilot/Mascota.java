package com.example.lab3copilot;

public class Mascota {

    private String nombre;
    private Boolean genero;
    private String dueno;
    private String dni;
    private String descripcion;
    private String ruta;

    public Mascota(String nombre, Boolean genero, String dueno, String dni, String descripcion, String ruta) {

        this.nombre = nombre;
        this.genero = genero;
        this.dueno = dueno;
        this.dni = dni;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }
    public Mascota(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
