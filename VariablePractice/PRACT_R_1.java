package com.mycompany.practica01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Justin David Damito Sanchez
 */
public class PRACT_R_1 {
    public static final double PI = 3.14159264;
    public static void main(String[] args) {
        
    //parte 1
    
        //area del triangulo 
            //inicializacion de variables
            int baseT = 057;
            int alturaT = 064;
            double areaT;
            
            areaT =(baseT * alturaT)/2; //operacion de la area
            
        //area del circulo
            //inicializacion de variables
            int radioC = 0xC;
            double areaC;
            
            areaC = (PI * (radioC ^ 2));//operacion de la area
            
        //determinar el imc
            //inicializacion de variables
            int peso = 86;
            int altura = 180;
            double imc;
            
            imc = (peso/((altura / 100) ^ 2)); //operacion
            
        //19 años es mayor de edad
            if(19 >= 18){
                System.out.println("la persona de 19 años es mayor de edad");
            }
            else {System.out.println("la persona no es mayor de edad");}
                
    //parte 2
            //inicializacion 
            int a = 8;
            int b = 3;
            int c = 5;
            
            //operaciones
            int op_a = a + b + c;
            double op_b = a/b;
            double op_c = a/c;
            double op_d = 2 * b + 3 * (a - c);
            double op_e = a % b;
            double op_f = a % c;
            double op_g = a * (b /c);
            double op_h = (a * c) % b;
            double op_i = a * (b / c);
            double op_j = (a - 4 * b)%(c + 2 * a)/(a - c);
            
    //parte 3
            //inicializacion
            String c1 = "54";
            String c2 = "20";
            String c3 = "36";
         
            //conversiones
            int C1 = Integer.parseInt(c1);
            int C2 = Integer.parseInt(c2);
            int C3 = Integer.parseInt(c3);
    
            //operaciones
            int opa = C1 + C2;
            int opb = C1 / C3;
            int opc = C1 * C3 + C2;
            int opd = (C2 ^ 2) * C1 - C2;
        
    //parte 4 
            //inicializacion
            boolean X =true;
            boolean Y =false;
            boolean Z =true;
        
            //expresiones logicas 
            boolean booa = (X && Y)||(X && Z);
            boolean boob = (X && Z || Y);
            boolean booc = (X && !Y && !X || !Z && Y);
            boolean bood = ((!X && Z) && (!Z || !X));
            
    //parte 5
            //inicializacion
            int I = 9;
            int j = 4;
            float x = 0.005f , y = -0.01f;
            char C = '5', d = '3';
              
    //parte 6
            //operaciones logicas
            boolean opA =(I <= j);
            boolean opB =!(I <= j);
            boolean opC =!(x  > 0);
            boolean opD =(I < 0 && j < 9);
            boolean opE =(j * -1) == (I - 10);
            boolean opF =(x != I);
            boolean opG =((a + b) == 99);
    }
}
