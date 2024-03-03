import java.util.Scanner;

public class Exercicio358{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores para cada faixa de lucro
        int lucroMenor10 = 0;
        int lucroEntre10E20 = 0;
        int lucroMaior20 = 0;

        // Loop para ler os preços de compra e venda de 100 mercadorias
        for (int i = 1; i <= 100; i++) {
            System.out.println("Digite o preço de compra da mercadoria " + i + ":");
            double precoCompra = scanner.nextDouble();

            System.out.println("Digite o preço de venda da mercadoria " + i + ":");
            double precoVenda = scanner.nextDouble();

            // Calcular o lucro percentual
            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            // Verificar em qual faixa de lucro a mercadoria se enquadra e atualizar os contadores
            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                lucroEntre10E20++;
            } else {
                lucroMaior20++;
            }
        }

        // Imprimir os resultados
        System.out.println("Mercadorias com lucro menor que 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10E20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucroMaior20);
    }
}
