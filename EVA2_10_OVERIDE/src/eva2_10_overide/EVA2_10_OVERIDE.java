/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_overide;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_10_OVERIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("PAtrisiO", 2);
        System.out.println(persona1);
        System.out.println("");
        System.out.println(persona2);
        
        
    }
    }
    
    class Persona{
        private String Nombre;
        private int Edad;

        public Persona(String Nombre, int Edad) {
            this.Nombre = Nombre;
            this.Edad = Edad;
        }

        public Persona() {
            Nombre = "jeff";
            Edad = 0;
        }

        
        
        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int Edad) {
            this.Edad = Edad;
        }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
        
    }
    
    