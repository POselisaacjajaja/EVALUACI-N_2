/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_5_CAPTURAR_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de x (número entero)");
                valor = input.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("El valor es erróneo, no se puede convertir a número");
                System.out.println("");
                
            }
        }while(true);
        
        System.out.println("El valor capturado es: " + valor);
    }
    
}
