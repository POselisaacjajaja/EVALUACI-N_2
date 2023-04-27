/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_4_MULTIPLESEXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de x (número entero)");
                x = input.nextInt();
                System.out.println("Introduce el valor de y (número entero)");
                y = input.nextInt();

                int resu = x/y;
                System.out.println("El resultado de " + x + "/" + y + " es: " + resu);
                break;

            }catch(InputMismatchException e){
                System.out.println("Captura en formato incorrecto, no se puede convertir a número.");
                System.out.println("");

            }catch(ArithmeticException e){
                System.out.println("No se puede dividir entre cero.");
                System.out.println("");
            }
            }while(true);   
        System.out.println("Programa terminado exitosamente");
    }
    
}
