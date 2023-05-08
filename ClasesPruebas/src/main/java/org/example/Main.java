package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Automovil");
        Automovil auto1 = new Automovil("Nissan", "Skylan", (byte) 63, "Azul");
        System.out.println(auto1);
        auto1.encender();
        auto1.apagar();
        auto1.estacinando();


        System.out.println("\n Monitor");
        Monitor m1 = new Monitor(14.2,"LG","3570Lg","Oled", 15.799);
        System.out.println(m1);
        m1.encender();
        m1.apagar();
        m1.proyectar();


        System.out.println("\n Guitarra");
        Guitarra g1 = new Guitarra("Yamaha",6,"Electrica", Color.GREEN);
        System.out.println(g1);
        g1.tocar();
        g1.guardar();
        g1.conectar();
    }
}