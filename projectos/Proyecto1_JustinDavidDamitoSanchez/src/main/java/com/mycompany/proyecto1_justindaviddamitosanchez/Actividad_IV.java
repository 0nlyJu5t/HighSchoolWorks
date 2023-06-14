/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_justindaviddamitosanchez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author CTPG
 */
public class Actividad_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:MM:SS");
        Date date = new Date();
        String nombre;
        int cantidad;
        double precio = 0,iva,precioIva;
        
        System.out.println("ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("ingrese la cantidad de productos: ");
        cantidad = sc.nextInt();
        
        String productos[] = new String [cantidad];
        double precios[] = new double [cantidad];
        
        for(int i = 0; i < cantidad; i++){
            System.out.println("ingrese el producto numero "+ (i+1));
            productos[i] = sc.next();
            
            System.out.println("ingrese el precio numero de el/la "+ productos[i]);
            precios[i] = sc.nextInt();
            precio += precios[i];
        }
        iva = precio * 0.13;
        precioIva = precio+iva;
        
        System.out.println("Factura del "+ dateFormat.format(date));
        System.out.println("\nCliente: "+ nombre);
        
        System.out.println("\nproductos        precios");
            for(int i = 0; i < cantidad; i++){
                System.out.print(String.format("%-18s",productos[i]));
                System.out.println(precios[i]);
            }
        System.out.println("                --------");
        System.out.println("Subtotal:         "+precio);
        System.out.println("Iva:              "+iva);
        System.out.println("Total:            "+precioIva);
        
    }
}
