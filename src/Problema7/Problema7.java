/**
 *@see 7.-Introducir tantas frases como queramos y contarlas.
 */
package Problema7;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema7 {
    public static void main(String[] args) {
        int conteo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabras");
        while(sc.hasNextLine()){
            conteo += 1;
        }
        System.out.println(conteo);
            
        
  
        
    }
    
}
