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

public class Estruct_Selection_E {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
      
    double pagar;
    System.out.println("ingrese la cantidad de alumnos: ");//peticion de datos 
    int num = sc.nextInt();//entrada de datos 
    
    //condicional
    if(num > 120){//num es mayor de 120
        pagar = num * 2500;
        System.out.println("la cantidad a pagar por los " + num + " estudiantes es de " + pagar);//salida de datos
    }
    else if(num >= 60 && num <= 120){//num es mayor o igual a 60 y num es menor o igual a 120
        pagar = num * 2800;
        System.out.println("la cantidad a pagar por los " + num + " estudiantes es de " + pagar);//salida de datos
    }
    else if(num >= 30 && num <= 59){//num es mayor o igual a 30 y num es menor o igual a 59
        pagar = num * (2500 * 1.20);
        System.out.println("la cantidad a pagar por los " + num + " estudiantes es de " + pagar);//salida de datos
    }
    else if(num < 30){
        pagar = 550000;
        System.out.println("la cantidad a pagar por los " + num + " estudiantes es de " + pagar);//salida de datos
    }
    
 
    }
}
