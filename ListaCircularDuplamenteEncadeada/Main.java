import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random rand = new Random();
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // Gera números aleatórios e armazena no vetor
        System.out.println("Números gerados:");
        for (int i = 0; i < 1000; i++) {
            vetor[i] = rand.nextInt(19999) - 9999;
            System.out.print(vetor[i] + " ");
            lista.inserirOrdenado(vetor[i]);
        }

        System.out.println("\n\nLista em ordem crescente:");
        lista.imprimirCrescente();

        System.out.println("\nLista em ordem decrescente:");
        lista.imprimirDecrescente();

        // Remove os números primos e imprime a lista novamente
        lista.removerPrimos();

        System.out.println("\nLista após remoção dos primos em ordem crescente:");
        lista.imprimirCrescente();

        System.out.println("\nLista após remoção dos primos em ordem decrescente:");
        lista.imprimirDecrescente();
    }
}