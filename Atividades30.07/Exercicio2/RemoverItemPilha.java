import java.util.Scanner;
import java.util.Stack;

public class RemoverItemPilha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        // Preenchendo a pilha com alguns valores
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        // Exibindo a pilha original
        System.out.println("Pilha original: " + pilha);

        // Solicitar a chave a ser removida
        System.out.print("Digite a chave do item a ser removido: ");
        int chave = scanner.nextInt();

        // Remover o item com a chave fornecida
        removerItemComChave(pilha, chave);

        // Exibindo a pilha após remoção
        System.out.println("Pilha após remoção do item com chave " + chave + ": " + pilha);

        scanner.close();
    }

    public static void removerItemComChave(Stack<Integer> pilha, int chave) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Transferir itens da pilha original para a pilha auxiliar, exceto o item com a chave fornecida
        while (!pilha.isEmpty()) {
            int topo = pilha.pop();
            if (topo != chave) {
                pilhaAuxiliar.push(topo);
            }

        }

        // Transferir os itens de volta para a pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
