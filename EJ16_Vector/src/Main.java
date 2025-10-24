import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int [] vector = new int[10];
        for(int i=0; i<10;i++){
            Random random= new Random();
            vector[i]= random.nextInt(100);
            System.out.print(vector[i] + " ");
        }
        for(int i = 0; i < vector.length; i++){
            for(int j = i + 1; j < vector.length; j++){
                if(vector[i] == vector[j]){  //Valor repetido
                    System.out.println("El número "+vector[i] + " en las posiciones "+ i+ " y "+j);
                    break;
                }
            }
        }

    }
}