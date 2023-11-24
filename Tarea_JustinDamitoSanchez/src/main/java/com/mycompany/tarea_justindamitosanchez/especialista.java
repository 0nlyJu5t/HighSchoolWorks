/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_justindamitosanchez;

/**
 *
 * @author justin David Dámito Sánchez
 */
class especialista extends persona {
    private double precioConsulta;
    private String especialidad;

    public especialista(String nombre,String genero, int edad, double peso, double altura,double precioConsulta, String especialidad) {
        super(nombre,genero,edad, peso, altura);
        this.precioConsulta = precioConsulta;
        this.especialidad = especialidad;
    }

    public double getPrecioConsulta() {
        return precioConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setPrecioConsulta(double precioConsulta) {
        this.precioConsulta = precioConsulta;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
        @Override
    public String toString() {
        return "\n\nNombre: " + getNombre() + 
               "\nGénero: " + getGenero() + 
               "\nEdad: " + getEdad() + " años" +
               "\nPeso: " + getPeso() +" kg"+ 
               "\nAltura: " + getAltura() +" m"+ 
               "\nPrecioConsulta: " +  getPrecioConsulta()+
               "\nEspecialidad: " + getEspecialidad() + "\n\n";}
}