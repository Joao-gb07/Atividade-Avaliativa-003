import java.util.Scanner;

public class SomarNumerosMenoresX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int soma = 0;
        
        while (contador < 10) {
            
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            
            contador++;

            if (numero < 40) {
                soma = soma + numero;
            }

        }
        System.out.println("A soma dos numeros digitados que são menores que 40 é: " + soma);

        scan.close();
    }
}

//Escreva um algoritmo para ler 10 números. 
// Todos os números lidos com valor inferior a 40 devem ser somados. 
//Escreva o valor final da soma efetuada. 