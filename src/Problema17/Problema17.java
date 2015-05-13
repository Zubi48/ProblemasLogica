/**
 *@see 17.-Imprimir, contar y sumar los multiplos de 2 
 * que hay entre una serie de numeros, tal que el segundo 
 * sea mayor o igual que el primero. 
 */
package Problema17;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema17 {
    public static void main(String[] args) {
        int contador=0,suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese limite inferior");
        int inferior = sc.nextInt();
        System.out.println("Ingrese limite superior");
        int superior = sc.nextInt();
            
            for (int i = inferior; i <= superior; i++) {
                if (i%2==0) {                  
                    contador++;
                    suma+=i;          
                }                  
            }
            System.out.println("Hay "+contador+" multiplos de 2\n"
                    + "La suma es= "+suma);
    }
            
}
    
    

