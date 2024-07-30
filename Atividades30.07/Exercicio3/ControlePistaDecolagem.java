import java.util.LinkedList;
import java.util.Queue;

public class ControlePistaDecolagem {
    private Queue<Aviao> filaDecolagem;

    public ControlePistaDecolagem() {
        this.filaDecolagem = new LinkedList<>();
    }

    public void listarNumeroAvioes() {
        System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDecolagem.size());
    }

    public void autorizarDecolagem() {
        if (!filaDecolagem.isEmpty()) {
            Aviao aviao = filaDecolagem.poll();
            System.out.println("Avião autorizado a decolar: " + aviao);
        } else {
            System.out.println("Não há aviões na fila de decolagem.");
        }
    }

    public void adicionarAviao(Aviao aviao) {
        filaDecolagem.add(aviao);
        System.out.println("Avião adicionado à fila de espera: " + aviao);
    }

    public void listarAvioes() {
        if (!filaDecolagem.isEmpty()) {
            System.out.println("Aviões na fila de espera:");
            for (Aviao aviao : filaDecolagem) {
                System.out.println(aviao);
            }
        } else {
            System.out.println("Não há aviões na fila de espera.");
        }
    }

    public void listarPrimeiroAviao() {
        if (!filaDecolagem.isEmpty()) {
            System.out.println("Primeiro avião na fila: " + filaDecolagem.peek());
        } else {
            System.out.println("Não há aviões na fila de decolagem.");
        }
    }
}
