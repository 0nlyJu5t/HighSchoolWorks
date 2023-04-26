/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaflujos;
/**
 *
 * @author Justin Damito Sanchez
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
public class practicaFlujos_3 {
    public static void main(String[] args) throws IOException {
        practicaFlujos_3 metodo  = new practicaFlujos_3();
        
        BufferedReader lectura = new BufferedReader(new StringReader(metodo.content()));
        BufferedWriter escritura = new BufferedWriter(new FileWriter(metodo.rutaFile()));
        
        String linea;
        while ((linea = lectura.readLine()) != null){
        escritura.write(linea);
        System.out.println(linea.toUpperCase());
        
        System.out.println("se realizo el archivo con exito");
        }
        lectura.close();   
        escritura.close();
}
public String content(){
    Scanner sc = new Scanner(System.in);
    String texto;
    System.out.println("ingrese el texto que dessea ingresar en el archivo: ");
    texto = sc.nextLine();
    return texto.toUpperCase();
}
public String rutaFile(){
    Scanner sc = new Scanner(System.in);
    String ruta;
    System.out.println("ingrese la rutra de el archivo: ");
    ruta = sc.nextLine();
    return ruta;
}
}
