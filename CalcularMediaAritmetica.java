import java.util.Scanner;

public class CalcularMediaAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        float soma = 0;

        while (contador < 10) {
            
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            soma += numero; //soma = soma + numero;
            contador++;
        }

        float media = soma / 10;
        
        System.out.println("A média é " + media);
        
        scan.close();
    }
}
