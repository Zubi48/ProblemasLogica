/**
 * @see 6.-Hacer un pseudocodigo que imprima todos los numeros naturales que hay
 * desde la unidad hasta un numero que introducimos por teclado.
 */
package Problema6;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        
        int limite = sc.nextInt();
        
            for (int i = 1; i <= limite; i++) {
                System.out.println(i);       
        }  
    }   
}
