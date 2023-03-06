/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author isaaczapatto
 */
public class Persona {
    //ATRIBUTOS
    private int id;
    private String name;
    private int edad;

    public int getID(int x){
    return x;
    }
    public String getName(String x){
        return x;
    }
    public int getEdad(int x){
        return x;
    }
    
    
    public void setID(int x){
        id = x;
    }
    public void setName(String x){
        name = x;
    }
    public void setEdad(int x){
        edad = x;
    }
    
    public void imprimirDatos(){
        System.out.println("El ID es: " + id);
        System.out.println("El nombre es: " + name);
        System.out.println("La edad es: " + edad);
    }
    
    
}
