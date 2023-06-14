/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPila;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class principal {
    public static void main(String[] args) {
        
    int menu = 0;
    double Dato_Nodo;
    Pila pila = new Pila();
    
    do{
        try{
            menu= Integer.parseInt((JOptionPane.showInputDialog(null, "Opciones de la pila\n"
                +"1. Mostrar pesos\n"
                +"2. Insertar un peso\n"
                +"3. Extraer peso\n"
                +"4. Salir\n\n")));
        switch (menu) {
            case 1:
                pila.MostrarPila ();
                break;
            case 2:
                Dato_Nodo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el peso a incluir en el nodo"));
                pila.Insertar(Dato_Nodo);
                break;
            case 3:
                if (!pila.PilaVacia()) {
                JOptionPane.showMessageDialog(null, "Se extrajo el peso: " + pila.desapilar());
            }else{
                JOptionPane.showMessageDialog(null, "La pila esta vacia");   
                }   
                break;
            case 4:
                menu = 4;
            break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion seleccionada no esta dentro del menu");
            break;
            }
        }catch (NumberFormatException e) {
                    
            }
        }while (menu!=4);
    }
}
