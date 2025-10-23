// Crea un array con las puntuaciones de 6 héroes y ordénalas de mayor a menor.
package Arrays;
import java.util.Random;
public class ejercicio20 {
    public static void main(String[] args) {
        int[] arrayInicial = new int[6];
        System.out.println("Las puntuaciones sin ordenar son: ");
        for (int i = 0; i < arrayInicial.length; i++) {
            arrayInicial[i] = new Random().nextInt(5) + 1;
            System.out.print(arrayInicial[i] + " ");
        }
            //Ordenar
            for(int i=0; i < arrayInicial.length-1; i++){
                for(int j=0; j < (arrayInicial.length-1-i); j++){
                    if(arrayInicial[j] > arrayInicial[j+1]){
                        int aux=arrayInicial[j];
                        arrayInicial[j]=arrayInicial[j+1];
                        arrayInicial[j+1]=aux;
                    }
                }
            }
            System.out.print("\nPuntuaciones ordenadas: ");
            for(int i=0;i<arrayInicial.length;i++){
                System.out.print(arrayInicial[i]+" ");
            }

    }
}


