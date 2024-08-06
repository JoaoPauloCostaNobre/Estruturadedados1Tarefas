public class Modulo {

    // Função recursiva para calcular o resto da divisão de x por y
    public static int calcularMOD(int x, int y) {
        // Caso base: se x é igual a y, o resto é 0
        if (x == y) {
            return 0;
        }
        
        // Se x é menor que y, o resto é x
        if (x < y) {
            return x;
        }
        
        // Caso recursivo: calcula MOD(x - y, y)
        return calcularMOD(x - y, y);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int x = 48;
        int y = 18;
        int mod = calcularMOD(x, y);

        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + mod);
    }
}
