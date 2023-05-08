package org.example;

public class Computadora {
    private String marca;
    private Mouse raton;

    public Computadora() {
    }

    public Computadora(String marca, Mouse raton) {
        this.marca = marca;
        this.raton = raton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", raton=" + raton +
                '}';
    }
}
