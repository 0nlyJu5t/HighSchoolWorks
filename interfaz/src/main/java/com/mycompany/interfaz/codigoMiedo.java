/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

/**
 *
 * @author JDM
 */
public class codigoMiedo {
    
    //variable resultado publica
    public double resultado;
    
    //calculadora basica
    
        //suma
            public void sumaCalc(double valor,double valor1){
                resultado = valor + valor1;
            }

        //resta
            public void restCalc(double valor,double valor1){
                resultado = valor - valor1;
            }

        //mult
            public void multCalc(double valor,double valor1){
                resultado = valor * valor1;
            }

        //divi
            public void diviCalc(double valor,double valor1){
                resultado = valor / valor1;
            }

    //areas y perimetros 
        
        //cuadrado
            public double areaCuadra(double n1){
                return Math.pow(n1, 2);
            }

            public double periCuadra(double n1){
                return 4 * n1;
            }

        //circulo
            public double areaCircu(double radio){
                return Math.PI * Math.pow(radio, 2);
            }

            public double periCircu(double radio){
                return 2 * Math.PI * radio;
            }

        //triangulo
            public double areaTria(double base, double altura){
                return (altura*base)/2;
            }

            public double periTria(double n1){
                return n1 * 3;
            }

        //rombo
            public double areaRom(double dMa, double dMe){
                return (dMa*dMe)/2;
            }

            public double periRom(double n1){
                return n1 * 4;
            }
                
        //validacioens
            public boolean isNumeric(String dato) {
                try {
                    Double.parseDouble(dato);
                    return true;
                } catch (NumberFormatException excepcion) {
                    return false;
                }
            }



}
    



