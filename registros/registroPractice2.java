/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registropractice;

import java.util.Scanner;

/**
 *
 * @author JDM
 */

public class registroPractice2 {
    String artista, titulo;
    int duracion;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        registroPractice2 songs = new registroPractice2();

        System.out.println("ingrese el artista de la cancion: ");
        songs.artista = sc.nextLine();
        System.out.println("ingrese el titulo de la cancion: ");
        songs.titulo = sc.nextLine();
        System.out.println("ingrese el tiempo de la cancion: ");
        songs.duracion = sc.nextInt();

        System.out.println("---------------------------------");
        System.out.println("artista   " + songs.artista);
        System.out.println("titulo:   " + songs.titulo + ".mp3");
        System.out.println("duracion: " + songs.duracion + " seg");

    }
}
