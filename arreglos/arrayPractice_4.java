/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayspratice;

import java.util.Arrays;

/**
 *
 * @author JDM
 */
public class arrayPractice_4 {
    public static void main(String[] args) {
        int numeros [] = new int[40];
        int suma = 0;
        
        //llenado
        for(int i = 0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*100);
            //suma
            suma += numeros[i];
        }
        
        //impresion
        System.out.println("el contenido del arreglo es:");
        for(int x:numeros){
                System.out.println(x);
        }
        
        //ordenar
        Arrays.sort(numeros);
        System.out.println("\nel arreglo ordenado de forma ascendente: ");
        for(int x:numeros){
                System.out.println(x);
        }
        
        //invertir
        System.out.println("\nel arreglo ordenado de forma descendente: ");
        for(int i = numeros.length - 1; i >= 0 ; i--){
                System.out.println(numeros[i]);
            }      
        
        int prom = suma/numeros.length;
        System.out.println("\nla suma de los numeros del arreglo es: "+ suma);
        System.out.println("el promedio de los numeros del arreglo es: "+ prom);
    }   
}

//        ¿Qué dimensión tiene su arreglo?
//                R/40

//        ¿Cuál es el índice máximo que va tener el arreglo? 
//                R/el inidice mayor del arreglo es 39

//        ¿Qué tipo de datos almacena el arreglo? 
//                R/el tipo de dato que almacena es entero

//        ¿Qué tipo de arreglo se utilizó?
//                R/unidimensional