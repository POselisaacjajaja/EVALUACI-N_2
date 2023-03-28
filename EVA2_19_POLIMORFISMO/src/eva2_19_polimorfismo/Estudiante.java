/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author isaaczapatto
 */

       //CLASE DERIVADA extends CLASE BASE
           //CLASE HIJO extends CLASE PADRE
             //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    public String noControl;

    public Estudiante() { //Constructor default
        super();//Invoca al Constructor de la super clase
        this.noControl = "______";
    }
    
    public Estudiante(String nombre, String apellido, int edad, String noControl){
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("No. de control: " + noControl);
  
    }
    
}
