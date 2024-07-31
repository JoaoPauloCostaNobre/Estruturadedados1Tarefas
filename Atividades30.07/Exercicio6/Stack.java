package Exercicio6;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int value) {
        list.addFirst(value);
    }

    public int pop() {
        if (!isEmpty()) {
            return list.removeFirst();
        }
        throw new RuntimeException("Pilha está vazia.");
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

