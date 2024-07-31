package Exercicio7;

import java.util.Queue;
import java.util.Stack;

public class InverterFila {

    
    
    public  void inverterFila(Queue<Integer> F) {
        Stack<Integer> pilha = new Stack<>();
        
        // Transferir os elementos da fila para a pilha
        while (!F.isEmpty()) {
            pilha.push(F.poll());
        }
        
        // Transferir os elementos da pilha de volta para a fila
        while (!pilha.isEmpty()) {
            F.add(pilha.pop());
        }
    }
}
