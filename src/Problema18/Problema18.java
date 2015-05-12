/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    

