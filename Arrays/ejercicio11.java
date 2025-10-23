// Crea un array que contenga los 15 primeros números de la serie de
//Fibonacci y muéstralos en pantalla.
package Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        int numTot = 15;
        int num1 = 0, num2 = 1;
        System.out.println("Serie de Fibonacci, este es el primer término");

        for (int i = 1; i <= numTot; i++) {
            System.out.println(num2);
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
