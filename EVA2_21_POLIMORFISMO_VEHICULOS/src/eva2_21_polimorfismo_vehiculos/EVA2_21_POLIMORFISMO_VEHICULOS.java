/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        automovil auto1 = new automovil("bosbagen", 0, "Vocho", 2000);
        modificarVel(auto1, 40);
        
        
        System.out.println("");
        
        bicicleta bici1 = new bicicleta("Montala", "Apache", 0);
        modificarVel(bici1, 25);
    }
    public static void modificarVel(controlarDatos datos, int Vel){
        datos.cambiarvelocidad(Vel);
        datos.tablero();
    }
}

class Vehiculo{
    private String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Vehiculo() {
        this.marca = "_______";
        this.velocidad = 0;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}

interface controlarDatos{
    void cambiarvelocidad(int cambio);
    public abstract void tablero();
}

class automovil extends Vehiculo implements controlarDatos{
    private String modelo;
    private int año;

    public automovil() {
        this.año = 0;
        this.modelo = "________";
    }

    public automovil(String marca, int velocidad, String modelo, int año) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
        int vel = velocidad + cambio;
        if(vel >= 0){
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Automovil:");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Combustible (pendiente)");
        System.out.println("Revoluciones (pendiente)");
    }
    
    
    
}

class bicicleta extends Vehiculo implements controlarDatos{
    private String tipo;

    public bicicleta() {
        this.tipo = "____";
    }

    public bicicleta(String tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
        int vel = velocidad + cambio;
        if(vel >= 0){
            velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta:");
        System.out.println("Velocidad: " + velocidad);
    }
}