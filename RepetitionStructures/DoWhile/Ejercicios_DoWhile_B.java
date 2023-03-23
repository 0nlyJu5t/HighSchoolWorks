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
public class Ejercicios_DoWhile_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        //inicializacin
        int num1,num2;
        
        //bulce
        do{ 
        System.out.println("ingrese un numero: ");//peticion de datos
        num1 = sc.nextInt();//entrada
        System.out.println("ingrese otro numero: ");//peticion de datos 
        num2 = sc.nextInt();//entrada
        
        }
        while(num1 != num2);//mientras que num1 sea distinto a num2
        
        System.out.println("el programa finalizo debido a que los numeros ingresados eran iguales");//salida
        
        
    }
}
