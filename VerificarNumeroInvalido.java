import java.util.Scanner;

public class VerificarNumeroInvalido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valorInteiroN = scan.nextInt();

        while (valorInteiroN <= 0) { 
            System.out.println("Valor inválido! Digite um número maior que 0: ");
            valorInteiroN = scan.nextInt();
        }

        int contador = 1;

        while (contador <= valorInteiroN) {
            System.out.println(contador);
            contador++;
        }
        scan.close();
    }
}

        
        
