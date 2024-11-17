/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author bueno
 */
public class Alumno {
    private String nombre;
    private String clase;

    public Alumno(String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
    }

    public void estudiar() {
        System.out.println(nombre + " esta estudiando.");
    }

    public void hacerExamen() {
        System.out.println(nombre + " esta haciendo un examen.");
    }

    public void asistirClase() {
        System.out.println(nombre + " esta asistiendo a la clase de " + clase + ".");
    }
}