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
public class Estruct_Selection_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el numero del dia de la semana (1-7):");//peticion de datos
        int dia = sc.nextInt();//entrada de datos
        
        //condicional
        switch(dia){//switch de dia
            case 1:
                System.out.println("el dia " + dia +" es el Lunes");//salida de datos 
                break;
            case 2:
                System.out.println("el dia " + dia +" es el Martes");//salida de datos 
                break;
            case 3:
                System.out.println("el dia " + dia +" es el Miercoles");//salida de datos 
                break;
            case 4:
                System.out.println("el dia " + dia +" es el Jueves");//salida de datos 
                break;
            case 5:
                System.out.println("el dia " + dia +" es el Viernes");//salida de datos 
                break;
            case 6:
                System.out.println("el dia " + dia +" es el Sabado");//salida de datos 
                break;
            case 7:
                System.out.println("el dia " + dia +" es el Domingo");//salida de datos
            default:
                System.out.println("invalido");//salida de datos
        }
    }
}
