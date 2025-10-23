// Crea dos arrays con 6 tiradas de dado (1-6). Compara cada posición y muestra quién gana más rondas.

import java.util.Random;

public class ejercicio18 {
    public static void main(String args[]) {
        // Inicializar random
        Random aleatorio = new Random();

        // Inicializar los 2 arrays
        int[] dado1 = new int[6];
        int[] dado2 = new int[6];
        int resultado1 = 0;
        int resultado2 = 0;

        // Rellenarlos de aleatorios
        for (int i = 0; i < dado1.length; i++) {
            dado1[i] = aleatorio.nextInt(6) + 1;
            dado2[i] = aleatorio.nextInt(6) + 1;
        }

        // Comparar resultados por rondas
        for (int i = 0; i < dado1.length; i++) {
            if (dado1[i] == dado2[i]){
                System.out.println("Empate en la ronda " + (i + 1));
            } else if (dado1[i] > dado2[i]){
                System.out.println("Ha gando en jugador 1 en la ronda " + (i + 1));
                resultado1++;
            } else {
                System.out.println("Ha gando en jugador 2 en la ronda " + (i + 1));
                resultado2++;
            }
        }

        // Anunciar ganador
        if (resultado1 == resultado2){
            System.out.println("Ha habido un empate.");
        } else if (resultado1 > resultado2){
            System.out.println("Ha ganado el jugador 1!!!");
        } else  {
            System.out.println("Ha ganado el jugador 2!!!");
        }
    }
}
