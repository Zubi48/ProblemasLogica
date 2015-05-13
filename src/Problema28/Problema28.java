/**
 * @see
 *28.-Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz. 
 */
package Problema28;



/**
 *
 * @author Carlos
 */
public class Problema28 {
    public static void main(String[] args) {
        int moneda = (int) Math.floor(Math.random()*2);
        System.out.println("Moneda lanzada clinkc!!");
        if (moneda == 1) {
            System.out.println("cara");
        }
        else{
            System.out.println("Sello");
        }
    }
    
}
