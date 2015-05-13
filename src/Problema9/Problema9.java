/**
 * @see 9.-Introducir un numero por teclado. Que nos diga si es 
 * positivo o negativo. 
 */
package Problema9;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        }
        else{
            System.out.println("El numero ingresado es positivo");
        }
        
    }
    
}
