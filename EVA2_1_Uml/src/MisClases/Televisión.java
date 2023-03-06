/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author isaaczapatto
 */
public class Televisión {
    //ATRIBUTOS
    private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(int x){
    return x;
    }
    public int getVolumen(int x){
        return x;
    }
    public boolean getpower(boolean x){
        return x;
    }
    
    
    public void setCanal(int x){
        canal = x;
    }
    public void setVolumen(int x){
        volumen = x;
    }
    public void setpower(boolean x){
        power = x;
    }
    
    public void imprimirDatos(){
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("TV está encendida: " + power);
    }
}
