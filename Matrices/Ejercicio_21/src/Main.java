public class Main {
    public static void main(String[] args) {

        //DEFINIR MATRIZ

        int[][] matriz = new int [5][5];

        //RELLENAR MATRIZ

        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                matriz[filas][columnas]=0;
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println(" ");
        }

    }
}