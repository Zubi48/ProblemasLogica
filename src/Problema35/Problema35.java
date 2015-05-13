/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema35;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0,nota=0;
        int[ ]calificaciones = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la calificacion "+(i+1));
            calificaciones [i]=sc.nextInt();
        }
        System.out.println("Ingresa la nota que quiere buscar");
            nota=sc.nextInt();
        for (int i = 0; i < 20; i++) {
            if (calificaciones [i]==nota) {
                System.out.println("La nota si existe, y se encuentra en el"
                        + "lugar "+i+ " de la lista");
            }
            
        }
    }
    
}
