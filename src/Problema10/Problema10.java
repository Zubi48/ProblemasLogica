/**
 *@see 10.-Introducir un numero por teclado. Que nos diga si es par o impar. 
 */
package Problema10;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        if (numero%2==0) {
            System.out.println("Numero par");
            
        }
        else
        {
            System.out.println("numero impar");
        }
    }
}
