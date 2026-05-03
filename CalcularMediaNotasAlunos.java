import java.util.Scanner;

public class CalcularMediaNotasAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        float somaNotas = 0;
        float mediaNotas = 0;

        System.out.println("Digite a quantidade de alunos da turma: ");
        int alunosTurma = scan.nextInt();

        while (contador < alunosTurma) {
            System.out.println("Digite as notas: ");
            float notas = scan.nextFloat();
            somaNotas += notas;
            
            contador++;
        }
        mediaNotas = somaNotas / alunosTurma;
       
        System.out.println("A média é: " + mediaNotas);

        scan.close();
    }
}

// Ler o número de alunos existentes em uma turma e, após isto,
// ler as notas destes alunos,
// calcular e escrever a média aritmética dessas notas lidas.