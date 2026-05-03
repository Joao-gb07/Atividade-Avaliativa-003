import java.util.Scanner;

public class ImprimirESomarNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int total = 0;

        while (contador < 10) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            total = total + numero;
            contador++;
        }
        System.out.println("A soma total é: " + total);

        scan.close();
    }
}


//Escreva um algoritmo para ler 10 números e 
// ao final da leitura escrever a soma total dos 10 números lidos. 