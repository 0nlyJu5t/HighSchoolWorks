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
public class Estruct_Selection_G {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese un numero:");//peticion de datos  
        int num1 = sc.nextInt();//entrada de datos
        
        System.out.println("ingrese otro numero distinto al anterior:");//peticion de datos
        int num2 = sc.nextInt();//entrada de datos
        
        System.out.println("ingrese otro numero distinto al anterior:");//peticion de datos
        int num3 = sc.nextInt();//entrada de datos
        
        //condicional
        if(num3 > num1 && num2 < num3){//num3 es mayor que num1 y num2 es menor que num3 
            System.out.println("el numero mayor es el: " + num3);//salida de datos
        }
        else if(num2 > num1 && num3 < num2){//num2 es mayor que num1 y num3 es menor que num2
            System.out.println("el numero mayor es el: " + num2);//salida de datos
        }
        else {//num1 es mayor que num3 y num2 es menor que num1
            System.out.println("el numeor mayor es el: " + num1);//salida de datos
        }
    }
}
