public class Main {
    public static void main(String[] args) {

        //Definir matriz y parametros
        int n = 5;
        int matriz[][] = new int[n][n];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        //Crear matriz de numeros del 0 al 4
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++){
                matriz[i][j] = j;
                //Para sumar la diagonal principal debo comprobar que i y j son iguales, es decir se encuentran en su valor de diagonal y dentro de la condicion sumarlos)
                if(i==j){
                    sumaDiagonalPrincipal += matriz[i][j];
                }else if(i + j == n - 1){
                    sumaDiagonalSecundaria += matriz[i][j];

                }
            }
        }
        //Imprimir la matriz
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();

        }
        //Imprimir resultados
        System.out.println("\nSuma diagonal principal: " +sumaDiagonalPrincipal);
        System.out.println("Suma diagonal secundaria: "+sumaDiagonalSecundaria);



    }
}