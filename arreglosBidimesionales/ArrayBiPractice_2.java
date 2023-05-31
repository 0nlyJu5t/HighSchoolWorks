/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraybipractice;

/**
 *
 * @author JDM
 */
public class ArrayBiPractice_2 {
    public static void main(String[] args) {
        int [][] numeros  = new int [4][4]; 

        int k = 1;
        
        for(int i = 0;i < 4 ;i++){
             for(int j = 0;j < 4 ;j++){
                numeros[i][j] = k;
                k++;
             }   
        }
        for(int i = 0;i < 4;i++){
            for(int j= 0;j < 4;j++){
                System.out.print(numeros[i][j] + " ");
            }
                System.out.println("");
        }
    }
}
