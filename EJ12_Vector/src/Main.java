import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[6];
        Random random = new Random();
        for(int i=0;i<6;i++){
            numeros[i]= random.nextInt(10)+1; // Genera valores del 1 al 10 para el array
            System.out.print(numeros[i]+" ");
        }
        // Ahora multiplicarlos entre ellos
        int Multiplicación=1; // si lo hacemos 0, la multiplicacion entera sera 0
        for(int i=0;i<6;i++){
            Multiplicación= numeros[i]*Multiplicación;
        }
        System.out.println("El producto de todos los números del array es igual a " + Multiplicación);
    }
}