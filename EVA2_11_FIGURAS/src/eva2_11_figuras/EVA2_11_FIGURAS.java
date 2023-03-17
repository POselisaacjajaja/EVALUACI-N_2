/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_11_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Círculo circulo1 = new Círculo();
        System.out.println("Area: "+circulo1.calcularArea());
        System.out.println("Perímetro: "+circulo1.calcularPeri());
        
        Triángulo triangulo1 = new Triángulo();
        System.out.println("Área: "+triangulo1.calcularArea());
        System.out.println("Perímetro: "+triangulo1.calcularPeri());
        
        Figuras figura1 = new Figuras();
        System.out.println("Área: " + figura1.calcularArea());
        System.out.println("Perímetro: " + figura1.calcularPeri());
        
    }
    
}

