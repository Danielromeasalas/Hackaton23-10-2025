package Matrices;
import java.util.Random;

// En una matriz 5x5 con el jugador marcado como "X", muestra solo las casillas adyacentes (su campo de visión).
public class ejercicio25 {
    static String[][] board = new String[5][5];
    static String vacio = ".";
    static String player = "X";
    static int playerX;
    static int playerY;
    public static void generateBoard(String[][] board){
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                board[i][j] = vacio;
            }
        }
    }
    public static void placePlayer (String[][] board, String player){
        Random rand = new Random();
        playerX = rand.nextInt(5);
        playerY = rand.nextInt(5);
    }
    public static void showBoard(String[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                board[playerX][playerY] = player;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void expandPlayer (String[][] board, String player){
        int i = playerX;
        int j = playerY;

        // Arriba
        if (i > 0 && board[i - 1][j] == vacio) {
            board[i - 1][j] = player;
        }

        // Abajo
        if (i < board.length - 1 && board[i + 1][j] == vacio) {
            board[i + 1][j] = player;
        }

        // Izquierda
        if (j > 0 && board[i][j - 1] == vacio) {
            board[i][j - 1] = player;
        }

        // Derecha
        if (j < board[i].length - 1 && board[i][j + 1] == vacio) {
            board[i][j + 1] = player;
        }
    }
    public static void main(String[] args) {
        generateBoard(board);
        placePlayer(board, player);
        showBoard(board);
        expandPlayer(board, player);
        showBoard(board);
    }
}
