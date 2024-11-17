package com.mycompany.poop4;

public class Triangulo {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea() {
        return (base * altura) / 2;
    }

    public float calcularPerimetro() {
        return 3 * base;
    }

    public void Angulos() {
        System.out.println("Un ángulo es de 90.");
        System.out.println("Dos ángulos que se tienen que calcular.");
    }
}
