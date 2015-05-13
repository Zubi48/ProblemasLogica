/**
 *@see 8.-Hacer un pseudocodigo que solo nos permita introducir S o N. 
 */
package Problema8;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
            if ("n".equals(n) || "s".equals(n) || "N".equals(n) || "S".equals(n)) {
                System.out.println("Correcto");            
        }
            else{
                System.out.println("Incorrecto ingrese solo S o N");
            }
                
    }
    
}
