public class Exercicio480 {
    public static void main(String[] args) {
        int numero = 3000; // Altere o número aqui para testar
        if (verificarCapicua(numero)) {
            System.out.println(numero + " é um número capicua.");
        } else {
            System.out.println(numero + " não é um número capicua.");
        }
    }

    public static boolean verificarCapicua(int numero) {
        int reverso = 0;
        int original = numero;

        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }

        return original == reverso;
    }
}
