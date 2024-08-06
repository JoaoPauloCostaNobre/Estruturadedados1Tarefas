public class ContagemDigito {

    // Função recursiva para contar a ocorrência do dígito K em N
    public static int contarDigito(int N, int K) {
        // Caso base: se N é zero, não há mais dígitos a processar
        if (N == 0) {
            return 0;
        }

        // Verifica se o último dígito de N é igual a K
        int ultimoDigito = N % 10;
        int ocorrenciaNoUltimoDigito = (ultimoDigito == K) ? 1 : 0;

        // Chamada recursiva removendo o último dígito de N
        return ocorrenciaNoUltimoDigito + contarDigito(N / 10, K);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int N = 762021192;
        int K = 2;
        int ocorrencias = contarDigito(N, K);

        System.out.println("O dígito " + K + " ocorre " + ocorrencias + " vezes em " + N + ".");
    }
}
