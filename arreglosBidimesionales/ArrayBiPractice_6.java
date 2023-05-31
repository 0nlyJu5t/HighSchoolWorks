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



public class ArrayBiPractice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] products  = new String [7][2]; 

        for(int i = 0;i < products.length;i++){
            System.out.println("ingrese el nombre de la golosina numero " + (i+1)+":");
            products[i][0] = sc.nextLine();
            System.out.println("ingrese el precio de " + products[i][0]+":");
            products[i][1] = sc.nextLine();
        }
        for(int i = 0;i < products.length;i++){       
            System.out.println(products[i][0] + "   " + products[i][1]);
            }
        }
    }
