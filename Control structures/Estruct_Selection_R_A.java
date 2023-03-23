/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasodeestructurasdecontrol;

/**
 *
 * @author Justin David Damito Sanchez
 */
import java.util.Scanner;
public class Estruct_Selection_R_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //inicializacion de variables
        double notaEx, notaPr, notaTa; 
        boolean radioA;
        
        System.out.println("~nota del examen: ");//input
        notaEx = sc.nextDouble();//peticion de datos 
        System.out.println("~nota del proyecto: ");//input
        notaPr = sc.nextDouble();//peticion de datos
        System.out.println("~nota de las tareas: ");//input
        notaTa = sc.nextDouble();//peticion de datos 
        System.out.println("~el estudiante cumple con le minimo de asistencia  true/false: ");//input
        radioA = sc.nextBoolean();//peticion de datos
        
        //operaciones
        notaEx = (notaEx*30)/100;//operacion para sacar porcentajes
        notaPr = (notaPr*60)/100;//operacion para sacar porcentajes
        notaTa = (notaTa*10)/100;//operacion para sacar porcentajes
          
        double notafinal = notaEx + notaPr + notaTa;//suma de los datos
        
        //condicional
        if(notafinal >= 50 && radioA == true){//si nota final es mayor o igual a 50 y radioAsistencia es true
            System.out.println("\nnota: " + notafinal + "\n~Aprobado");}//output
        else if(notafinal >= 50 && radioA == false){//si nota final es mayor o igual a 50 y radioAsistencia es false
            System.out.println("\n~nota: " + notafinal + "\n~Reprobado por no cumplir con el minmo de asistencia");}//output
        else {System.out.println("\n~nota: " + notafinal + "\n~Reprobado");}//output
        
    }
}
