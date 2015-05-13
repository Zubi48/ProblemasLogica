/**
 * @see
 *24.-Comprobar si un numero mayor o igual que la unidad es primo. 
 */
package Problema24;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        
        if (numero%2!=0) {
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }
    }
    
}
