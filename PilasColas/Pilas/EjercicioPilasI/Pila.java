/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPilaI;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class Pila {
    private EjercicioPilaI.Nodo inicio, fin;
        String Pila=""; 

    public Pila () {
        inicio=null;
        fin=null;}

    public boolean PilaVacia() {
        return inicio==null;
    }
    
public void Insertar (String valor) { 
    EjercicioPilaI.Nodo nuevoNodo = new EjercicioPilaI.Nodo ();
    nuevoNodo.valor = valor; 
    nuevoNodo.siguiente = null;
        if (PilaVacia()){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
    }
}
public String desapilar(){ 
    String dEliminado = fin.valor;
    if (inicio==fin){
        inicio=null;
        fin=null;
    }else {
        Nodo puntero = inicio;
    while (puntero.siguiente!=fin){ 
        puntero = puntero.siguiente;
        }
        fin = puntero;
            fin.siguiente=null;
}
        return dEliminado;
}
public void MostrarPila(){ 
    EjercicioPilaI.Nodo buscar = inicio;
    String PilaInvertida="";  
    while (buscar!=null) {
        Pila += buscar.valor + " ";
        buscar=buscar.siguiente;
    }
    String cadena[]=Pila.split(" ");

    for (int i=cadena.length-1;i>=0; i--) {
    PilaInvertida+= "\n"+cadena[i];
    }
    JOptionPane.showMessageDialog(null,PilaInvertida);
    Pila="";}
}
