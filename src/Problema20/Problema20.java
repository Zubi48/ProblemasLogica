/**
 * @see
 *20.-Calcular el factorial de un numero, mediante subprogramas.
 */
package Problema20;

/**
 *
 * @author Carlos
 */
public class Problema20 {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("%d! = %d\n", counter,
            factorial(counter));
        }
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
