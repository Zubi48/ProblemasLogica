/*
 *33.-Crear un array unidimensional de 20 elementos con nombres de personas.
 *Visualizar los elementos de la lista debiendo ir cada uno en una fila distinta. 
 */
package Problema33;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class Problema33 {
    public static void main(String[] args) {
        String[ ] nombre = {"María", "Gerson","María", "Gerson",
            "María", "Gerson","María", "Gerson","María", "Gerson","María",
            "Gerson","María", "Gerson","María", "Gerson","María", "Gerson","María", "Gerson"};
        for (int i = 0; i < 20; i++) {
            System.out.println(nombre[i]);
         
        }
        
    }
    
    
}
