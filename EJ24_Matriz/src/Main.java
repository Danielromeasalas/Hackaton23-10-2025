import java.util.Random;
public class Main {
    public static void main(String[] args) {
        char[][] Tablero = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Tablero[i][j]= '*';  //Llenando el tablero de *
            }
        }
        Random random = new Random();
        int cont_X=0; //Contador de enemigos
        while (cont_X<5){
            int H_i = random.nextInt(6); // Colocamos al enemigo en una fila
            int H_j = random.nextInt(6); //Colocamos al enemigo en una columna
            if (Tablero[H_i][H_j] == '*') { //Comprobar que no hay un enemigo ya
                Tablero[H_i][H_j] = 'X';
                cont_X++;
            }

        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Tablero[i][j]+ " ");
            }
            System.out.println();
        }








    }
}