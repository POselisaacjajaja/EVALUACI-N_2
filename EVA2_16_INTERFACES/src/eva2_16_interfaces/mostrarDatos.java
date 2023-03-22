/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_16_interfaces;

/**
 *
 * @author isaaczapatto
 */

//  NO SE PUEDE INSTANCIAR: --> SE PARECE A UNA CLASE ABSTRACTA
//  Sólo puede haber métodos públicos y abstractos
public interface mostrarDatos {
    public abstract void imprimirDatos();
    // void imprimirDatos();   <-- también es válido, pues está implícito que es abstracto y tiene que ser público
}
