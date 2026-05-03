import java.util.Scanner;

public class ImprimirValoresNegativosPositivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int numerosNegativos = 0;

        while (contador < 10) {
            System.out.println("Escreva um valor Positivo ou Negativo");
            int numero = scan.nextInt();
            contador ++;

            if (numero < 0) {
                numerosNegativos ++;
            }
        }
        System.out.println("Quantidade de números negativos é: " + numerosNegativos);
        
        scan.close();
    }
}
