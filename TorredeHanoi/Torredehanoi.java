import java.time.Duration;
import java.time.Instant;

public class Torredehanoi {

    private static long movimentos;

    public static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimentos++;
            return;
        }
        hanoi(n - 1, origem, auxiliar, destino);
        movimentos++;
        hanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        int[] discos = {30};

        for (int n : discos) {
            movimentos = 0;
            Instant start = Instant.now();
            System.out.println("\nIniciando com " + n + " discos");
            hanoi(n, 'A', 'C', 'B');
            Instant end = Instant.now();
            Duration duration = Duration.between(start, end);
            long seconds = duration.getSeconds();
            long millis = duration.toMillis() % 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            seconds = seconds % 60;
            minutes = minutes % 60;
            System.out.printf("Tempo gasto para %d discos: %02d:%02d:%02d:%03d%n", n, hours, minutes, seconds, millis);
            System.out.println("Quantidade de movimentos: " + movimentos);
        }
    }
}
