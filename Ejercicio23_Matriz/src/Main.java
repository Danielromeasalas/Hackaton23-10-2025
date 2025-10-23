import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char matriz[][] = new char[5][5];
        int jugadorX = 5/2; //fila central
        int jugadorY = 5/2; // columna central
        Scanner sc = new Scanner(System.in); //Crear objeto de escaner
        char opcion;
        String movimiento = sc.nextLine(); //Leer movimiento

        //Bucle de juego
        do{
            //Limpiar matriz y colocar al jugador
            for(int i = 0;i < 5; i++){
                for(int j = 0; j< 5; j++){
                    matriz[i][j] = '-';
                }
            }
            matriz[jugadorX][jugadorY] = 'J';

            //Mostrar la matriz
            for(int i = 0;i < 5; i++){
                for(int j = 0; j< 5; j++){
                    System.out.print(matriz[i][j]+ " ");
                }
                System.out.println();
            }

            //pedir movimiento
            System.out.println("\nMover (W=arriba, A=izda, S=abajo, D=decha, Q=SALIR DEL JUEGO");
            opcion = sc.next().toLowerCase().charAt(0);

            //Cambiar la posicion
            switch(opcion){
                case 'w':
                    if(jugadorX > 0) jugadorX--;
                    break;
                case 's':
                    if(jugadorX < 4) jugadorX++;
                    break;
                case 'a':
                    if(jugadorY > 0) jugadorY--;
                    break;
                case 'd':
                    if(jugadorY < 4) jugadorY++;
                    break;
                case 'q':
                    System.out.println("Saliendo del juego!");
                    break;
                default:
                    System.out.println("Tecla no válida, presiona w a s d q.");

            }

            System.out.println();

        }while(opcion!='q');
        sc.close();
    }
}