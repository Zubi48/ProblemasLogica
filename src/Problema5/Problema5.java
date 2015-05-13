/**
 *@see5.-Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y
 * que imprima cuantos impares hay. 
 */
package Problema5;

/**
 *
 * @author Carlos
 */
public class Problema5 {
    public static void main(String[] args) {
        int cantidad = 0;
        for (int i = 0; i <= 100; i++) {
            if (!(i%2 == 0)) {
                System.out.println(i);
                cantidad += 1;
                
            }      
        }
        System.out.println("Existen "+cantidad+" Numeros impares");
    }
    
}
