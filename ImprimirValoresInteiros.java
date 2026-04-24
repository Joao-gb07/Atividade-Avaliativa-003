import java.util.Scanner;

public class ImprimirValoresInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valorInteiroN = scan.nextInt();

        int contador = 1;
        
        while (contador <= valorInteiroN) {
            System.out.println(contador);
            contador++;
        }
    }
}
