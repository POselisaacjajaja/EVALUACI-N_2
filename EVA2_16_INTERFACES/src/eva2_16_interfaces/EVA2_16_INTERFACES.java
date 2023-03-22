/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // mostrarDatos datos1 = new mostrarDatos();     <-- NO SE PUEDE INSTANCIAR UNA INTERFAZ
        
        Persona persona1 = new Persona("Benito Castañeda", 2);
        persona1.imprimirDatos();
        System.out.println(" ");
        
        
        Computadora compu1 = new Computadora("Apple", "Intel i7", 200, "MacBook");
        compu1.imprimirDatos();
    }
    
}
