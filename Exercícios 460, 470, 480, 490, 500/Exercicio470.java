public class Exercicio470 {
    public static void main(String[] args) {
        int numero = 17; // Altere o número aqui para testar
        if (verificarPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número for divisível por algum número entre 2 e a raiz quadrada do número, não é primo
            }
        }
        return true; // Se não for divisível por nenhum número entre 2 e a raiz quadrada, é primo
    }
}
