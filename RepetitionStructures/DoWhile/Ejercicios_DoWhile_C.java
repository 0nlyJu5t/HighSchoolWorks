/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author Justin David Damito Sanchez
 */

import java.util.Scanner;
public class Ejercicios_DoWhile_C {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        //inicializacion
        int i = 1;
        int produc = 1;
        
        //bucle
        do{
            System.out.println(i + "-ingrese un numero: ");//peticion de datos
            int num = sc.nextInt();//entrada
            i++;//operacion incremental
            produc *= num;//operacion combinada multiplicacion
        }
        while(i <= 5);//mientras i sea menor o igual a 5 
        
        System.out.println("el producto de los 5 numeros es de: " + produc);//salida
    }
}
