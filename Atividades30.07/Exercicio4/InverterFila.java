import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InverterFila {

    
    
    public  Queue<Integer> inverterFila(Queue<Integer> F1) {
        Stack<Integer> pilha = new Stack<>();
        // Desempilhar todos os elementos da fila F1 e empilhá-los na pilha
        while (!F1.isEmpty()) {
            pilha.push(F1.poll());
        }
        // Criar a nova fila F2 e desempilhar os elementos da pilha para a fila F2
        Queue<Integer> F2 = new LinkedList<>();
        while (!pilha.isEmpty()) {
            F2.add(pilha.pop());
        }
        return F2;
    }
}
