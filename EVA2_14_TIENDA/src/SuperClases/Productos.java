/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author isaaczapatto
 */
public abstract class Productos {
    protected double precio;
    private String nombre;
    private String unidadVenta;
    private int precioVenta;

    public Productos(double Precio, String Nombre, String UnidadVenta, int PrecioVenta) {
        this.precio = Precio;
        this.nombre = Nombre;
        this.unidadVenta = UnidadVenta;
        this.precioVenta = PrecioVenta;
    }
    
    
    public Productos() {
        precio = 0;
        nombre = "";
        unidadVenta = "";
        precioVenta = 0;
    }

    public Productos(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public abstract double precioVenta (int cant);
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }
    
    
    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Productos{" + "precio=" + precio + ", nombre=" + nombre + ", unidadVenta=" + unidadVenta + ", precioVenta=" + precioVenta + '}';
    }

    
    
    
  
}

