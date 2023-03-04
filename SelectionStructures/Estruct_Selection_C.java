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

public class Estruct_Selection_C {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("ingrese el precio del kilo:");//peticion de datos
    double prec = sc.nextDouble();//entrada de datos 
      
    System.out.println("Fruta------------------\n1-Ketsali\n2-Lavon ");//peticion de datos
    int fruta = sc.nextInt();//entrada de datos 
    
    System.out.println("calidad----------------\n1-Excelente\n2-Buena");//peticion de datos
    int calidad = sc.nextInt();//entrada de datos 
    
    //condicional
    switch(fruta){//switch de tipo de fruta
        case 1://Ketsali
            switch(calidad){//switch de calidad del ketsali
                case 1://calidad Excelente
                    prec = prec  * 1.40;
                    break;
                case 2://calidad Buena
                    prec = prec  * 1.20;
                default:
                    System.out.println("undefined");
            }
        case 2://Lavon
            switch(calidad){//switch de calidad del lavon
                case 1://calidad Excelente
                    prec = prec  * 1.45;
                    break;
                case 2://calidad Buena
                    prec = prec  * 1.15;
                default:
                    System.out.println("undefined");
            }
        default:
            System.out.println("undefined");
                }
    
        System.out.println("el precio de la fruta es de " + prec);  
    }
}