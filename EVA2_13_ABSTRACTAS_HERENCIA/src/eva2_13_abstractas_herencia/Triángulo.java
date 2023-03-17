/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author isaaczapatto
 */
public class Triángulo extends Figuras{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public Triángulo(double base, double altura) {
        this.base = 100;
        this.altura = 100;
    }


    
    
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triángulo() {
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    @Override
    public double calcularPeri(){
        double hip = Math.sqrt((base*base)+(altura*altura));
        return base + altura + hip;
    }
    
    @Override
    public String toString() {
        return "Tri\u00e1ngulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
