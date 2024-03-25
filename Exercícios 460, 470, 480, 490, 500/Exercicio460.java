import java.util.Scanner;

public class Exercicio460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int resultado = calcularDobro(numero);
            System.out.println("Dobro: " + resultado);
        }

        scanner.close();
    }

    public static int calcularDobro(int numero) {
        return numero * 2;
    }
}
