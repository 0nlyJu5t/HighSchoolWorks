/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_justindamitosanchez;
import com.mycompany.tarea_justindamitosanchez.especialista;

/**
 *
 * @author justin David Dámito Sánchez
 */
public class paciente extends persona {
    private String fechaConsulta;
    private especialista medicoTratante;

    public paciente(String nombre,String genero, int edad, double peso, double altura, String fechaConsulta, especialista medicoTratante) {
        super(nombre,genero,edad, peso, altura);
        this.fechaConsulta = fechaConsulta;
        this.medicoTratante = medicoTratante;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public especialista getMedicoTratante() {
        return medicoTratante;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public void setMedicoTratante(especialista medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public boolean esMayorDeEdad() {
        return getEdad() >= 18;
    }

    public double calculoIMC() {
        double altura = getAltura();
        double peso = getPeso();
        return peso / (altura * altura);
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + 
               "\nGénero: " + getGenero() + 
               "\nEdad: " + getEdad() +" años"+
               "\nPeso: " + getPeso() +" kg"+ 
               "\nAltura: " + getAltura() +" m"+ 
               "\nFecha de Consulta: " + getFechaConsulta() +
               "\nMédico Tratante: " + getMedicoTratante().getNombre() + 
               "\nIMC:" + calculoIMC() + 
               "\nMayor de Edad: " + esMayorDeEdad() + "\n\n";}
}
