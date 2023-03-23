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
public class Estruct_Selection_D{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
       System.out.println("ingrese la calificacion numerica: ");//peticion de datos 
       int nota = sc.nextInt();//entrada de datos 
       
       //condicional 
       if(nota >= 85 && nota <= 100){//nota es mayor o igual a 85 y nota es menor o igual a 100
           System.out.println("la nota del alumno es de una A");//salida de datos 
       }
       else if(nota >= 65 && nota < 85){//nota es mayor o igual a 65 y nota es menor a 85
           System.out.println("la nota del alumno es de una B");//salida de datos 
       }
       else if(nota < 65 && nota >=0){//nota es menor a 65
           System.out.println("la nota del alumno es de una C");//salida de datos 
       }
       else{System.out .println("numero invalido");}
    }
}
