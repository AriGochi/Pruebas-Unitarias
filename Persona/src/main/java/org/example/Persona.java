package org.example;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, int edad, double estatura, double peso, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero=" + genero +
                '}';
    }

    public boolean comer(){
        System.out.println(nombre + " esta comiendo" );
        return true;
    }

    public boolean bailar(){
        System.out.println(nombre + " esta bailando");
        return true;
    }

    public boolean bañar(){
        System.out.println(nombre + " se esta bañando");
        return true;
    }
}


