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
public class Estruct_Selection_R_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //inicializacion de variables2
        int suma;
        
        System.out.println("~los numeros seran amigos si son enteros positivos y la suma de estos al ser dividida por 3 da de residuo 0 \ningrese 2 numeritos:");//input
        int num1 = sc.nextInt();//peticion de datos
        int num2 = sc.nextInt();//peticion de datos 
        
        suma = num1 + num2;//suma de los numeros
        
        //condicional
        if(num1 > 0 && num2 > 0 && true ==(suma%3==0)){//si num1 es mayor a 0 y num2 es mayor a 0 y true es igual a si el resto de suma entre 3 da 0 
            System.out.println("~los numeros son amigos");//output
        }else{ System.out.println("~los numeros no son amigos ");}//output
    }
}  

