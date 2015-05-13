/*
 *37.-Generar una matriz de 4 filas y 5 columnas con numeros aleatorios 
entre 1 y 100, y hacer su matriz transpuesta. 
 */
package Problema37;

/**
 *
 * @author Carlos
 */
public class Problema37 {
    public static void main( String args[ ]){
        int [ ][ ]A = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = (int) Math.floor(Math.random()*101+1);        
            }
        }

        System.out.println("La matriz dada es: ");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz transpuesta es: ");
        for(int j = 0; j < A[0].length; j++){
            for(int i = 0; i < A.length; i++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

