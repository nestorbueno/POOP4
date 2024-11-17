/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poop4;


/**
 *
 * @author bueno
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(1,2,"punto 2");
        punto2.imprimePunto();       
        
        punto.x=20;
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        System.out.println(punto);
        
        //
        Perro perro = new Perro();
        perro.imprimePerro();
        /**
         * Perro perro2 = new Perro("negro", "negro", 3, "doberman", 10, 4.0, 5.0, 6.0);
         * perro2.imprimePerro();
         */
        
        perro.color = "cafe";
        perro.pelaje = "cafe";
        perro.tamaño = 5;
        perro.raza = "chihuahua";
        perro.edad = 3;
        perro.imprimePerro();
        perro.jugar();
        perro.comer();
        perro.correr();
        perro.morder();
        perro.saltar(2.5f,4,7);
        //
        Triangulo triangulo = new Triangulo(5, 4);
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
        triangulo.Angulos();
        
        Alumno alumno = new Alumno("Nestor", "Calculo");
        alumno.estudiar();
        alumno.hacerExamen();
        alumno.asistirClase();
        
        Coche coche = new Coche("Ford", "Mustang", 2023);
        coche.encender();
        coche.acelerar();
        coche.frenar();
    }
}





