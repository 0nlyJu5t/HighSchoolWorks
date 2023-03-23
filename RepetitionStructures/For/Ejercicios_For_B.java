/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_For;

/**
 *
 * @author Justin David Damito Sanchez
 */

import java.util.Scanner;
public class Ejercicios_For_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //inicializacion
        int num, limt, i, suma = 0,prom;
        
        System.out.println("limite: ");//peticion de datos 
        limt = sc.nextInt();//entrada
        
        
        System.out.println("ingrese un numero: ");//peticion de datos
        num = sc.nextInt();//entrada
        
        suma+=num;
        //bucle
        for(i = 2; i <= limt; i++){//condiciones del for
            System.out.println("ingrese un numero: ");//peticion de datos
            int num1 = sc.nextInt();//entrada
            suma += num1;//operacion combinada
            
            if(num1 < num){//si num1 es menor a num2 
                System.out.println(num1 + " es menor que " + num + " que es el primer numero ");//salida
                }
            if(i >= limt){//si i es mayor o iguala limt
                prom = suma /limt;//operacion de promedio
                System.out.println("promedio: " + prom);//salida
            }
        }
    }
}
    
