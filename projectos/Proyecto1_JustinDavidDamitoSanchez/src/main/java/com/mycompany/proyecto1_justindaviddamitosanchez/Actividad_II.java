/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_justindaviddamitosanchez;

import java.util.Scanner;

/**
 *
 * @author Justin damito sanchez
 */
public class Actividad_II {
    public static void main(String[] args) {
        //instancia de scanner
        Scanner sc = new Scanner(System.in);
        
        //declaracion y inicializacion de variables
        int sum = 0, mult = 1;
        
        //input
        System.out.println("ingrese el tamaño del arreglo: ");
        int tamaño = sc.nextInt();
        
        //declaracion e inicializacion de arreglo
        int arreglo[] = new int[tamaño];
        
        //bucle para la recoleccion de informacion
        for(int i = 0; i < arreglo.length; i++){
            System.out.println((i+1) + "-ingrese un numero");
            arreglo[i] = sc.nextInt();
            
            sum += arreglo[i];
            mult *= arreglo[i];
        }
        
        //imprecion
        System.out.println("-----contenido del arreglo-----");
        System.out.println("-elementos del arreglo-");
        for(int i: arreglo){
            System.out.println(i);}
        System.out.println("-operaciones-");
        System.out.println("suma de los elementos:           " + sum);
        System.out.println("multiplicacion de los elementos: " + mult);
        
       
    }
}
