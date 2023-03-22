/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electrónica;

/**
 *
 * @author isaaczapatto
 */
public final class Computadora extends Electrónica {
    private int memoria;
    private double tamañoPantalla;
    private String tamaño;
    private int discoDuro;
    private String procesador;

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamañoPantalla = 0.0;
        this.tamaño = "";
        this.discoDuro = 0;
        this.procesador = "";
    }

    public Computadora(int memoria, double tamañoPantalla, String tamaño, int discoDuro, String procesador, String modelo, String fabricante, int garantía, double Precio, String Nombre, String UnidadVenta, int PrecioVenta) {
        super(modelo, fabricante, garantía, Precio, Nombre, UnidadVenta, PrecioVenta);
        this.memoria = memoria;
        this.tamañoPantalla = tamañoPantalla;
        this.tamaño = tamaño;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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
        return "Computadora{" + "memoria=" + memoria + ", tama\u00f1oPantalla=" + tamañoPantalla + ", tama\u00f1o=" + tamaño + ", discoDuro=" + discoDuro + ", procesador=" + procesador + '}';
    }
    
    
    
}


/* 


++NO SE PUEDE HEREDAR DE UNA CLASE CON FINAL++

class Laptop extends Computadora{
    
}


*/