/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasodeestructurasdecontrol;

/**
 *
 * @author Justin David Damito Sanchez
 */

public class Estruct_Selection_R_C {
    public static void main(String[] args) {
        
        //inicializacion de variables
        int l = 1;
        int i;
        
        
        //bucle
        while(l<=6){//mientras 1 esa menor a 6
            System.out.println("Tablas de multipplicar del 1 al 10del numero " + l );//output
            //bucle
            for(i=0;i<=11;i++){
                System.out.println( l + "x" + i + "=" + l * i);}//ouput
                l++;//incremento
        }
    }    
}

