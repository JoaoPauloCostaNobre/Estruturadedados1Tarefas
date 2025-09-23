
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicStack pilhaPar = new DynamicStack();
        DynamicStack pilhaImpar = new DynamicStack();
        
        System.out.println("Digite valores inteiros (-127 a 128). Digite 0 para finalizar:");
        
        // Lendo os valores e classificando-os em pilhas
        while (true) {
            int valor = scanner.nextInt();
            if (valor == 0) {
                break;
            } else if (valor % 2 == 0) {
                pilhaPar.push(valor);
            } else {
                pilhaImpar.push(valor);
            }
        }
        
        // Manipulando as pilhas: retirando elementos alternadamente
        System.out.println("\nProcessando as pilhas...");
        while (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()) {
            Integer impar = pilhaImpar.pop();
            if (impar != null) {
                System.out.println("Retirado da PILHA ÍMPAR: " + impar);
            }

            Integer par = pilhaPar.pop();
            if (par != null) {
                System.out.println("Retirado da PILHA PAR: " + par);
            }
        }
        
        // Verificando o estado final das pilhas
        if (pilhaPar.isEmpty() && pilhaImpar.isEmpty()) {
            System.out.println("Ambas as pilhas estão vazias.");
        } else if (pilhaPar.isEmpty()) {
            System.out.println("Pilha PAR está vazia.");
            System.out.println("Pilha ÍMPAR ainda possui " + pilhaImpar.size() + " elementos.");
            System.out.println("Elementos restantes na PILHA ÍMPAR:");
            pilhaImpar.printStack();
        } else if (pilhaImpar.isEmpty()) {
            System.out.println("Pilha ÍMPAR está vazia.");
            System.out.println("Pilha PAR ainda possui " + pilhaPar.size() + " elementos.");
            System.out.println("Elementos restantes na PILHA PAR:");
            pilhaPar.printStack();
        }
        
        scanner.close();
    }
}