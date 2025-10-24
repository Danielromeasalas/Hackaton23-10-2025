package Matrices;
// Crea una matriz 4x4 con valores consecutivos del 1 al 16 y genera su reflejo horizontal.
public class ejercicio29 {
    static int[][] Matriz = new int[4][4];
    static int valor = 1;
    public static void generateBoard(int [][] Matriz){
        for(int i = 0 ; i < Matriz.length; i++){
            for (int j = 0; j < Matriz.length; j++){
                Matriz[i][j] = valor;
                valor++;
            }
        }
    }
    public static void showBoard(int [][] Matriz){
        for(int i = 0 ; i < Matriz.length; i++){
            for (int j = 0; j < Matriz.length; j++){
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void reverseBoard(int [][] Matriz){
        for(int i = Matriz.length - 1; i >= 0; i--){
            for (int j = Matriz.length - 1; j >= 0; j--){
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generateBoard(Matriz);
        showBoard(Matriz);
        reverseBoard(Matriz);
    }
}
