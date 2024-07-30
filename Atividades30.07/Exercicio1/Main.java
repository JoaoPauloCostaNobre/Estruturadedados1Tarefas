import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequência de caracteres: ");
        String texto = scanner.nextLine();

        String textoInvertido = ManipuladorTexto.inverterTexto(texto);
        System.out.println("Texto na ordem inversa: " + textoInvertido);

        if (ManipuladorTexto.verificarPalindromo(texto)) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }
}
