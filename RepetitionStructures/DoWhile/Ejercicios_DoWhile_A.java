/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author Justin David Damito Sanchez
 */
public class Ejercicios_DoWhile_A {
    public static void main(String[] args) {
           
        //inicializacion
        int suma = 0, i = 1;
        
        //bucle
        do{
            if(i % 2 == 1){//si el resto de i entre 2 es igual a 1
            suma+=i;//operacion combinada suma 
            }
            i++;//operacion incremental
            
            
        }while(i < 12);//mientras que i sea menor o igual a 12
        
        System.out.println("la suma de los numeros impares del 0 hasta el 12 es de:  " + suma);//salida
    }
}
