/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        }
        else{
            System.out.println("El numero ingresado es positivo");
        }
        
    }
    
}
