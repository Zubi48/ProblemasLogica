/*
 *34.-Hacer un programa que lea las calificaciones de un alumno en 
10 asignaturas, las almacene en un vector y calcule e imprima su media. 
 */
package Problema34;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int[ ]calificaciones = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la calificacion "+(i+1));
            calificaciones [i]=sc.nextInt();
        }
        
        for (int i = 0; i < 20; i++) {
            suma += calificaciones [i];
            
        }
        System.out.println("La media es = "+suma/20);
    }
    
}
