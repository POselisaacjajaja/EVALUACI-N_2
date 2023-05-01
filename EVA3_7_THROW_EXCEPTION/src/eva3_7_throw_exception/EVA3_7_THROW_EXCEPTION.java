/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author isaaczapatto
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Prueba obj1 = new Prueba();
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor positivo");
            int valor = input.nextInt();
            obj1.setValor(valor);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());//ES LA SUOPERCLASE DE TODAS LAS EXCEPCIONES, POR TANTO LAS CAPTURA A TODAS
                                                    // COMPLICA DETECTAR EL TIPO DE EXCEPCIOÓN Y DAR LA SOLUCIÓN CORRECTA
        }

    }
    
}


class Prueba{
    private int valor;

    public int getValor() {
        return valor;
    }

    //Checked exceptions: SE DEBE resolver en tiempo de compilación. 
    //Unchecked exceptions: errores de lógica del programador. JAVA NO TE OBLIGA A RESOLVERLAS.
    public void setValor(int valor) throws Exception {
        if(valor<0)
            throw new Exception("El valor " + valor + " es inválido. Debe de ser mayor o igual a cero.");
                        
        else
            
            
        this.valor = valor;
    }
    
    
}
