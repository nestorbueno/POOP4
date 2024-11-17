package com.mycompany.poop4;

public class Perro {
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;

    public Perro() {
        color = null;
        pelaje = null;
        tamaño = 0;
        raza = null;
        edad = 0;
    }

    public Perro(String color, String pelaje, int tamaño, String raza, int edad) {
        this.color = color;
        this.pelaje = pelaje;
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
    }

    public void imprimePerro() {
        System.out.println("Perro [color=" + color + ", pelaje=" + pelaje + ", tamaño=" + tamaño
                + ", raza=" + raza + ", edad=" + edad + "]");
    }

    public void jugar() {
        System.out.println("El perro está jugando.");
    }

    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    public void morder() {
        System.out.println("El perro está mordiendo.");
    }

    public void saltar(float altura, int distancia, int velocidad) {
        System.out.println("El perro saltó una altura de " + altura + " metros, "
                + "una distancia de " + distancia + " metros y a una velocidad de " + velocidad + " m/s.");
    }
}
