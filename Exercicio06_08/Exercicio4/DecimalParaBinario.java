import java.util.Scanner;

public class DecimalParaBinario {
    
    // Método para converter um número decimal inteiro para binário
    public static String converterParaBinarioInteiro(int numero) {
        if (numero == 0) {
            return "0";
        }
        
        StringBuilder binario = new StringBuilder();
        
        while (numero > 0) {
            int resto = numero % 2;
            binario.insert(0, resto);
            numero = numero / 2;
        }
        
        return binario.toString();
    }

    // Método para converter a parte fracionária de um número decimal para binário
    public static String converterParaBinarioFracionario(double parteFracionaria) {
        StringBuilder binario = new StringBuilder(".");
        int cont = 0;
        
        while (parteFracionaria > 0 && cont < 10) { // Limitar a 10 dígitos após o ponto para evitar loop infinito
            parteFracionaria *= 2;
            int bit = (int) parteFracionaria;
            if (bit == 1) {
                binario.append("1");
                parteFracionaria -= bit;
            } else {
                binario.append("0");
            }
            cont++;
        }
        
        return binario.toString();
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
            String binarioFracionario = converterParaBinarioFracionario(parteFracionaria);
            
            System.out.println("O número " + numeroDecimal + " em binário é: " + binarioInteiro + binarioFracionario);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        }
        
        scanner.close();
    }
}
