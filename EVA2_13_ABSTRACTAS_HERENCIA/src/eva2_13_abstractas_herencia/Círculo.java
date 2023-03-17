/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author isaaczapatto
 */
public class Círculo extends Figuras{
        private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Círculo(){
    }

    public Círculo(double radio) {
        this.radio = 100;
    }
    
    
    
    @Override
    public double calcularArea(){
        return Math.PI * radio*radio;
    }
    
    @Override
    public double calcularPeri(){
        return Math.PI * radio*2;
    }
   
}
