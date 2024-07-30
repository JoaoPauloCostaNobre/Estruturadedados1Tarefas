import java.util.Scanner;
import java.util.Stack;

class Pilha {
    private Stack<Character> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public boolean estaVazia() {
        return stack.isEmpty();
    }

    public void empilhar(char item) {
        stack.push(item);
    }

    public char desempilhar() {
        return stack.pop();
    }

    public int tamanho() {
        return stack.size();
    }
}

class ManipuladorTexto {
    public static String inverterTexto(String texto) {
        Pilha pilha = new Pilha();
        for (char ch : texto.toCharArray()) {
            pilha.empilhar(ch);
        }

        StringBuilder textoInvertido = new StringBuilder();
        while (!pilha.estaVazia()) {
            textoInvertido.append(pilha.desempilhar());
        }

        return textoInvertido.toString();
    }

    public static boolean verificarPalindromo(String texto) {
        String textoFiltrado = texto.replaceAll("[\\s.]", "").toLowerCase();
        Pilha pilha = new Pilha();

        for (char ch : textoFiltrado.toCharArray()) {
            pilha.empilhar(ch);
        }

        StringBuilder textoInvertido = new StringBuilder();
        while (!pilha.estaVazia()) {
            textoInvertido.append(pilha.desempilhar());
        }

        return textoFiltrado.equals(textoInvertido.toString());
    }
}

