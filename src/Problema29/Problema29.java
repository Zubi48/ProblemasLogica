/**
 * @see
 *29.-Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10. 
 */
package Problema29;

/**
 *
 * @author Carlos
 */
public class Problema29 {
    public static void main(String[] args) {
        int suma=0,dado1=0,dado2=0,contador=0;
        for (int i = 0; i < 100; i++) {
            dado1 = (int) Math.floor(Math.random()*7+1);
            dado2 = (int) Math.floor(Math.random()*7+1);
            suma = dado1+dado2;
            if (suma==10){
                contador++;
            }        
        }
        System.out.println("Veces que sumo 10 = "+contador);
    }
    
}
