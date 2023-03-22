/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author isaaczapatto
 */
public abstract class Electrónica extends Productos {
    private String modelo;
    private String fabricante;
    private int garantía;

    
    
    public Electrónica() {
        super();
        this.modelo = "";
        this.fabricante = "";
        this.garantía = 0;
    }

    public Electrónica(String modelo, String fabricante, int garantía, double Precio, String Nombre, String UnidadVenta, int PrecioVenta) {
        super(Precio, Nombre, UnidadVenta, PrecioVenta);
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.garantía = garantía;
    }

    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getGarantía() {
        return garantía;
    }

    public void setGarantía(int garantía) {
        this.garantía = garantía;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Electr\u00f3nica{" + "modelo=" + modelo + ", fabricante=" + fabricante + ", garant\u00eda=" + garantía + '}';
    }
    
    
    
    
}

