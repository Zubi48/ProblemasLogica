/*
 *15.-Introducir dos numeros por teclado. Imprimir los numeros naturales que
 *hay entre ambos numeros empezando por el mas pequeño, contar cuantos hay y 
 *cuantos de ellos son pares. Calcular la suma de los impares. 
 */
package Problema15;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = 0,mayor = 0,contador=0,pares=0,suma=0;
        System.out.println("Introducir limite inferior");
        menor = sc.nextInt();
        System.out.println("Introducir limite superior");
        mayor = sc.nextInt();
        
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
            contador++;
            if (i%2==0) {
                pares++;        
            }
            if(!(i%2==0)){
                suma+=i;
            }
            
        }
        System.out.println("Existen "+contador+ " numeros");
        System.out.println("Existen "+pares+ " numeros pares");
        System.out.println("La suma de los impares es "+contador);
    }
    
    
}
