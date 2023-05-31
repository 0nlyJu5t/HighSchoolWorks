/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraybipractice;

/**
 *
 * @author JDM
 */
public class ArrayBiPractice_1 {
    public static void main(String[] args) {
        char [][] letras  = new char [5][5];
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int k = 0;
        for(int i= 0;i < 5;i++){//filas
            for(int j = 0;j < letras[0].length;j++){//columnas
                    letras[i][j] = abc.charAt(k);
                    k++;
            }
        }
        for (int i= 0;i < 5;i++) {
            System.out.println("");
            for (int j = 0; j < letras[0].length; j++) {
                System.out.print(letras[i][j] + "   ");
            }
        }
    }
     
}
