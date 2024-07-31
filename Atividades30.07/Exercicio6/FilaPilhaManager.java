package Exercicio6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;



class FilaPilhaManager {
    private Queue<Integer> fila;
    private Stack<Integer> pilha;
    private Random random;

    public FilaPilhaManager() {
        fila = new LinkedList<>();
        pilha = new Stack<>();
        random = new Random();
    }

    public void sortearNumeros() {
        // Sortear 1000 números positivos e 1000 números negativos
        for (int i = 0; i < 1000; i++) {
            fila.add(random.nextInt(1000) + 1);  // números positivos entre 1 e 1000
            fila.add(-random.nextInt(1000) - 1); // números negativos entre -1 e -1000
        }
    }

    public void processarFila() {
        while (!fila.isEmpty()) {
            int numero = fila.poll();
            if (numero > 0) {
                // Se o número for positivo, empilhá-lo na pilha
                pilha.push(numero);
            } else {
                // Se o número for negativo, imprimir e retirar o número do topo da pilha
                if (!pilha.isEmpty()) {
                    int topo = pilha.pop();
                    System.out.println("Número no topo da pilha: " + topo);
                } else {
                    System.out.println("A pilha está vazia, nada para imprimir");
                }
            }
        }
    }

    public void imprimirFila() {
        System.out.println("Conteúdo da Fila F: " + fila);
    }

    public void imprimirPilha() {
        System.out.println("Conteúdo da Pilha P: " + pilha);
    }
}

