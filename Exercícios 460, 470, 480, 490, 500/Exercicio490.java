import java.util.Scanner;

public class Exercicio490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];

        for (int L = 0; L < 10; L++) {
            System.out.print("Digite a palavra em letras minúsculas " + (L + 1) + ": ");
            nome[L] = scanner.nextLine();
            int totalSubstituido = restantes(nome[L], "c");
            System.out.println("Total de caracteres 'c' substituídos na palavra " + (L + 1) + ": " + totalSubstituido);
        }

        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }

        scanner.close();
    }

    public static int restantes(String palavra, String x) {
        int cont = 0;
        char[] letras = palavra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == x.charAt(0)) {
                letras[i] = '*';
                cont++;
            }
        }
        return cont;
    }
}
