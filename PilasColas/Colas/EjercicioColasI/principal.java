/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioColaI;

import javax.swing.JOptionPane;

/**
 *
 * @author justi
 */
public class principal {
    public static void main(String[] args) {
        
    int menu = 0;
    double Dato_Nodo ;
    
    Cola cola=new Cola();
    
    do{
        try{
            menu= Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones de la Cola\n"
                +"1. Mostrar estaturas\n"
                +"2. Insertar una estatura\n"
                +"3. Extraer estatura\n"
                +"4. Salir\n\n"));
        switch (menu) {
            case 1:
                cola.MostrarCola ();
                break;
            case 2:
                Dato_Nodo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la estatura a incluir en el nodo"));
                cola.Insertar (Dato_Nodo);
                break;
            case 3:
                if (!cola.ColaVacia()) {
                JOptionPane.showMessageDialog(null, "Se extrajo la estatura: " + cola.Extraer());
            }else{
            
                JOptionPane.showMessageDialog(null, "La cola esta vacia");
            
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
