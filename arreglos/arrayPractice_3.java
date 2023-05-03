/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayspratice;

/**
 *
 * @author JDM
 */
public class arrayPractice_3 {
    public static void main(String[] args) {
        int numeros [] = new int[20];
        int suma = 0;
        
        //llenado del arreglo
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = i+1;
            //suma
            suma += numeros[i];
        }
        //promedio
        int prom = suma/numeros.length;

        //impresion
        System.out.println("el contenido del arreglo es:");
        for(int x:numeros){
                System.out.println(x);
        }

        System.out.println("la suma de los numeros del arreglo es: "+ suma);
        System.out.println("el promedio de los numeros del arreglo es: "+ prom);
    }
}

//        ¿Qué dimensión tiene su arreglo?
//                R/20

//        ¿Cuál es el índice máximo que va tener el arreglo? 
//                R/el inidice mayor del arreglo es 19

//        ¿Qué tipo de datos almacena el arreglo? 
//                R/el tipo de dato que almacena es entero

//        ¿Qué tipo de arreglo se utilizó?
//                R/unidimensional