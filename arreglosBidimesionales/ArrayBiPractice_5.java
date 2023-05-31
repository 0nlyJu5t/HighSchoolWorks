/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraybipractice;

/**
 *
 * @author JDM
 */
public class ArrayBiPractice_5 {
    public static void main(String[] args) {
        String  [][] products = new String[4][5];

        //llenado
        products[0][0]="Menta";
        products[0][1]="Curcuma";
        products[0][2]="Culantro";
        products[0][3]="Mejorana";
        products[0][4]="Salvia";
        
        products[1][0]="Comino";
        products[1][1]="Ajo";
        products[1][2]="Cilatro";
        products[1][3]="Romero";
        products[1][4]="Cebollin";
        
        products[2][0]="Perejil";
        products[2][1]="Curri";
        products[2][2]="Laurel";
        products[2][3]="Albahaca";
        products[2][4]="Calendula";
        
        products[3][0]="Oregano";
        products[3][1]="Pimienta";
        products[3][2]="Tomillo";
        products[3][3]="Hierbabuena";
        products[3][4]="Manzanilla";
        
        for(int i = 0;i < 4;i++){       
            System.out.println("");
            for(int j= 0;j < products[0].length;j++){//col  
                System.out.print(products[i][j] + " ");
    }
    
        }
    }
}
