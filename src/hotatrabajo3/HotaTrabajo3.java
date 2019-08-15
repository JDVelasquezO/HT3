/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotatrabajo3;

import java.util.Scanner;

/**
 *
 * @author JD
 */
public class HotaTrabajo3 {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        int numbers[][];
        String numbersColor[][];
        int n;
        
        do {
            System.out.println("Bienvenido");
            System.out.println("Ingresa el numero de la matriz cuadrada: ");
            n = out.nextInt();
        } while ( !(n >=1 && n <= 4) );
        
        int nFilas = n;
        int nCols = n;
        numbers = new int[n][n];
        numbersColor = new String[n][n];
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCols; j++) {
                
                do {
                    System.out.println("Ingresa un valor en la posición " + i + ", " + j);
                    numbers[i][j] = out.nextInt();
                    
                    if ( numbers[i][j] >= 1 && numbers[i][j] <= 25 ) {
                        System.out.println("El numero está entre 1 y 25");
                    } else if ( numbers[i][j] >= 26 && numbers[i][j] <= 50 ) {
                        System.out.println("El numero está entre 26 y 50");
                    } else if ( numbers[i][j] >= 51 && numbers[i][j] <= 75 ) {
                        System.out.println("El numero está entre 51 y 75");
                    } else if ( numbers[i][j] >= 76 && numbers[i][j] <= 100 ) {
                        System.out.println("El numero está entre 76 y 100");
                    } else {
                        System.out.println(numbers[i][j] + " Es un numero invalido ");
                    }
                    
                } while ( numbers[i][j] > 100 || numbers[i][j] < 0 );
            }
        }
        
        System.out.println("Matriz llena");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCols; j++) {
                
                // Matriz llena
                System.out.print( "[" + numbers[i][j] + "]" + " ");
            }
            System.out.println();
        }
        
        System.out.println("------------------------");
        
        System.out.println("Matriz llena con colores");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCols; j++) {
                // Matriz llena con colores
                if ( numbers[i][j] >= 1 && numbers[i][j] <= 25 ) {
                    String n1_25 = ANSI_RED + numbers[i][j] + ANSI_RESET;
                    numbersColor[i][j] = n1_25;
                } else if ( numbers[i][j] >= 26 && numbers[i][j] <= 50 ) {
                    String n26_50 = ANSI_GREEN + numbers[i][j] + ANSI_RESET;
                    numbersColor[i][j] = n26_50;
                } else if ( numbers[i][j] >= 51 && numbers[i][j] <= 75 ) {
                    String n51_75 = ANSI_BLUE + numbers[i][j] + ANSI_RESET;
                    numbersColor[i][j] = n51_75;
                } else if ( numbers[i][j] >= 76 && numbers[i][j] <= 100 ) {
                    String n76_100 = ANSI_YELLOW + numbers[i][j] + ANSI_RESET;
                    numbersColor[i][j] = n76_100;
                }
                
                System.out.print( "[" + numbersColor[i][j] + "]" + " ");
            }
            System.out.println("");
        }
    }
    
}
