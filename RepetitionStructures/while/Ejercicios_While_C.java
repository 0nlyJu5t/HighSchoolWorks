/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_While;

/**
 *
 * @author Justin David Damito Sanchez
 */

import java.util.Scanner;
        
public class Ejercicios_While_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //inicializacion
        int num = 1, suma = 0, i = 0, prom;
        
        //bucle
        while(num != 0){//mientras que num sea distinto a 0
            System.out.println("ingrese un numero:");//peticion de datos 
            num = sc.nextInt();//entrada
            
            if(num != 0){//si num es distinto a 0
                i++;//incremento
                suma += num;}//operador combinado
            else{
                prom = suma/i;//promedio
                System.out.println("suma: "+suma+"\ncantidad: "+i+"\npromedio: "+prom);//salida
            }
        }
    }
}


