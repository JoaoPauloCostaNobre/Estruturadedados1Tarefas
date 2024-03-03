import java.util.Scanner;

public class Exercicio351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor de nomes
        final int Nomes = 5;

        // Vetor para armazenar os nomes
        String[] nomes = new String[Nomes];

        // Ler os nomes
        for (int i = 0; i <Nomes; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        // Solicitar o número correspondente a uma pessoa
        System.out.println("Digite o número correspondente à pessoa que deseja encontrar:");
        int numero = scanner.nextInt();

        // Verificar o número e imprimir o nome correspondente
        switch (numero) {
            case 1:
                System.out.println("O nome correspondente à pessoa 1 é: " + nomes[0]);
                break;
            case 2:
                System.out.println("O nome correspondente à pessoa 2 é: " + nomes[1]);
                break;
            case 3:
                System.out.println("O nome correspondente à pessoa 3 é: " + nomes[2]);
                break;
            case 4:
                System.out.println("O nome correspondente à pessoa 4 é: " + nomes[3]);
                break;
            case 5:
                System.out.println("O nome correspondente à pessoa 5 é: " + nomes[4]);
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um número entre 1 e " + Nomes + ".");
        }
    }
}
