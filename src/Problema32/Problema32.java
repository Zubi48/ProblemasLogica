/**
 * @see
 * 32.-Hacer un programa que nos permita introducir un numero por teclado 
 *y sobre el se realicen las siguientes operaciones: comprobar si es primo, 
 *hallar su factorial o imprimir su tabla de multiplicar. 
 */
package Problema32;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        System.out.println("1.COMPROBAR SI ES PRIMO\n2.ENCONTRAR SU FACTORIAL\n"
                + "3.IMPRIMIR TABLA\n");
        System.out.println("Seleccione lo que desea");
        int opcion =sc.nextInt();
        if (opcion ==1) {
            if (numero%1==0) {
                System.out.println("El numero es primo");
                
            }
        }
        if (opcion==2) {
            for (int counter = 0; counter <= numero; counter++){
            System.out.printf("%d! = %d\n", counter,
            factorial(counter));
        }
            
        }
        if (opcion==3) {
            for (int i = 0; i < 10; i++) {
                System.out.println(numero+"*"+i+"="+numero*i);
                
            }
            
        }
                
    }
     public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
    
}
