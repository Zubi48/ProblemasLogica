/*
 *36.-Generar una matriz de 4 filas y 5 columnas con numeros aleatorios 
 *entre 1 y 100, e imprimirla. 
 */
package Problema36;

/**
 *
 * @author Carlos
 */
public class Problema36 {
    public static void main(String[] args) {
         int[][] numeros = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = (int) Math.floor(Math.random()*101+1);        
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5; j++) {
                System.out.println(numeros[i][j]);
                
            }
        }
        
    }
    
}
