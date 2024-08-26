import java.util.Scanner;
import java.util.Stack;

public class ParImparPilha {

    public static void main(String[] args) {
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite números inteiros entre -127 e 128 (digite 0 para finalizar):");
        
        // Leitura e classificação dos números
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero % 2 == 0) {
                pilhaPar.push(numero);
            } else {
                pilhaImpar.push(numero);
            }
        }
        
        // Remoção alternada dos elementos das pilhas
        while (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()) {
            System.out.println("Retirado da pilha ímpar: " + pilhaImpar.pop());
            if (!pilhaPar.isEmpty()) {
                System.out.println("Retirado da pilha par: " + pilhaPar.pop());
            }
        }
        
        // Verificação de qual pilha ainda possui elementos
        if (!pilhaPar.isEmpty()) {
            System.out.println("A pilha PAR ainda possui " + pilhaPar.size() + " elementos:");
            while (!pilhaPar.isEmpty()) {
                System.out.println(pilhaPar.pop());
            }
        } else if (!pilhaImpar.isEmpty()) {
            System.out.println("A pilha ÍMPAR ainda possui " + pilhaImpar.size() + " elementos:");
            while (!pilhaImpar.isEmpty()) {
                System.out.println(pilhaImpar.pop());
            }
        } else {
            System.out.println("Ambas as pilhas estão vazias.");
        }
        
        scanner.close();
    }
}
