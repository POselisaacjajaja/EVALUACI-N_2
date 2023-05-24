/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_13_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String ruta = "/Users/isaaczapatto/Documents/archivosObjetos.per";
            Persona persona1 = new Persona("Alvin", "Yakitori", 12);
            //Guardar el objeto en archivo
            guardarObj(persona1, ruta);
            //Leer el objeto desde un archivo
            Persona resu = leerObj(ruta);
            System.out.println("Nombre " + resu.getNombre());
            System.out.println("Apellido " + resu.getApellido());
            System.out.println("Edad " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void guardarObj(Persona persona1, String ruta) throws FileNotFoundException, IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
        ooStream.writeObject(persona1);
        ooStream.close();
    }
    public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException{
        Persona persona1 = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);
        persona1 = (Persona)oiStream.readObject();
        return persona1;
    }
    
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}