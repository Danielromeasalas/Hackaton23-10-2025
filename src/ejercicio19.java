// Dado un array de 15 números aleatorios entre 1 y 5, muestra la racha más larga de valores consecutivos iguales.

import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        // Random
        Random aleatorio = new Random();

        // Array y variables
        int numeros[] = new int[15];
        int numRepetido1 = 0;
        int contadorRepetidos1 = 1;
        int numRepetidoAnterior = 0;
        int contadorRepetidoAnterior = 0;

        // Rellenar array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(5) + 1;
        }
        // Mostrar array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Contar números repetidos consecutivos
        for (int i = 0; i < numeros.length; i++) {
            if(i + 1 < numeros.length && numeros[i] == numeros[i + 1]){
                numRepetido1 = numeros[i];
                contadorRepetidos1++;
            } else if (i - 1 >= 0 && numeros[i] == numeros[i - 1]) {
                numRepetidoAnterior = numRepetido1;
                contadorRepetidoAnterior = contadorRepetidos1;
                contadorRepetidos1 = 1;
            }
        }

        if (contadorRepetidos1 > contadorRepetidoAnterior) {
            System.out.println(String.format("La racha de numeros más larga es el %d, con %d apariciones consecutivas", numRepetido1, contadorRepetidos1));
        } else if (contadorRepetidos1 < contadorRepetidoAnterior) {
            System.out.println(String.format("La racha de numeros más larga es el %d, con %d apariciones consecutivas", numRepetidoAnterior, contadorRepetidoAnterior));
        }
    }
}
