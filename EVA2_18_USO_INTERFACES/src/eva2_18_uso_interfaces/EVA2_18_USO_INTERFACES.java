/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Figuras figura1 = new Figuras(); no se puede
        //mostrarDatos dato1 = new mostrarDatos(); no se puede
        
        Círculo circulo1 = new Círculo(50);
        circulo1.imprimirDatos();
        
        System.out.println("");
        System.out.println("");
        
        Triángulo triangulo1 = new Triángulo(20, 20);
        triangulo1.imprimirDatos();
        
        
    }
    
}
