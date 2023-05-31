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
public class registroPractice1 {
    String tipo, marca, modelo;
    int cc, capacidad;

    public static void main(String[] args) {
        registroPractice1 car = new registroPractice1();
        registroPractice1 car1 = new registroPractice1();
        registroPractice1 car2 = new registroPractice1();
        registroPractice1 car3 = new registroPractice1();

        car = set(car, "muscle car", "chevrolet", "camaro ss", 6162, 4);
        print(car);
        car1 = set(car1, "coupe", "audi", "r8", 5204, 4);
        print(car1);
        car2 = set(car2, "coupe", "nissan", "GTR skyline r34", 2568, 2);
        print(car2);
        car3 = set(car3, "muscle car", "dodge", "str challenger hellcat demon", 6166, 5);
        print(car3);
        
    }

    public static void print(registroPractice1 Car) {
        System.out.println("---------------------------------");
        System.out.println("tipo:       " + Car.tipo);
        System.out.println("marca:      " + Car.marca);
        System.out.println("modelo:     " + Car.modelo);
        System.out.println("cilindrada: " + Car.cc + "cc");
        System.out.println("capacidad:  " + Car.capacidad);
    }

    public static registroPractice1 set(registroPractice1 Car, String tipo, String marca, String modelo, int cc,
            int capacidad) {
        Car.tipo = tipo;
        Car.marca = marca;
        Car.modelo = modelo;
        Car.cc = cc;
        Car.capacidad = capacidad;
        return Car;
    }
}
