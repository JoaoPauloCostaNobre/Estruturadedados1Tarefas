import java.util.LinkedList;

import java.util.Scanner;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<Object> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adicionando 10 pessoas à fila (exemplo)
        fila.add(new Aluno("2023104192040001", "João", "Engenharia"));
        fila.add(new Aluno("2023104192040002", "Maria", "Medicina"));
        fila.add(new Professor(12345, "Carlos", "Doutor"));
        fila.add(new Professor(54321, "Ana", "Mestre"));
        fila.add(new Tecnico(98765, "José"));
        fila.add(new Tecnico(56789, "Marta"));
        fila.add(new Aluno("2023104192040003", "Pedro", "Direito"));
        fila.add(new Aluno("2023104192040004", "Juliana", "Administração"));
        fila.add(new Professor(24680, "Fernanda", "PhD"));
        fila.add(new Tecnico(13579, "Lucas"));

        boolean operando = true;
        while (operando) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1. Mostrar fila");
            System.out.println("2. Remover primeiro da fila");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (escolha) {
                case 1:
                    System.out.println("\nFila do refeitório:");
                    int index = 1;
                    for (Object pessoa : fila) {
                        System.out.println(index++ + ": " + pessoa.toString());
                    }
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        fila.poll();
                    } else {
                        System.out.println("Fila vazia. Não é possível remover.");
                    }
                    break;
                case 3:
                    operando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }

        scanner.close();
    }
}