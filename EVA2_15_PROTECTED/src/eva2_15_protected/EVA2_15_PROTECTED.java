/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_protected;

import Prueba.Superclase;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_15_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class SubClase extends Superclase{
    public void imprimirValor(){
        System.out.println("El valor es: " + valor);
    }
}