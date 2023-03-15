/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super2;

/**
 *
 * @author isaaczapatto
 */


           //SUBCLASE extends SUPERCLASE
     //CLASE DERIVADA extends CLASE BASE
         //CLASE HIJO extends CLASE PADRE
public class Docentes extends Persona {
    private String plaza;

    public Docentes() {
    super();
    this.plaza = "____";
    }
    
    public Docentes(String nombre, String apellido, int edad, String plaza){
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("Plaza: " + plaza);
  
    }
    
}
