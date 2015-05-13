/**
 * @see
 *22.-Introducir una frase por teclado. Imprimirla cinco veces en filas 
 *consecutivas, pero cada impresion ir  desplazada cuatro columnas 
 *hacia la derecha. 
 */
package Problema22;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir frase");
        String frase = sc.next();
        for (int i = 0; i <= 5; i++) {
            if(i==0)
            System.out.println("    "+frase);
            if (i==1) 
                System.out.println("        "+frase);
            else if (i==2) 
                    System.out.println("            "+frase);
            else  if (i==4) 
                        System.out.println("                "+frase);
            else  if (i==4) 
                            System.out.println("                   "+frase);
                            
                        
        }      
                    
                
            
        
        
    }
    
}
