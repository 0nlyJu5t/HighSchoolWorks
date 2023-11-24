/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_justindamitosanchez;

import com.mycompany.tarea_justindamitosanchez.paciente;
import com.mycompany.tarea_justindamitosanchez.especialista;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author justin David Dámito Sánchez
 */
public class principal {
    public static void main(String[] args) {
        
        especialista esp = new especialista("Kevin Levrone","Masculino",59,120,1.80,50000,"Entrenador fisico");
        paciente pac = new paciente("Justin","Masculino",17,71,1.80,"15/10/23",esp);
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Elegir opción:" + 
                    "\n1. Cambiar datos de paciente" + 
                    "\n2. Cambiar datos de especialista" + 
                    "\n3. Imprimir datos paciente"+ 
                    "\n4. Imprimir datos especialista"+
                    "\n5.Salir"));

            switch (op) {
                case 1:
                    pac.setNombre(JOptionPane.showInputDialog("Nombre del paciente: "));
                    pac.setGenero(JOptionPane.showInputDialog("Genero del paciente: "));
                    pac.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad del paciente: ")));
                    pac.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Peso del paciente: ")));
                    pac.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Altura del paciente: ")));
                    pac.setFechaConsulta(JOptionPane.showInputDialog("Fecha de consulta del paciente: "));
                    break;
                case 2:
                    esp.setNombre(JOptionPane.showInputDialog("Nombre del especialista: "));
                    esp.setGenero(JOptionPane.showInputDialog("Genero del especialista: "));
                    esp.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad del especialista: ")));
                    esp.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Peso del especialista: ")));
                    esp.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Altura del especialista: ")));
                    esp.setPrecioConsulta(Integer.parseInt(JOptionPane.showInputDialog("Fecha de consulta del especialista: ")));
                    esp.setEspecialidad(JOptionPane.showInputDialog("Fecha de consulta del especialista: "));
                    break;
                case 3:
                       JOptionPane.showInputDialog("Paciente: " + pac.toString());
                    break;
                case 4:
                       JOptionPane.showInputDialog("Especialista: " + esp.toString());
    
                    break;
                default:
                    JOptionPane.showInputDialog("Opción no válida");
                }
        }while(op != 5);
    }
}
