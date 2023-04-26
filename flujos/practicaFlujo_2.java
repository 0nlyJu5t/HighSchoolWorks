/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaflujos;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author CTPG
 */
public class practicaFlujo_2 {
    public static void main(String[] args) throws IOException {
        int caracter;
        FileInputStream lectura;
                
        lectura = new FileInputStream("D:\\progra-java-projects\\practicaFlujos\\Ejercicios\\Binario1.txt");
        
        caracter = lectura.read();
                
        while(caracter != -1){
            System.out.print((char)caracter);
            caracter = lectura.read();
        }
        lectura.close();
    }
}
