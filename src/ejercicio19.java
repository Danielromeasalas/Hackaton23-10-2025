// Dado un array de 15 números aleatorios entre 1 y 5, muestra la racha más larga de valores consecutivos iguales.

import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        // Random
        Random aleatorio = new Random();

        // Array
        int numeros[] = new int[15];

        // Rellenar array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(5) + 1;
        }

        // Array y variables
        int numRepetido = numeros[0];
        int contadorRepetidos = 1;
        int numRepetidoMaximo = numeros[0];
        int contadorRepetidoMaximo = 0;

        // Mostrar array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Contar números repetidos consecutivos
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] == numeros[i - 1]){
                contadorRepetidos++;
            } else{
                if(contadorRepetidos > contadorRepetidoMaximo){
                    contadorRepetidoMaximo = contadorRepetidos;
                    numRepetidoMaximo = numRepetido;
                }
                numRepetido = numeros[i];
                contadorRepetidos = 1;
            }
        }

        // Comprobar la ultima racha
        if (contadorRepetidos > contadorRepetidoMaximo) {
            contadorRepetidoMaximo = contadorRepetidos;
            numRepetidoMaximo = numRepetido;
        }

        // Resultado
        System.out.println(String.format("La racha de numeros más larga es el %d, con %d apariciones consecutivas", numRepetidoMaximo, contadorRepetidoMaximo));

    }
}
