package org.example;

import java.util.Arrays;

public class Mascota {
    private String[] Nombre;
    private String[] Tipo;
    private String[] Tamaño;

    public Mascota() {
    }

    public Mascota(String[] nombre, String[] tipo, String[] tamaño) {
        Nombre = nombre;
        Tipo = tipo;
        Tamaño = tamaño;
    }

    public String[] getNombre() {
        return Nombre;
    }

    public void setNombre(String[] nombre) {
        Nombre = nombre;
    }

    public String[] getTipo() {
        return Tipo;
    }

    public void setTipo(String[] tipo) {
        Tipo = tipo;
    }

    public String[] getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String[] tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "Nombre=" + Arrays.toString(Nombre) +
                ", Tipo=" + Arrays.toString(Tipo) +
                ", Tamaño=" + Arrays.toString(Tamaño) +
                '}';
    }

    public void setNombre(int index, String dato) {
        Nombre[index] = dato;
    }

    public void setTipo(int index, String dato) {
        Tipo[index] = dato;
    }

    public void setTamaño(int index, String dato) {
        Tamaño[index] = dato;
    }
}