/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema19;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora donde comenzara el reloj");
        int hora = sc.nextInt();
        
        for (int i = hora; i <= 24; i++) {
            for (int j = 1; j <= 60; j++) {
                for (int k = 1; k <= 60; k++) {
                    System.out.println(i+":"+j+":"+k);
                }
                
            }
            
        }
    }
    
}
