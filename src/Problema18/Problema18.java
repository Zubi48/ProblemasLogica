/**
 *@see 18.-Hacer un pseudocodigo que cuente las veces que aparece una 
 * determinada letra en una frase que introduciremos por teclado. 
 */
package Problema18;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema18 {
    public static void main(String[] args) {
        int contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veces que aparece la letra \"A\" ");
        System.out.println("Introduzca texto a comparar");
        String cadena =sc.next();

		char[] arrayChar = cadena.toCharArray();
 
		for(int i=0; i<arrayChar.length; i++){
 
			if( arrayChar[i] == 'a' )
                            contador++;
		
		}
                System.out.println("La letra aparece "+contador+" veces");
	}
    }
    

