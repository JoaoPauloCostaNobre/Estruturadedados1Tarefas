package Exercicio6;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int value) {
        list.addLast(value);
    }

    public int dequeue() {
        if (!isEmpty()) {
            return list.removeFirst();
        }
        throw new RuntimeException("Fila está vazia.");
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

