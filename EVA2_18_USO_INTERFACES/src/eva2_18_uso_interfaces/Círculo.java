/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author isaaczapatto
 */

// LA INTERFAZ ES COMO UN CONTRARO. TE OBLIGA A SEGUIR CIERTO COMPORTAMIENTO
public class Círculo implements Figuras, mostrarDatos {
    private double radio;

    public Círculo() {
        this.radio = 0;
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio*radio*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return radio*2*Math.PI;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Dado el radio " + radio);
        System.out.println("El área del círculo es: " + calcularArea());
        System.out.println("El perímetro del círculo es: " + calcularPerimetro());
    }
    
    
    
}
