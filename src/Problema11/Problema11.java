/**
 *@see 11.-Imprimir y contar los multiplos de 3 desde la unidad hasta un numero 
 * que introducimos por teclado. 
 */
package Problema11;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        int conteo = 0;
        for (int i = 0; i <= numero; i++) {
            if (i%3 == 0 ) {
                System.out.println(i);
                conteo += 1;
                
            }
            
        }
        System.out.println("Existen "+conteo+" numeros primos");
    }
    
}
