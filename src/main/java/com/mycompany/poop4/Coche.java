/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author bueno
 */
public class Coche {
    String marca;
    String modelo;
    int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void encender() {
        System.out.println("El coche " + marca + " " + modelo + " se ha encendido.");
    }

    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " esta acelerando.");
    }

    public void frenar() {
        System.out.println("El coche " + marca + " " + modelo + " esta frenando.");
    }
}
