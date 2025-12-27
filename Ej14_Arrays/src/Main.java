
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("!Bienvenido al juego del ahorcado!");
        Scanner sc = new Scanner(System.in);
        char[] palabra = {'J','A','V','A'};
        char[] progreso = {'_','_','_','_'};
        int intentos = 6; //cantidad de intentos

        while (intentos > 0) {
            //mostrar progreso actual
            System.out.print("Palabra: ");
            for(char c: progreso){
                System.out.print(c + "");
            }
            System.out.println();

            //pedir letra
            System.out.println("Escriba una letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            boolean acierto = false; //settear boooleano a false

            //comprobar si la letra está en la palabra
            for(int i = 0; i < palabra.length; i++){
                if(palabra[i] == letra){
                    progreso[i] = letra;
                    acierto = true;
                }
            }
            if(!acierto){
                --intentos;
                System.out.println("La letra no se encuentra en la palabra. Te quedan " + intentos + " intentos.");
            }
            //comprobar si se ha ganado ya
            if(String.valueOf(progreso).equals(String.valueOf(palabra))){
                System.out.println("Has ganado! La palabra era: " + new String(palabra));
                break;
            }
            //si te quedas sin intentos
            if(intentos == 0){
                System.out.println("Has perdido. La palabra era: " + new String(palabra));
            }
        }





    }
}