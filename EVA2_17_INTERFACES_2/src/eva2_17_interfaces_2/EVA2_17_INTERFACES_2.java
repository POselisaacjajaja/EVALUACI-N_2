/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces_2;

/**
 *
 * @author isaaczapatto
 */
public class EVA2_17_INTERFACES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}

interface interA{
    void A();//                  EQUIVALENTE Apublic abstract void ();
    
}

interface interB{
    public abstract void B(); // EQUIVALENTE A void B();
}

interface interC extends interA, interB{
    public abstract void C();
}

class Prueba implements interC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {        
    }
    
}