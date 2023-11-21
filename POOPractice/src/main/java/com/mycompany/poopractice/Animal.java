/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopractice;

/**
 *
 * @author justin damito sanchez
 */
public class Animal {
    private String nombre;
    private int tamaño;
    private int edad;
    private double peso;
    private boolean vacunas;


public Animal(String nombre, int tamaño, int edad, double peso, boolean vacunas){
    this.nombre = nombre;
    this.tamaño = tamaño;
    this.edad = edad;
    this.peso = peso;
    this.vacunas = vacunas;
}
public String getNombre(){
        return nombre;
    }
    
public void setNombre(String nombre){
        this.nombre = nombre;
    }

public int getTamaño(){
        return tamaño;
    }
    
public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }

public int getEdad(){
        return edad;
    }
    
public void setEdad(int edad){
        this.edad = edad;
    }

public double getPeso(){
        return peso;
    }
    
public void setPeso(double peso){
        this.peso = peso;
    }

public boolean getVacunas(){
        return vacunas;
    }
    
public void setVacunas(boolean vacunas){
        this.vacunas = vacunas;
    }
}
