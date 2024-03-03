import java.util.Scanner;

public class Exercicio360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo os intervalos de dias para cada signo em vetores
        int[] ultimoDia = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 20};
        String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
                            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};

        while (true) {
            System.out.println("Digite a data de nascimento (ddmm) ou 9999 para sair:");
            int data = scanner.nextInt();

            if (data == 9999) {
                System.out.println("Encerrando o programa.");
                break;
            }

            int dia = data / 100;
            int mes = data % 100;

            String signo = "";

            // Encontrando o signo com base na data de nascimento
            for (int i = 0; i < ultimoDia.length; i++) {
                if (mes == (i + 1) && dia <= ultimoDia[i]) {
                    signo = signos[i];
                    break;
                } else if (mes == 12 && dia >= 1 && dia <= 21) { // Para o mês de dezembro
                    signo = signos[11];
                    break;
                }
            }

            if (signo.isEmpty()) {
                System.out.println("Data de nascimento inválida.");
            } else {
                System.out.println("Seu signo é: " + signo);
            }
        }
    }
}
