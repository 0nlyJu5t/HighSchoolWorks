/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registropractice;

/**
 *
 * @author JDM
 */

import java.util.Scanner;

public class registroPractice4 {
    //artista, titulo, duracion
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        registroPractice2[] songs = new registroPractice2[15];

        for (int i = 0; i < songs.length; i++) {
            songs[i] = new registroPractice2();
            System.out.println("-----  ------Cancion-" + (i + 1) + "----------");
            System.out.println("Ingrese el artista de la canción: ");
            songs[i].artista = sc.nextLine();
            System.out.println("Ingrese el título de la canción: ");
            songs[i].titulo = sc.nextLine();
            System.out.println("Ingrese la duración de la canción (en segundos): ");
            songs[i].duracion = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < songs.length; i++) {
            System.out.println("-----------Cancion-" + i + 1 + "----------");
            System.out.println("artista   " + songs[i].artista);
            System.out.println("titulo:   " + songs[i].titulo + ".mp3");
            System.out.println("duracion: " + songs[i].duracion + " seg");
        }
    }
}
