
import java.util.Random;

public class AtendimentoPostoSaude {
    public static void main(String[] args) {
        DequeCircular deque = new DequeCircular();
        Random random = new Random();

        int totalPessoas = 100;
        int pessoasAtendidas = 0;

        // Simular a chegada de 100 pessoas em grupos de 10
        for (int i = 1; i <= totalPessoas / 10; i++) {
            gerarPessoas(deque, i * 10, random);
        }

        // Atender as pessoas em grupos crescentes
        for (int i = 1; pessoasAtendidas < totalPessoas && !deque.estaVazia(); i++) {
            int pessoasASeremAtendidas = Math.min(i, deque.getTamanho());
            for (int j = 0; j < pessoasASeremAtendidas; j++) {
                Pessoa atendida = deque.removerFrente();
                System.out.println("Atendendo: " + atendida);
                pessoasAtendidas++;
            }
        }

        // Mostrar as pessoas que não foram atendidas
        if (!deque.estaVazia()) {
            System.out.println("\nPessoas que não foram atendidas:");
            while (!deque.estaVazia()) {
                Pessoa pessoa = deque.removerFrente();
                System.out.println(pessoa);
            }
        } else {
            System.out.println("\nTodas as pessoas foram atendidas.");
        }
    }

    private static void gerarPessoas(DequeCircular deque, int idInicial, Random random) {
        int id = idInicial - 9;
        deque.inserirTraseira(new Pessoa(id++, "F", random.nextInt(50) + 10, false, false, true)); // Necessidade Especial
        deque.inserirTraseira(new Pessoa(id++, "F", random.nextInt(50) + 10, true, false, false)); // Gestante
        deque.inserirTraseira(new Pessoa(id++, "F", random.nextInt(50) + 10, false, true, false)); // Lactante
        for (int i = 0; i < 3; i++) {
            deque.inserirTraseira(new Pessoa(id++, random.nextBoolean() ? "M" : "F", random.nextInt(41) + 60, false, false, false)); // Acima de 60 anos
        }
        for (int i = 0; i < 5; i++) {
            deque.inserirTraseira(new Pessoa(id++, random.nextBoolean() ? "M" : "F", random.nextInt(60), false, false, false)); // Normal
        }

        // Reordenar por prioridade (maior prioridade primeiro)
        ordenarPorPrioridade(deque);
    }

    private static void ordenarPorPrioridade(DequeCircular deque) {
        int n = deque.getTamanho();
        Pessoa[] array = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            array[i] = deque.removerFrente();
        }
        java.util.Arrays.sort(array, (p1, p2) -> Integer.compare(p2.prioridade, p1.prioridade));
        for (Pessoa p : array) {
            deque.inserirTraseira(p);
        }
    }
}