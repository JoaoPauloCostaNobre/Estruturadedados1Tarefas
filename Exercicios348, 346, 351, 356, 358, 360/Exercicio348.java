import java.util.Scanner;

public class Exercicio348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do array de alunos
        final int Alunos = 5;
        final int NOTAS = 2;

        // Matrizes para armazenar os nomes e as notas dos alunos
        String[] nomes = new String[Alunos];
        double[][] notas = new double[Alunos][NOTAS]; // Duas notas para cada aluno
        double[] medias = new double[Alunos];

        // Ler os nomes e as notas dos alunos
        for (int i = 0; i < Alunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            // Ler as notas do aluno
            for (int j = 0; j < NOTAS; j++) {
                double nota;
                do {
                    System.out.println("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ":");
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10); // Repete até que uma nota válida seja inserida
                notas[i][j] = nota;
            }

            // Calcular a média do aluno
            medias[i] = (notas[i][0] + notas[i][1]) / NOTAS;

            // Limpar o buffer do scanner
            scanner.nextLine();
        }

        // Imprimir a listagem de alunos com suas notas e médias
        System.out.println("\nListagem de Alunos:");
        for (int i = 0; i < Alunos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Nota 1: " + notas[i][0]);
            System.out.println("Nota 2: " + notas[i][1]);
            System.out.println("Média: " + medias[i]);
            System.out.println();
        }
    }
}
