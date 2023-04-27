/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exception;

import java.util.Scanner;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_1_UNCHECKED_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //ARITHMETIC EXCEPTION: DIVISÓN ENTRE CERO
        System.out.println("Iniciando programa");
        System.out.println("Declarando variables");
        int x = 5, y = 0;
        System.out.println("Intentar la división");
        int resu = x / y;   //AQUÍ SE EJECUTA LA EXCEPCIÓN
                            //SI NO SE ATIENDE, EL PROGRAMA TERMINA
        System.out.println("El resultado es: " + resu); //ESTA LÍNEA YA NO SE EJECUTA

        
     
        //INPUTMISMATCH EXCEPTION
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = input.nextInt();   //SI EL USUARIO CAPTURA UNA CADENA QUE NO PUEDE CONVERTIRSE A NÚMERO, 
                                        //SE PRODUCE UNA EXCEPCIÓN Y El PROGRAMA TERMINA
        System.out.println("El número es: " + numero);




        //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5]; //arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;   //<--?????wtf????!!!!
                            //5 no es un índice válido, el arreglo va de 0 a 4.
                            
                            
        //NULLPOINTER EXCEPTION
        
        Prueba objPrueba = null; //El objeto no existe, es nulo
        System.out.println("Valor de x: " + objPrueba.x); //No puedo leer la x, bc el objeto no existe
    }
}

class Prueba{
    int x = 100;
}