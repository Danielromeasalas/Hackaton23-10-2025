// Crea un array que contenga los 15 primeros números de la serie de
//Fibonacci y muéstralos en pantalla.
package Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        int[] array = new int[15];
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < array.length; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println("Secuencia de fibonacci -> ");

        for(int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
