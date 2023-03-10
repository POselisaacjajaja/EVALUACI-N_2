/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_herencia_2;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_5_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SubClase obj = new SubClase();
        obj.mensaje();
        
    }
    
}


class SuperClase{
    public void mensaje(){
        System.out.println("Hola");
    }
}

class SubClase extends SuperClase{
    
}