import java.util.Scanner;

public class RealizarContagemRegressiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número ");
        int numero = scan.nextInt();
        
        int contador = numero;

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }
    }
}
