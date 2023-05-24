/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_has_a_direccion;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();               //
        persona1.setNombre("Alvin");
        persona1.setApellido("Yakitori");
        persona1.setEdad(2);
        
        
        /*Direccion direccion = new Direccion();          //
        direccion.setCalle("Av. Industrias");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo Industrial Chihuahua");
        direccion.setCp("31305");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        
        persona1.setDireccion(direccion);
        */
        
        persona1.imprimirDatos();
    }
    
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "SN";
        this.numero = 0;
        this.colonia = "SN";
        this.cp = "SN";
        this.ciudad = "SN";
        this.estado = "SN";
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("""
                           Dirección:
                            Calle: """ + calle + ", Número: " + numero + ", Colonia: " + colonia + ", Código Postal: " + cp + ", Ciudad: " + ciudad + ", Estado: " + estado);
    }
}
    
    class Persona{
        private String nombre;
        private String apellido;
        private int edad;
        private Direccion direccion; //Persona has-a dirección.

        public Persona() {
            this.nombre = "SN";
            this.apellido = "SN";
            this.edad = 0;
            this.direccion = null; //La dirección aún no existe.
            
        }

        public Persona(String nombre, String apellido, int edad, Direccion direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.direccion = direccion;
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

        public Direccion getDireccion() {
            return direccion;
        }

        public void setDireccion(Direccion direccion) {
            this.direccion = direccion;
        }
    public void imprimirDatos(){
        System.out.println("Persona: \n");
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
        if(direccion == null)
            System.out.println("SIN DIRECCIÓN");
        else
            direccion.imprimirDatos();
}
    }
