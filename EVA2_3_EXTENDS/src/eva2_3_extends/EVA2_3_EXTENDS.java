/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Amarillo");
        estu.setApellidos("Amarilloncio");
        estu.setEdad(69);
        estu.setNoControl("22550331");
        
        System.out.println("Datos del estudiante:");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellidos());
        System.out.println(estu.getEdad() + " años");
        System.out.println(estu.getNoControl());
        
        Docentes doce1 = new Docentes();
        doce1.setNombre("Alfonso");
        doce1.setApellidos("Ruvalcaba");
        doce1.setEdad(99);
        doce1.setPlaza("PAOSAK(/&%$#898765");
    }
    
}
