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
public class Comparador {
    
    public void EsIgualA(){
        
        String alumno1, alumno2;
        
        alumno1 = "DAvId";
        alumno2 = "david";
        //No importan mayusculas
        
        System.out.println("Alumno 1: "+ alumno1);
        System.out.println("Alumno 2: "+ alumno2);
        
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        if (alumno1.equalsIgnoreCase(alumno2) == true)
        {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
        
    }
    
}
