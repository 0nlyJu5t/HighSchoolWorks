/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCola;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class Cola {
    private Nodo inicio, fin; 
    String Cola="";
    
    public Cola() {
        inicio = null;
        fin = null;
    }
    public boolean ColaVacia() {
        return inicio == null;
    }
    public void Insertar (String info) { 
        Nodo nuevoNodo=new Nodo ();
        nuevoNodo.info=info;
        nuevoNodo.Siguiente=null;

        if(ColaVacia ()){
            inicio = nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.Siguiente=nuevoNodo; 
            fin=nuevoNodo;
        }
    }
    public String Extraer () { //Extracción de la cola 
        if (!ColaVacia ()) {
            String dato=inicio.info;
            if (inicio==fin) {
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.Siguiente;
            }
            return dato;
        }else{
            return "...";
            }
    }
public void MostrarCola () {
    Nodo buscar=inicio;
    String ColaInvertida=" "; //invertimos una cadena de texto 
    while (buscar!=null) {
    
        Cola+=buscar.info +" ";
        buscar=buscar.Siguiente;
    }
    
    String cadena []=Cola.split(" ");

    for (int i=cadena.length-1;i>=0;i--) {
    ColaInvertida+= " "+cadena[i];
    }
    JOptionPane.showMessageDialog(null,"> " + ColaInvertida);
    Cola=" ";

    }
}


