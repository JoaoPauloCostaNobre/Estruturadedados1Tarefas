import java.util.Scanner;

public class Exercicio356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int Alunos_numero = 15;

        for (int i = 0; i < Alunos_numero; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a nota da PR1 do aluno " + nome + ":");
            double notaPR1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a nota da PR2 do aluno " + nome + ":");
            double notaPR2 = Double.parseDouble(scanner.nextLine());

            double media = (notaPR1 + notaPR2) / 2;
            String situacao = (media >= 6) ? "AP" : "RP";

            System.out.println("\nNome: " + nome);
            System.out.println("PR1: " + notaPR1);
            System.out.println("PR2: " + notaPR2);
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
            System.out.println("---------------------------------------");
        }
    }
}
