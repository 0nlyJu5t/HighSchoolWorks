/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaflujos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin damito sanchaz 
 */

public class practicaFlujos_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new FileReader("D:\\progra-java-projects\\practicaFlujos\\Ejercicios\\ABC.txt"));
        String linea;
        
        char character = (char) 32;
        String caracter = Character.toString(character);
        while((linea=lectura.readLine())!= null){
            JOptionPane.showMessageDialog(null, linea.replaceAll(caracter, "")); 
        }
        
        lectura.close();
    }
    
}
//other way

//final String ruta = "";
//String linea="";
//
//try (fileReader fr=new FileReader(ruta)){
//	int date = fr.read();
//while (dato!=-1){
//	if (dato != 32){
//		linea = linea+(char)dato;
//	}
//dato = fr.read();
//}
//JoptionPane.showMessageDialog(null,linea);
//}catch (IOExpreption e){
//	system.out.println("Error"+e);
//}

