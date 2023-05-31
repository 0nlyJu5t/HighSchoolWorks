/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraybipractice;

import java.util.Scanner;

/**
 *
 * @author JDM
 */
public class ArrayBiPractice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la capacidad del arreglo:");
        int length = sc.nextInt();
        
        int [][] numeros  = new int [5][length]; 

        for(int i = 0;i < 5 ;i++){
             for(int j = 0;j < length ;j++){
                numeros[i][j] = (int)(Math.random()*10);
             }

        }
        for(int i = 0;i < 5;i++){       
            System.out.println("");
            for(int j= 0;j < length;j++){//col  
         
                System.out.print(numeros[i][j] + " ");
            }

        }
    }
}
