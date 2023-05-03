/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayspratice;

import java.util.Scanner;

/**
 *
 * @author JDM
 */
public class arrayPractice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        arrayPractice_2 met = new arrayPractice_2();
        
        float numC;
        System.out.println("ingrese la capacidad del arreglo:");
        int length = sc.nextInt();
        
        float nums [] = new float[length];
        
        //llenado
        for (int i = 0;i < nums.length;i++){
            System.out.println("ingrese un numero de coma flotante par al arreglo de la posicion "+i);
            numC = sc.nextFloat();
            
            //comprobacion
            if (pares(numC ) == true){
                nums[i] = numC;
            }else{
                System.out.println("el numero ingresado no es par"); 
                i--;}
   }
        //impresion
        System.out.println("los numeros del arreglo son:");
        for (float x : nums){
            System.out.println(x);
        }
    }
public static Boolean pares(float num){
    return (num%2 == 0);

}
}

//        ¿Qué dimensión tiene su arreglo?
//                R/nums.length

//        ¿Cuál es el índice máximo que va tener el arreglo? 
//                R/el inidice mayor del arreglo es (nums.length - 1)

//        ¿Qué tipo de datos almacena el arreglo? 
//                R/el tipo de dato que almacena es float

//        ¿Qué tipo de arreglo se utilizó?
//                R/unidimensional

    


