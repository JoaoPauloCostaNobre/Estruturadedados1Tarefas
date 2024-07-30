import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControlePistaDecolagem controlePista = new ControlePistaDecolagem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nControle da Pista de Decolagem");
            System.out.println("1. Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar as características do primeiro avião da fila");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    controlePista.listarNumeroAvioes();
                    break;
                case 2:
                    controlePista.autorizarDecolagem();
                    break;
                case 3:
                    System.out.print("Digite o identificador do avião: ");
                    int identificador = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    Aviao aviao = new Aviao(identificador, nome);
                    controlePista.adicionarAviao(aviao);
                    break;
                case 4:
                    controlePista.listarAvioes();
                    break;
                case 5:
                    controlePista.listarPrimeiroAviao();
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
