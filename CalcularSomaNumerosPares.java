import java.util.Scanner;

public class CalcularSomaNumerosPares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro positivo ");
        int numero = scan.nextInt();

        int contador = 1;
        int soma = 0;

        while (contador <= numero ) { //inicio do while

            if (contador % 2 == 0) {
                soma = soma + contador; // Forma curta: soma += contador;

            }
            contador++; // contador = contador + 1;
        }
        System.out.println("A soma dos numeros pares é: " + soma);
    }
    
}