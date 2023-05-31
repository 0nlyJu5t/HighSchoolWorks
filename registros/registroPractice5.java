/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registropractice;

/**
 *
 * @author JDM
 */
import java.util.Scanner;

public class registroPractice5 {
    //nombre, genero, edad, estatura, peso;
    String nombre, genero;
    int edad;
    double estatura, peso;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        registroPractice5[] person = new registroPractice5[20];

        for (int i = 0; i < person.length; i++) {
            person[i] = new registroPractice5();
            System.out.println("-----------persona-" + (i + 1) + "----------");
            System.out.println("ingrese el nombre de la " + (i + 1) + " persona: ");
            person[i].nombre = sc.nextLine();
            System. out.println("ingrese el genero de " + person[i].nombre + ": ");
            person[i].genero = sc.nextLine();
            System.out.println("ingrese la edad de " + person[i].nombre + ": ");
            person[i].edad = sc.nextInt();
            System.out.println("ingrese la estatura de " + person[i].nombre + ": ");
            person[i].estatura = sc.nextDouble();
            System.out.println("ingrese el peso de " + person[i].nombre + ": ");
            person[i].peso = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println("-----------persona-" + (i + 1) + "----------");
            System.out.println("nombre:   " + person[i].nombre);
            System.out.println("edad:     " + person[i].edad);
            System.out.println("estatura: " + person[i].estatura);
            System.out.println("peso:     " + person[i].peso);
            System.out.println("genero:   " + person[i].genero);
            System.out.println("inicial:  " + person[i].nombre.charAt(0));
        }
    }

}
