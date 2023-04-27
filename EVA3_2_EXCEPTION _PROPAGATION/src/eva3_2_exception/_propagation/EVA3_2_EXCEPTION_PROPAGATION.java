/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_exception._propagation;

import java.awt.BorderLayout;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia MAIN");
        A();
        System.out.println("Termina MAIN");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
        
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
        
    }
    public static void C(){
        System.out.println("Inicia C");
        int x = 5, y = 0;
        int resu = x / y;
        System.out.println("Resultado: " + resu);
        System.out.println("Termina C");
        
    }
/*
    public static void D(){
        System.out.println("Inicia D");
        System.out.println("Termina D");
    }
*/        
}
