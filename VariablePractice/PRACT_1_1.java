package com.mycompany.practica01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CTPG
 */
public class PRACT_1_1 {
    public static void main(String[] args) {
    //PRACTICA I.I Tipos de Datos y Conversiones 
        
     //declaracion y asignacion de las variables
        String num = "10";
        float salario = 780993.67f;
        double peso = 68.9;
        double estatura = 1.67;
        String edad = "12"; 
        short añoNacimiento = 1990;
        boolean isEstudiante = true;
        
     //declaraciones de variables 2 
        int convNum = Integer.parseInt (num);
        String convSalario = String.valueOf(salario);
        float convPeso = (float)peso; 
        String convEstatura = String.valueOf(estatura);
        int convEdad = Integer.parseInt(edad);
        String convAñoNac = String.valueOf(añoNacimiento);
        String convlsNac = String.valueOf(isEstudiante);
        
        
        
    }
}
