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
public class Estruct_Selection_R_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //inicializacion de variables
        int sumaA = 0,sumaB = 0,numx = 1, i=0, j=0;

        //bucle
        do{
            System.out.println("ingrese el valor minimo de un intervalo");//input
                int num1 = sc.nextInt();//peticion de datos
            System.out.println("ingrese el valor maximo de un intervalo");//input
                int num2 = sc.nextInt();//peticion de datos
                //condicional
                if(num1 < num2 && num2 > num1){//si num1 es menor a num2 y num2 es mayor a num2
                    //bucle
                    do{
                        System.out.println("ingrese un numero (digite 0 para salir): ");//input 
                        numx = sc.nextInt();//peticion de datos
                        if(numx < num2 && num1 < numx){
                            sumaA += numx;
                            i++;
                        }else{
                            sumaB += numx;
                            j++;
                        } 
                    }while(numx != 0);//mietnras numx sea distinto a 0
                }
                else {System.out.println("intervalo invalido-ingrese el intervalo nuevamente\n");}//output
        }while(numx !=0);//mietnras numx sea distinto a 0
        
        
        System.out.println("suma entre el intervalo: " + sumaA);//output
        System.out.println("suma fuera el intervalo: " + sumaB);//output
        System.out.println("la cantidad de numeros entre del intervalo es de: " + i);//output
        System.out.println("la cantidad de numeros fuera del intervalo es de: " + j);//output
        
    }
}
