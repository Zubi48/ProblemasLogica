/*
 *31.-Introducir dos numeros por teclado y mediante un menu, calcule su suma, 
 *su resta, su multiplicacion o su division
 */
package Problema31;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema31 {
    public static void main(String[] args) {
        System.out.println("Presiona la opcion que quieras");
        System.out.println("1.SUMA\n 2.RESTA\n 3.MULTIPLICACION\n 4.DIVISION");
        Scanner sc = new Scanner(System.in);
        int seleccion =sc.nextInt();
        
        if (seleccion ==1) {
            System.out.println("Ingrese el primero numero");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2= sc.nextInt();
            System.out.println("resultado = "+ numero1+numero2);           
            
        }
        if (seleccion == 2 ) {
            System.out.println("Ingrese el primero numero");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2= sc.nextInt();
            System.out.println(numero1-numero2); 
            
        }
        if (seleccion ==3) {
            System.out.println("Ingrese el primero numero");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2= sc.nextInt();
            System.out.println("resultado = "+numero1*numero2); 
            
        }
        if (seleccion == 4) {
            System.out.println("Ingrese el primero numero");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2= sc.nextInt();
            System.out.println("resultado = "+numero1/numero2); 
            
        }
        
        
        
        
    }
    
}
