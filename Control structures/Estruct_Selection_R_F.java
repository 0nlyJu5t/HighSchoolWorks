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
public class Estruct_Selection_R_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("~ingrese donde quiere que inicie el intervalo");//peticion de datos
        int num1 = sc.nextInt();//input
        
        System.out.println("~ingrese donde quiere que finalice el intervalo");//peticion de datos
        int num2 = sc.nextInt();//input
        
        //bucle 
        for(int i = num1;i <= num2;i++){//condicones del for
            if(i % 2 == 0){//si el resto de 1 entre 2 es 0
                System.out.println(i);}//output
        
        }
    }
}
