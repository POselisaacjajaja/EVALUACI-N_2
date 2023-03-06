/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author isaaczapatto
 */
public class Automóvil {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int año;
    
    
    public String getMarca(String x){
    return x;
    }
    public String getModelo(String x){
        return x;
    }
    public int getAño(int x){
        return x;
    }
    
    
    public void setMarca(String x){
        marca = x;
    }
    public void setModelo(String x){
        modelo = x;
    }
    public void setAño(int x){
        año = x;
    }
    
    public void imprimirDatos(){
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("La año es: " + año);
    }
    
}
