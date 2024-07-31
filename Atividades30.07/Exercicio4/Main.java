import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar a fila F1 e preenchê-la com 100 números aleatórios
        Queue<Integer> F1 = new LinkedList<>();
        Random rand = new Random();
        InverterFila inverter = new InverterFila();
        for (int i = 0; i < 100; i++) {
            F1.add(rand.nextInt(100)); // números aleatórios entre 0 e 99
        }
        
        // Imprimir a fila F1 original
        System.out.println("Fila F1 original: " + F1);
        
        // Inverter a fila F1 e criar a nova fila F2
        Queue<Integer> F2 = inverter.inverterFila(F1);
        
        // Imprimir a fila F2 invertida
        System.out.println("Fila F2 invertida: " + F2);
    }
}
