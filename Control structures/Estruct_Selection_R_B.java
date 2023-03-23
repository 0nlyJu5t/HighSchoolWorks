
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
public class Estruct_Selection_R_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //inicializacion de variables
        double pay;
        
        System.out.println("~cuanta distacia va a recorrer(en km): ");//input
        double distance = sc.nextDouble();//peticion de datos 
        
            pay = 500;
        
        //condiconal
        if(distance <= 150 && distance > 0){//distancia menor o igual a 150 y distancia mayor a 0
            System.out.println("~el total a pagar es de: " + pay);//output
        }else if(distance > 150){//distancia mayor a 150
            pay = pay + (5 * (distance - 150));
            //condiconal
            if(distance > 250){//si distance es mayor a 250
                pay = pay - (pay * 0.15);//sacar porcentaje
                System.out.println("~el total a pagar es de " + pay);//output
               }
            else{System.out.println("~el total a pagar es de " + pay);}//output
        }else{//si distancia es menor a 500
            System.out.println("~el total a pagar es de " + pay);//output
        }
        
    }
}
