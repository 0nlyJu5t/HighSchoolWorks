/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01;

/**
 *
 * @author Justin David Damito Sanchez 
 */
public class PRACT_2 {
    public static void main(String[] args) {
       //declaracion y asignacion
       String nom = "tommy "; 
       String ap1 = "shelby "; 
       String ap2 = "rodriguez"; 
       String nombreCompleto = nom + ap1 + ap2; //concadenacion
       
       //declaracion de asignacion
       String a = "el";  
       String b = "mundo"; 
       String c = "esta"; 
       String d = "de cabeza"; 
       
       String Frase = a + b + c + d; //concadenacion
       
       //declaracion y asignacion de numeros 
       int n1 = 120; 
       int n2 = 34;
       int n3 = 56;
       int n4 = 5;
       
       //operaciones
       int sum = n1 + n2 + n3 + n4;
       int rest = n1 - n2 - n3 - n4;
       int mult = n1 * n2 * n3 * n4;
       double divi = n1 / n2 / n3 / n4;
       double mod = n1 % n2 % n3 % n4;
       
       //mostrando resultados 
       System.out.println("suma: " + sum);
       System.out.println("resta: " + rest);
       System.out.println("multiplicacion: " + mult);
       System.out.println("division: " + divi);
       System.out.println("resto: " + mod); 
       
       //incrementos 
       n1++;
       n4++;
       
       
       boolean condicion = true;
       boolean t = !condicion; //invertir el valor de la variable condicion
       
       int h = 5;
       int f = 8;
       int m = 3;
       int r = 4;
        
       //operadores de asignacion
       h += 6;
       f -= 2;
       m *= 2;
       r /= 1;
       
       //mostrando valores de las operaciones de asignacion
       System.out.println("suma de h con operador de asignacion: " + h);
       System.out.println("resta de f con operador de asignacion: " + f);
       System.out.println("multiplicacion de m con operador de asignacion: " + m);
       System.out.println("division de r con operador de asignacion: " + r);              
    }
}
