import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //DEFINIR MATRIZ Y VARIABLES

        int[][] matriz = new int [6][6];
        Random aleatorio = new Random();

        //RELLENAR MATRIZ

        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < 6; columnas++) {
                matriz[filas][columnas] = aleatorio.nextInt(9)+1;
            }
        }

        //IMPRIMIR TRIÁNCULO SUPERIOR DERECHO

        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < 6; columnas++) {

                //PONER CEROS (LUEGO SUSTITUIDOS POR HUECOS)

                for (int hueco = 0; hueco < filas; hueco++) {
                    for (int restaHueco = 0; restaHueco < hueco+1; restaHueco++) {
                        matriz[filas][hueco-restaHueco] = 0;
                    }
                }
            }
        }

        //IMPRIMIR MATRIZ

        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < 6; columnas++) {
                if (matriz[filas][columnas]==0){
                    System.out.print (" "+" ");
                }else{
                    System.out.print(matriz[filas][columnas] + " ");
                }
            }
            System.out.println(" ");
        }

    }
}