/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaflujos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CTPG
 */
public class practicaFlujoss_4 {
    public static void main(String[] args) throws IOException {
        int caracter;
        
        BufferedInputStream lectura = null;
        BufferedOutputStream escritura = null;
        
        lectura = new BufferedInputStream(new FileInputStream("D:\\progra-java-projects\\practicaFlujos\\Ejercicios\\personal.txt"));
        escritura = new BufferedOutputStream(new FileOutputStream("D:\\progra-java-projects\\practicaFlujos\\Ejercicios\\personal-copia.txt"));
        
        caracter = lectura.read();
        
        while(caracter != -1){
            escritura.write(caracter);
            caracter=lectura.read();
        }
        System.out.println("se realizo la copia de el archivo con exito");
        lectura.close();
        escritura.close();
    }
    
}
