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
        double notaExamen, notaProyecto, notaTareas; 
        boolean radioASistencia;
        
        System.out.println("nota del examen: ");//input
        notaExamen = sc.nextDouble();//peticion de datos 
        System.out.println("nota del proyecto: ");//input
        notaProyecto = sc.nextDouble();//peticion de datos
        System.out.println("nota de las tareas: ");//input
        notaTareas = sc.nextDouble();//peticion de datos 
        System.out.println("el estudiante cumple con le minimo de asistencia  true/false: ");//input
        radioASistencia = sc.nextBoolean();//peticion de datos
        
        //operaciones
        notaExamen = (notaExamen*30)/100;//operacion para sacar porcentajes
        notaProyecto = (notaProyecto*60)/100;//operacion para sacar porcentajes
        notaTareas = (notaTareas*10)/100;//operacion para sacar porcentajes
          
        double notafinal = notaExamen + notaProyecto + notaTareas;//suma de los datos
        
        //condicional
        if(notafinal >= 50 && radioASistencia == true){//si nota final es mayor o igual a 50 y radioAsistencia es true
            System.out.println("\nnota: " + notafinal + "\nAprovado");}//output
        else{
            System.out.println("\nnota: " + notafinal + "\nReprobado");}//output
        
        
    }
}
