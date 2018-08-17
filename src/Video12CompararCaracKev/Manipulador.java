/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video12CompararCaracKev;

/**
 *
 * @author HP ENVY
 */
public class Manipulador {
    
    public void subcadena(){
        
    String frase = "Hoy es un estupendo dia para aprender a programar en Java";
    
    String frasefinal = frase.substring(0,29)+" Irnos a la playa y olvidarnos de todo..." +
            
          " Y " + frase.substring(29, 57);
    
    System.out.println(frasefinal);
    }
    
    
}
