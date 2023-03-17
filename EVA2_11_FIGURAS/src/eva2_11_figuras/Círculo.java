/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

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
        radio = 100;
    }

    
    
    
    @Override
    public double calcularArea(){
        return Math.PI * radio*radio;
    }
    
    @Override
    public double calcularPeri(){
        return Math.PI * radio*2;
    }

    @Override
    public String toString() {
        return "C\u00edrculo{" + "radio=" + radio + '}';
    }
    
    
    
}
