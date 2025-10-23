// Crea una matriz 5x5 de ceros y unos generados aleatoriamente. Luego invierte sus
//valores para crear el mapa de "zonas seguras".

import java.util.Random;

public class ejercicio30 {
    public static void main(String[] args) {
        // Random
        Random aleatorio = new Random();

        //Matriz y variables
        int tablero[][] = new int[5][5];

        // Generar y rellenar matriz
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = aleatorio.nextInt(2);
            }
        }

        System.out.println("Tablero:");
        // Mostrar primera matriz
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        // Interambiar valores
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == 0) {
                    tablero[i][j] = 1;
                } else {
                    tablero[i][j] = 0;
                }
            }
        }

        System.out.println("Tablero zona segura:");
        // Imprimir el nuevo tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
