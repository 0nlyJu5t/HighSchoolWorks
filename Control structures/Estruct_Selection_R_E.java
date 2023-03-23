/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasodeestructurasdecontrol;

/**
 *
 * @author Justin David Damito Sanchez
 */

import java.util.Scanner;
public class Estruct_Selection_R_E {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int clave1 = 1000;
        
        System.out.println("~introduzca una contraseña numerica entre 0 y 999:");//input
        int clave = sc.nextInt();//peticion de datos
        
        //condicional
        if(clave > 0 && clave < 999){//si clave es mayor a 0 y clave es menor a 999
            System.out.println("~contraseña aceptada  O");//output
        }else{System.out.println("~contraseña denegada  X");}//output
        
        //bucle
        for(int i=2;i>=0;i--){
            //condicional
            if(clave !=clave1){
                System.out.println("~introduzca la contraseña");//input
                clave1 = sc.nextInt();//peticion de datos
            
                //condicional
                if(clave1 == clave){// si clave1 es igual a clave
                    System.out.println("~Acceso Autorizado");//output
                }
                else if (i != 0){//si i es distinto a 0
                    System.out.println("~contraseña incorrecta, quedan " + i +" intento(s)");//output
                }
                else{
                    System.out.println("~ha excedido el numero de intentos permitidos");//output
                }
            }
        }  
    }
}
