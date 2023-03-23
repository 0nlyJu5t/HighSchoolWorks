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
public class Estruct_Selection_A {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      
    System.out.println("ingrese un numero entero: ");//peticion de datos
    int num1 = sc.nextInt();//entrada de datos 
    
    System.out.println("ingrese otro numero entero: ");//peticion de datos 
    int num2 = sc.nextInt();//entrada de datos 
    
    //condional
    if (num1 == num2){// num1 es igual a num2 
        System.out.println("los numeros son iguales");//salida
    }
    else if (num1 > num2){//num1 es mayor que num2 
        System.out.println(num1 + " es mayor que " + num2 );//salida
    }
    else//num2 es mayor que num1
        {System.out.println(num2 + " es mayor que " + num1 );//salida
    }
    
    int suma = num1 + num2; //operacion de suma num1 mas num2
        System.out.println("la suma de los numeros es de: " + suma);//salida
   
    }
}
