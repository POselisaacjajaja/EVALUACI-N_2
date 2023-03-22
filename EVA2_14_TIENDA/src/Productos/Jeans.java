/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author isaaczapatto
 */
public class Jeans extends Ropa{
    private String material;
    private String estilo;

    public Jeans(String material, String estilo) {
        this.material = material;
        this.estilo = estilo;
    }

    public Jeans() {
    }
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    
    
    
    
    @Override
    public double precioVenta(int cant){
        //antes de cierta cantidad de precio existe tal descuento
        //después de cierta cantidad de precio existe tal descuento
        if (cant <= 10)
            return precio * cant;
        else
            return (precio * .80) * cant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Jeans{" + "material=" + material + ", estilo=" + estilo + '}';
    }

    
    
}
