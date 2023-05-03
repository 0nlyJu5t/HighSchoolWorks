/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayspratice;

/**
 *
 * @author JDM
 */
public class arrayPractice_1 {
    public static void main(String[] args) {
        String products [] = new String[9];
        //String [] products = ["Manzana","Mango","Pera","Durazno","Fresa","Sandia","Papaya","Yuplon","Naranja"];
        
        //llenado
        products[0]="Manzana";
        products[1]="Mango";
        products[2]="Pera";
        products[3]="Durazno";
        products[4]="Fresa";
        products[5]="Sandia";
        products[6]="Papaya";
        products[7]="Yuplon";
        products[8]="Naranja";
                
        //impresion
        System.out.println("los datos del arreglo son:");
        for (String i: products){
            System.out.println(i);
        }  
    }
}

//        ¿Qué dimensión tiene su arreglo?
//                R/9

//        ¿Cuál es el índice máximo que va tener el arreglo? 
//                R/el inidice mayor del arreglo es 8

//        ¿Qué tipo de datos almacena el arreglo? 
//                R/el tipo de dato que almacena es String

//        ¿Qué tipo de arreglo se utilizó?
//                R/unidimensional
