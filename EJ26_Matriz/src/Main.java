import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int [][] Matriz = new int[4][4];
        // Creamos e imprimimos matriz
        for (int i=0; i<4;i++){
            for(int j=0; j<4;j++){
                Random random= new Random();
                Matriz[i][j] = random.nextInt(9)+1;
                System.out.print(Matriz[i][j]+ " ");
            }
            System.out.println();
        }
        // Suma de filas
        for (int i=0; i<4;i++){
            int SumaFila = 0; //Para cada fila se reinicia el valor de la suma
            for (int j=0; j<4;j++){
                SumaFila = SumaFila+ Matriz[i][j];
            }
            System.out.println("La suma de la fila "+(i+1) +" es "+SumaFila);
        }
        System.out.println();
        // Suma de columnas
        for (int j=0; j<4;j++){
            int SumaColumna = 0; //Para cada fila se reinicia el valor de la suma
            for (int i=0; i<4;i++){
                SumaColumna = SumaColumna+ Matriz[i][j];
            }
            System.out.println("La suma de la columna "+(j+1) +" es "+SumaColumna);
        }
    }
}