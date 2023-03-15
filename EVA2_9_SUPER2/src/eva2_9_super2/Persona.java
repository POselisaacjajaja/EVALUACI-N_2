/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super2;

/**
 *
 * @author isaaczapatto
 */
public class Persona {
    //Atributos
    private  String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "______";
        this.apellido = "______";
        this.edad = -1;
        
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellidos: " + this.apellido);
    System.out.println("Edad: " + this.edad);
}

}

