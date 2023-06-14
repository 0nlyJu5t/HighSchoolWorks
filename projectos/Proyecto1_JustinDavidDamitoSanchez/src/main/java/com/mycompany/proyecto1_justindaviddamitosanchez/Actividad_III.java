/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_justindaviddamitosanchez;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author CTPG
 */
public class Actividad_III {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        Scanner sc = new Scanner(System.in); 
        
        int op,dato;
        
        do{
            System.out.println("menu--------------------");
            System.out.println("1-apilar dato");
            System.out.println("2-desapilar dato");
            System.out.println("3-cantidad de elementos");
            System.out.println("4-salir");
            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("ingresar dato a apilar");
                    dato=sc.nextInt();
                    pila.push(dato);
                    break;
                case 2:
                    if(!pila.isEmpty()){
                        System.out.println("dato desapilado:" + pila.pop());
                    }else{System.out.println("Pila vacia");}
                    break;
                case 3:
                        System.out.println("numero de elementos:" + pila.size());
                    break;
                default:
                    System.out.println("numero invalido");
            }
        }while(op!=5);
     }   
}
