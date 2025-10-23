// Crea una matriz 5x5 que represente un laberinto. Coloca al jugador en una posición marcada con la letra X y muéstrala en pantalla.

import java.util.Random;

public class ejercicio22 {
    public static void main(String[] args) {
        // Random
        Random rand = new Random();

        // Matriz y variables
        char tablero[][] = new char[5][5];
        char vacio = '.';
        char jugador = 'X';
        int posicionXjugador;
        int posicionYJugador;

        //Rellenar matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = vacio;
            }
        }

        // Colocar jugador
        posicionXjugador = rand.nextInt(tablero.length);
        posicionYJugador = rand.nextInt(tablero.length);
        tablero[posicionXjugador][posicionYJugador] = jugador;

        // Mostrar por pantalla
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println();
        }
    }
}