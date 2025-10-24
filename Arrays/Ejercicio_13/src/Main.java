import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //DEFINIR ARRAY Y VARIABLES

        System.out.println("Introduce una palabra en mayúsculas: ");
        Scanner sc = new Scanner(System.in);
        char[] palabra = sc.nextLine().toCharArray();
        int contadorVocales = 0;

        //COMPROBAR VOCALES

        for (int contadorLetras = 0; contadorLetras < palabra.length ; contadorLetras++) {
            if ((palabra[contadorLetras])==('A')||(palabra[contadorLetras])==('a')) { //COMPROBAR A
                contadorVocales++;
            }
            if ((palabra[contadorLetras])==('E')||(palabra[contadorLetras])==('e')) { //COMPROBAR E
                contadorVocales++;
            }
            if ((palabra[contadorLetras])==('I')||(palabra[contadorLetras])==('i')) { //COMPROBAR I
                contadorVocales++;
            }
            if ((palabra[contadorLetras])==('O')||(palabra[contadorLetras])==('o')) { //COMPROBAR O
                contadorVocales++;
            }
            if ((palabra[contadorLetras])==('U')||(palabra[contadorLetras])==('u')) { //COMPROBAR U
                contadorVocales++;
            }
        }

        //IMPRIMIR RESULTADO


        System.out.println("La palabra tiene "+contadorVocales+" vocales");

    }



}