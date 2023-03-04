/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Selection;

/**
 *
 * @author Justin David Damito Sanchez
 */

import java.util.Scanner;
public class Estruct_Selection_B {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      
    System.out.println("ingrese un numero entero: ");//peticion de datos 
    int num1 = sc.nextInt();//entrada de datos
    
    //condicional
    if(num1 % 2 == 0){//el resto de num1 entre 2 es igual a 0
        System.out.println("el numero es par");//salida de datos
    }
    else if (num1 % 2 != 0){//el resto de num1 entre 2 es distinto a 0 
        System.out.println("el numero es impar");//salida de datos 
    }
    else {System.out.println("numero invalido");}//salida de datos 
    
    num1 *=2;//operador incremental
        System.out.println("el numero incrementado al doble es de: " + num1);//salida de datos 
    }
}
