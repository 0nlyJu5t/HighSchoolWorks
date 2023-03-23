/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estruct_Selection;

/**
 *
 * @author Justin David Damito Sanchez
 */
import java.util.Scanner;
public class Estruct_Selection_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la edad:");//peticion de datos 
        int edad = sc.nextInt();//entrada de datos 
        
        //condicional
        if(edad > 0 && edad <= 3){//edad es mayor a 0 y edad menor o igual a 3
            System.out.println("es un bebe");//salida de datos
        }
        else if(edad > 3 && edad <= 11){//edad es mayor a 3 y edad menor o igual a 11
            System.out.println("es un niño");//salida de datos
        }
        else if(edad > 12 && edad <= 17){//edad es mayor a 12 y edad menor o igual a 17
            System.out.println("es un adolesente");//salida de datos
        }
        else if(edad > 18 && edad <= 29){//edad es mayor a 18 y edad menor o igual a 29
            System.out.println("es un adulto joven");//salida de datos
        }
        else if(edad > 30 && edad <= 64){//edad es mayor a 30 y edad menor o igual a 64
            System.out.println("es un adulto");//salida de datos
        }
        else if(edad > 65){//edad es mayor a 65
            System.out.println("es un adulto mayor");//salida de datos
        }
        else{System.out.println("invalido");}
    }
}
