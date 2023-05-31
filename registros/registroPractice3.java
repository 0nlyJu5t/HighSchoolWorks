/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registropractice;

import java.util.Scanner;

/**
 *
 * @author JDM
 */

public class registroPractice3 {
    String nombre, genero;
    int edad;
    double estatura, peso;

    public static void main(String[] args) {
        registroPractice3 person = new registroPractice3();
        registroPractice3 person1 = new registroPractice3();

        person = set(person, "primera");
        person1 = set(person1, "segunda");

        print(person);
        print(person1);

    }

    public static registroPractice3 set(registroPractice3 person, String posicion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la " + posicion + " persona: ");
        person.nombre = sc.nextLine();
        System.out.println("ingrese el genero de " + person.nombre + ": ");
        person.genero = sc.nextLine();
        System.out.println("ingrese la edad de " + person.nombre + ": ");
        person.edad = sc.nextInt();
        System.out.println("ingrese la estatura de " + person.nombre + " en metros: ");
        person.estatura = sc.nextDouble();
        System.out.println("ingrese el peso de " + person.nombre + " en kilos: ");
        person.peso = sc.nextDouble();
        return person;
    }

    public static void print(registroPractice3 person) {
        System.out.println("---------------------------------");
        System.out.println("nombre:   " + person.nombre);
        System.out.println("edad:     " + person.edad);
        System.out.println("estatura: " + person.estatura + "m");
        System.out.println("peso:     " + person.peso + "kg");
        System.out.println("genero:   " + person.genero);
        System.out.println("inicial:  " + person.nombre.charAt(0));
    }
}
