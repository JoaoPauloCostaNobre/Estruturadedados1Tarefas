public class MaximoDivisorComum {

    // Função recursiva para calcular o MDC de x e y
    public static int calcularMDC(int x, int y) {
        // Se x é igual a y, o MDC é x
        if (x == y) {
            return x;
        }
        
        // Se x é maior que y, calcula MDC(x - y, y)
        if (x > y) {
            return calcularMDC(x - y, y);
        }
        
        // Caso contrário, troca os valores de x e y
        return calcularMDC(y, x);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int x = 1000;
        int y = 6;
        int mdc = calcularMDC(x, y);

        System.out.println("O MDC de " + x + " e " + y + " é: " + mdc);
    }
}
