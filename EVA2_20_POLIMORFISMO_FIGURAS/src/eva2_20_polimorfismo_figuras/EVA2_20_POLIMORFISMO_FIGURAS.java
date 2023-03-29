/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_polimorfismo_figuras;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

/*
        Círculo circulo1 = new Círculo(5);
        circulo1.imprimirDatos();
        
        System.out.println("");
        //FIGURA ES PADRE DE CÍRCULO, PODEMOS ASIGNAR UN OBJETO CÍRCULO A UNA VARIABLE FIGURA
        
        Figuras figura1 = circulo1;
        System.out.println("Usando Figuras:");
        System.out.println("El área es: " + figura1.calcularArea());
        System.out.println("El perímetro es: " + figura1.calcularPerimetro());

        int[] arreglo = new int[10];//Arreglo de tipo entero que guardará 10 datos
        //Un arreglo dónde comienza y dónde termina?
        //Un arreglo comienza en 0.
        //Un arreglo termina en N - 1.
        //En este caso, comienza en 0 y termina en 9.
        arreglo[0] = 100;
        
        System.out.println(arreglo[0]);
*/

        System.out.println("¿Cuántas figuras necesitas?");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] figuras = new Figuras[cant];
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("¿Qué tipo de figuras necesitas? 1.Círculo, 2.Triángulo");
            int tipo = input.nextInt();
            if(tipo == 1){//CÍRCULO
                Círculo circulo1 = new Círculo();
                System.out.println("Introduce el radio.");
                circulo1.setRadio(input.nextDouble());//Capturamos el dato del usuario
                figuras[i] = circulo1;
            }else{//TRIÁNGULO
                Triángulo triangulo1 = new Triángulo();
                
                System.out.println("Introduce la base.");
                triangulo1.setBase(input.nextDouble());//Capturamos el dato del usuario
                System.out.println("Introduce la altura.");
                triangulo1.setAltura(input.nextDouble());//Capturamos el dato del usuario
                
                figuras[i] = triangulo1;
            }
            
            
        }
        
        //Imprimir los resultados
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Círculo){
                System.out.println("Círculo: " + i);
                //CASTING --> CONVERSIÓN
                //EJEMPLO
                //int val = (int)(Math.random() * 100);
                Círculo circulo1 = (Círculo)figuras[i];
                circulo1.imprimirDatos();
                
            
            }else{
                System.out.println("Triángulo: " + i);
                Triángulo triangulo1 = (Triángulo)figuras[i];
                triangulo1.imprimirDatos();
                
            }
            
            
            /*
            System.out.println("");
            
            
            System.out.println("Figura: " + i);
            System.out.println("Área: " + figuras[1].calcularArea());
            System.out.println("Perímetro: " + figuras[1].calcularPerimetro());
            
            
            System.out.println("");
            System.out.println("");
            */
        }
        
        
        // Figuras[] figuras = new Figuras[cant];
        /*
        Círculo[] circulos = new Círculo[cant];
        
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Círculo();
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprimirDatos();
        }
            */
    }
}