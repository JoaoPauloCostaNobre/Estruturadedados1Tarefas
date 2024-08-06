import java.util.Scanner;

public class DecimalParaBinario {

    // Método recursivo para converter a parte inteira de um número decimal para binário
    public static String converterParaBinarioInteiro(int numero) {
        if (numero == 0) {
            return "";
        }
        int resto = numero % 2;
        return converterParaBinarioInteiro(numero / 2) + resto;
    }

    // Método recursivo para converter a parte fracionária de um número decimal para binário
    public static String converterParaBinarioFracionario(double parteFracionaria, int precisao) {
        if (parteFracionaria == 0 || precisao == 0) {
            return "";
        }
        parteFracionaria *= 2;
        int bit = (int) parteFracionaria;
        return bit + converterParaBinarioFracionario(parteFracionaria - bit, precisao - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal (use ponto como separador decimal): ");

        try {
            // Lê a entrada como uma string
            String entrada = scanner.nextLine();

            // Substitui a vírgula por ponto
            entrada = entrada.replace(',', '.');

            // Converte a string para número
            double numeroDecimal = Double.parseDouble(entrada);

            // Separa a parte inteira e a parte fracionária
            int parteInteira = (int) numeroDecimal;
            double parteFracionaria = numeroDecimal - parteInteira;

            // Converte a parte inteira e a parte fracionária para binário
            String binarioInteiro = converterParaBinarioInteiro(parteInteira);
            if (binarioInteiro.isEmpty()) {
                binarioInteiro = "0";
            }
            String binarioFracionario = converterParaBinarioFracionario(parteFracionaria, 10);

            System.out.println("O número " + numeroDecimal + " em binário é: " + binarioInteiro + "." + binarioFracionario);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        }

        scanner.close();
    }
}
