/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.setNombre("Alvin");
        persona1.setApellido("Yakitori");
        try{
            persona1.setEdad(-6);
        }catch(datoIncorrectoCheckEx e){
            System.out.println(e.getMessage());
        }
    }
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws datoIncorrectoCheckEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws datoIncorrectoCheckEx {
        if(edad<0)
//            throw new datoIncorrectoException();  UNCHECKED EXCEPTION
            throw new datoIncorrectoCheckEx();
                
        this.edad = edad;
    }
    
}

class datoIncorrectoException extends RuntimeException{ //UNCHECKED EXCEPTION

    public datoIncorrectoException() {
        super("Dato incorrecto!! El valor introducido no puede ser negativo.");
    
    }
    
}

class datoIncorrectoCheckEx extends Exception{          //CHECKED EXCEPTION

    public datoIncorrectoCheckEx() {
        super("Dato incorrecto!! El valor introducido no puede ser negativo.");
    }   
}
