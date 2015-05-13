/*
 *27.-Realizar la tabla de multiplicar de un numero entre 0 y 10.
 */
package Problema27;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Igrese un numero");
        int numero = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+"*"+i+" = "+i*numero);
            
        }
        
        
    }
    
}
