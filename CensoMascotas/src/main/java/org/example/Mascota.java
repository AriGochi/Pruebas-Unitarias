package org.example;

public class Mascota {
    private String Nombre;
    private String Tipo;
    private String Tamaño;

    public Mascota() {
    }

    public Mascota(String nombre, String tipo, String tamaño) {
        Nombre = nombre;
        Tipo = tipo;
        Tamaño = tamaño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "Nombre='" + Nombre + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                '}';
    }
}
