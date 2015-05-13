/**
 * @see
 *30.-Simular una carrera de dos caballos si cada uno tiene igual probabilidad de ganar. 
 */
package Problema30;

/**
 *
 * @author Carlos
 */
public class Problema30 {
    public static void main(String[] args) {
        int caballo = (int) Math.floor(Math.random()*2);
        System.out.println("Empieza la carrera");
        if (caballo == 1) {
            System.out.println("Gano caballo 1");
        }
        else{
            System.out.println("Gano caballo 2");
        }
        
    }
    
}
