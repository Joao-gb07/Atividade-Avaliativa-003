import java.util.Scanner;

public class VerificarNumeroInteiroPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        int numero = 0;

        do {
            System.out.println("Entre com um número inteiro positivo");
            numero = scan.nextInt();
            
        } while (numero <= 0);
        contador++;  
    }
}








        
        
