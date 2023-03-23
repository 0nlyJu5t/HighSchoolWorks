/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosfuncmetodprod;

/**
 *
 * @author justin David Dámito Sánchez 
 */

import java.util.Scanner;
public class FuncMetodProd_1 {
    public static final double PI = 3.14159265;
    public static void main(String[] args) {
            //estancaimiento 
        Scanner sc = new Scanner (System.in);
        
            //declaracion de variables 
        double r,d1,d2,l,h,b,l1,l2,l3;
            //entrada de datos
        System.out.println("~que figura desea calcular:");
        System.out.println("1-Circulo\n2-Rombo\n3-Cuadrado\n4-Triangulo\n5-Rectangulo");
        int op = sc.nextInt();
        
            //switch
        switch(op){
            case 1:
                System.out.println("~ingrese el radio del circulo: ");
                r = sc.nextInt();
                System.out.println("~Circulo\n~area: " + areaCirculo(r));//funcion circulo
                System.out.println("~perimetro: " + perimetroCirculo(r));//funcion circulo
            break;
            case 2:
                System.out.println("~ingrese la diagonal mayor del rombo: ");
                d1 = sc.nextInt();
                System.out.println("~ingrese la diagonal menor del rombo: ");
                d2 = sc.nextInt();
                System.out.println("~Rombo\n~area: " + areaRombo(d1,d2));//funcion rombo
                System.out.println("~perimetro: " + perimetroRombo(d1,d2));//funcion rombo
            break;
            case 3:
                System.out.println("~ingrese el lado de el cuadrado: ");
                l = sc.nextInt();
                System.out.println("~Cuadrado\n~area: " + areaCuadrado(l));//funcion cuadrado
                System.out.println("~perimetro: " + perimetroCuadrado(l));//funcion cuadrado
            break;
            case 4:
                System.out.println("~ingrese la base del triangulo :");
                b = sc.nextInt();
                System.out.println("~ingrese la altura del triangulo :");
                h = sc.nextInt();
                System.out.println("~ingrese los 3 lados del triangulo :");
                l1 = sc.nextInt();
                l2 = sc.nextInt();
                l3 = sc.nextInt();
                areaTriangulo(h,b);
                System.out.println("~Triangulo\n~area: " + areaTriangulo(h,b));//funcion triangulo
                System.out.println("~perimetro: " + perimetroTriangulo(l1,l2,l3));//funcion triangulo
            break;
            case 5:
                System.out.println("ingrese la base del rectangulo: ");
                b = sc.nextInt();
                System.out.println("ingrese la altura del rectangulo: ");
                h = sc.nextInt();
                System.out.println("~Rectangulo\n~area: " + areaRectangulo(h,b));//funcion rectangulo
                System.out.println("~perimetro: " + perimetroRectangulo(h,b));//funcion rectangulo
            break;
            default:
                System.out.println("~dato invalido");
        }   
}
        //metodos-funciones-procedimientos 
            //circulo
    public static double areaCirculo( double r){
        return PI * Math.pow(r,2);
    }
    public static double perimetroCirculo( double r){
        return 2 * PI * r;
    }
            //rombo
    public static double areaRombo(double d1 , double d2){
        return ( d1 * d2 ) / 2;
    }
    public static double perimetroRombo(double d1 , double d2){
        return 2 * Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
    }
            //cuadrado
    public static double areaCuadrado(double l){
        return Math.pow(l,2);
    }
    public static double perimetroCuadrado(double l){
        return 4 * l;
    }
            //triangulo        
    public static double areaTriangulo(double h ,double b){
        return (b * h) / 2;
    }
    public static double perimetroTriangulo(double l1,double l2,double l3){
        return l1 + l2 + l3; 
    }
            //rectangulo
    public static double areaRectangulo(double h,double b){
        return h * b;
    }    
    public static double perimetroRectangulo(double h,double b){
        return 2 * (h + b);
    }  
}
