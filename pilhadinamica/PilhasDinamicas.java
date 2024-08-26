import java.util.Random;
import java.util.Stack;

public class PilhasDinamicas {

    public static void main(String[] args) {
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();
        Random random = new Random();
        
        // Fase 1: Sorteando 100 números e distribuindo nas pilhas
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(9) + 1;  // Sorteia números entre 1 e 9
            if (numero >= 1 && numero <= 3) {
                pilha1.push(numero);
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(numero);
            } else {
                pilha3.push(numero);
            }
        }
        
        // Exibindo o estado inicial das pilhas após a Fase 1
        System.out.println("Estado inicial das pilhas:");
        imprimirPilhas(pilha1, pilha2, pilha3);
        
        // Fase 2: Manipulação das pilhas com base nos números sorteados
        for (int i = 0; i < 100; i++) {
            int pilhaEscolhida = random.nextInt(3) + 1;  // Sorteia números entre 1 e 3
            
            if (pilhaEscolhida == 1) {
                if (!pilha2.isEmpty() && !pilha3.isEmpty()) {
                    int num2 = pilha2.pop();
                    int num3 = pilha3.pop();
                    pilha1.push(num2);
                    pilha1.push(num3);
                    System.out.println("Empilhando os números " + num2 + " e " + num3 + " na pilha 1");
                }
            } else if (pilhaEscolhida == 2) {
                if (!pilha1.isEmpty() && !pilha3.isEmpty()) {
                    int num1 = pilha1.pop();
                    int num3 = pilha3.pop();
                    pilha2.push(num1);
                    pilha2.push(num3);
                    System.out.println("Empilhando os números " + num1 + " e " + num3 + " na pilha 2");
                }
            } else if (pilhaEscolhida == 3) {
                if (!pilha1.isEmpty() && !pilha2.isEmpty()) {
                    int num1 = pilha1.pop();
                    int num2 = pilha2.pop();
                    pilha3.push(num1);
                    pilha3.push(num2);
                    System.out.println("Empilhando os números " + num1 + " e " + num2 + " na pilha 3");
                }
            }
            
            // Verificando se alguma pilha ficou vazia
            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                System.out.println("O programa foi encerrado porque a pilha " +
                    (pilha1.isEmpty() ? "1" : pilha2.isEmpty() ? "2" : "3") + " está vazia.");
                break;
            }
        }
        
        // Exibindo o estado final das pilhas
        System.out.println("\nEstado final das pilhas:");
        imprimirPilhas(pilha1, pilha2, pilha3);
    }
    
    // Método para imprimir o conteúdo das pilhas
    public static void imprimirPilhas(Stack<Integer> pilha1, Stack<Integer> pilha2, Stack<Integer> pilha3) {
        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
    }
}
