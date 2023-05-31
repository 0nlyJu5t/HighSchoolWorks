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
public class ArrayBiPractice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] numeros  = new int [3][3]; 

        for(int i = 0;i < 3;i++){
             for(int j = 0;j < 3;j++){
                System.out.println("ingrese el numero de la fila " +(i+1)+ " y columna "+(j+1)+":");
                numeros[i][j] = sc.nextInt();
             }
        }
        for(int i = 0;i < 3;i++){       
            System.out.println("");
            for(int j= 0;j < 3;j++){//col  
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
}
