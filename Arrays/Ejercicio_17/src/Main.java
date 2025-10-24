import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //DEFINIR VARIABLES Y ARRAY

        char[] abecedarioMayus = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] abecedarioMinus = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Introduce una palabra: ");
        Scanner sc = new Scanner(System.in);
        char[] palabra = sc.nextLine().toCharArray();
        int[] posiciones = new int[palabra.length];

        //DEFINIR POSICIONES

        for (int letra = 0; letra < palabra.length; letra++) {
            for (int contadorMayus = 0; contadorMayus < abecedarioMayus.length; contadorMayus++) { //COMPROBAR MAYÚSCULAS
                if (palabra[letra] == abecedarioMayus[contadorMayus]) {
                    posiciones[letra] = contadorMayus + 1;
                }
            }
        }

            for (int letra = 0; letra < palabra.length; letra++) {
                for (int contadorMinus = 0; contadorMinus < abecedarioMinus.length; contadorMinus++) { //COMPROBAR MINÚSCULAS
                    if (palabra[letra] == abecedarioMinus[contadorMinus]) {
                        posiciones[letra] = contadorMinus+1;
                    }

                }
            }


        //IMPRIMIR RESULTADO

        System.out.print("Las posiciones de las letras son: ");
        for (int escrituraArray = 0; escrituraArray < palabra.length; escrituraArray++) {
            System.out.print(posiciones[escrituraArray] + "º ");
        }
        System.out.print (" respectivamente");
    }
}