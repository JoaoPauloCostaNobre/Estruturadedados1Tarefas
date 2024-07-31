package Exercicio5;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class FilaPilhaManager {
    private Queue<Integer> fila;
    private Stack<Integer> pilha;
    private Set<Integer> elementosFila;
    private Random random;
    
    public FilaPilhaManager() {
        fila = new LinkedList<>();
        pilha = new Stack<>();
        elementosFila = new HashSet<>();
        random = new Random();
    }
    
    public void sortearEAdicionarNumeros(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int numero = random.nextInt(10000); // números aleatórios entre 0 e 9999
            if (!elementosFila.contains(numero)) {
                fila.add(numero);
                elementosFila.add(numero);
            } else {
                pilha.push(numero);
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
