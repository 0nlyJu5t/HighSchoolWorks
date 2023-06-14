/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPilaII;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class Pila {
    private EjercicioPilaII.Nodo inicio, fin;
        String Pila=""; 

    public Pila () {
        inicio=null;
        fin=null;}

    public boolean PilaVacia() {
        return inicio==null;
    }
    
public void Insertar (int valor) { 
    EjercicioPilaII.Nodo nuevoNodo = new EjercicioPilaII.Nodo ();
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
public int desapilar(){ 
    int dEliminado = fin.valor;
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
    EjercicioPilaII.Nodo buscar = inicio;
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
