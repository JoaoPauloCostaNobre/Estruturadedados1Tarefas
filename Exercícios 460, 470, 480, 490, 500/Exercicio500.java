import java.util.Scanner;

public class Exercicio500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean dadosVetorA = false;
        boolean dadosVetorB = false;

        while (true) {
            System.out.println("VETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPÇÃO: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    dadosVetorA = true;
                    preencherVetor(vetorA, scanner);
                    break;
                case 2:
                    dadosVetorB = true;
                    preencherVetor(vetorB, scanner);
                    break;
                case 3:
                    if (!dadosVetorA || !dadosVetorB) {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    } else {
                        imprimirVetores(vetorA, vetorB);
                    }
                    break;
                case 4:
                    if (!dadosVetorA || !dadosVetorB) {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    } else {
                        somarVetores(vetorA, vetorB);
                    }
                    break;
                case 5:
                    if (!dadosVetorA || !dadosVetorB) {
                        System.out.println("Escolha primeiro opções 1 e 2");
                    } else {
                        subtrairVetores(vetorA, vetorB);
                    }
                    break;
                case 6:
                    System.out.println("Saindo do Algoritmo");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void preencherVetor(int[] vetor, Scanner scanner) {
        System.out.println("Entrada do VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprimirVetores(int[] vetorA, int[] vetorB) {
        System.out.println("VETOR A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("VETOR B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

    public static void somarVetores(int[] vetorA, int[] vetorB) {
        System.out.println("SOMA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + vetorB[i]);
        }
    }

    public static void subtrairVetores(int[] vetorA, int[] vetorB) {
        System.out.println("DIFERENÇA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] - vetorB[i]);
        }
    }
}
