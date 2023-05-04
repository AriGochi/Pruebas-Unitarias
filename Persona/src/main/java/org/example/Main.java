package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Panchito", 19, 1.58, 52, "Femenino");

        //Imprimir los detalles
        persona.comer();
        persona.bailar();
        persona.bañar();

        //Cambiar datos
        persona.setNombre("Maria");
        persona.setEdad(22);
        System.out.println(persona);
    }
}