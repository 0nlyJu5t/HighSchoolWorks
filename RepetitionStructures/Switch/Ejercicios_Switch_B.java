/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Switch;



/**
 *
 * @author Justin David Damito Sanchez
 */
import java.util.Scanner;
public class Ejercicios_Switch_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("ingrese el mes del año: ");//peticion de datos
        int option = sc.nextInt();//entrada
        
        //switch option
        switch(option){
            case 1:
                System.out.println("el mes " + option + " del año es enero");//salida
                break;
            case 2:
                System.out.println("el mes " + option + " del año es febrero");//salida
                break;
            case 3:
                System.out.println("el mes " + option + " del año es marzo");//salida
                break;
            case 4:
                System.out.println("el mes " + option + " del año es abril");//salida
                break;
            case 5:
                System.out.println("el mes " + option + " del año es mayo");//salida
                break;
            case 6:
                System.out.println("el mes " + option + " del año es junio");//salida
                break;
            case 7:
                System.out.println("el mes " + option + " del año es julio");//salida
                break;
            case 8:
                System.out.println("el mes " + option + " del año es agosto");//salida
                break;
            case 9:
                System.out.println("el mes " + option + " del año es septiembre");//salida
                break;
            case 10:
                System.out.println("el mes " + option + " del año es octubre");//salida
                break;
            case 11:
                System.out.println("el mes " + option + " del año es noviembre");//salida
                break;
            case 12:
                System.out.println("el mes " + option + " del año es diciembre");//salida
            default:
                System.out.println("");
        }
    }
}
