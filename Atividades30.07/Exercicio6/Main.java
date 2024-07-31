package Exercicio6;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue fila = new Queue();
        Stack pilha = new Stack();
        Random rand = new Random();

        // Sorteando 1000 números positivos e 1000 números negativos
        for (int i = 0; i < 1000; i++) {
            fila.enqueue(rand.nextInt(1000) + 1);  // Números positivos
            fila.enqueue(-(rand.nextInt(1000) + 1));  // Números negativos
        }

        // Processando a fila
        while (!fila.isEmpty()) {
            int numero = fila.dequeue();
            if (numero > 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                } else {
                    System.out.println("Pilha está vazia.");
                }
            }
        }
    }
}
