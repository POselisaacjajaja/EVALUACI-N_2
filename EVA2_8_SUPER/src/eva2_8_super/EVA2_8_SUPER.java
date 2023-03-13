/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal1 = new Animal(100);
        Mamífero mamífero1 = new Mamífero("Azul", 2);
        Perros perro1 = new Perros();
        
        
    }
    
}


class Animal{
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Animal(){
        System.out.println("Está vivo");
    }

    public Animal(int peso) { //Segundo constructor
        this.peso = peso;
        System.out.println("Está vivo (segundo constructor)");
    }
    
    
    
    public void respirar(){
        System.out.println("Respira");
    }
    
    public void come(){
        System.out.println("Se alimenta");
        
    }   
}

class Mamífero extends Animal{
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
    
    Mamífero(){
        super(); //Llamada al constructor de la superclase. En nuestro caso, llama Animal();
        //Siempre debemos llamar primero al csontructor de la superclase
        System.out.println("Es un mamífero");
    }

    public Mamífero(String colorPelo, int peso) {
        super(peso); //SIEMPRE SE LLAMA AL COSNTRUCTOR DE LA SUPER CLASE
        this.colorPelo = colorPelo;
        System.out.println("Es un mamíferoxd, segundo constructor");
    }
}

class Perros extends Mamífero{
    public Perros(){
        //SIEMPRE HAY QUE INDICAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("Es un perro");
    }
}