public class Fila {
    private int tamanho;
    private int[] elementos;
    private int inicio;
    private int fim;
    private int quantidade;

    // Método para criar uma nova fila
    public void criarFila(int tamanhoMaximo) {
        tamanho = tamanhoMaximo; // tamanho do vetor
        elementos = new int[tamanhoMaximo];
        inicio = 0; // início da fila
        fim = -1; // Inicialmente a fila está vazia
        quantidade = 0; // quantidade de elementos na fila
    }

    // Método para destruir a fila
    public void destruirFila() {
        elementos = null; // Liberar o vetor da memória
    }

    // Método para verificar se a fila está cheia
    public boolean filaCheia() {
        return quantidade == tamanho;
    }

    // Método para verificar se a fila está vazia
    public boolean filaVazia() {
        return quantidade == 0;
    }

    // Método para inserir um elemento na fila
    public void inserirElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro: A fila está cheia.");
            return;
        }
        fim = (fim + 1) % tamanho; // Atualiza índice e verifica se atingir o final do vetor
        elementos[fim] = elemento; // insere elemento no vetor
        quantidade++; // atualiza a quantidade de elementos
    }

    // Método para remover um elemento da fila
    public int removerElemento() {
        if (filaVazia()) {
            System.out.println("Erro: A fila está vazia.");
            return -1; // Retorna -1 se a fila estiver vazia
        }
        int elementoRemovido = elementos[inicio]; // remove o primeiro elemento
        inicio = (inicio + 1) % tamanho; // Atualiza índice e verifica se atingir o final do vetor
        quantidade--; // atualiza a quantidade de elementos
        return elementoRemovido; // retorna o elemento removido
    }

    // Método para localizar um elemento na fila
    public int localizarElemento(int elemento) {
        int posicao = -1; // Inicializa a posição como inválida
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                posicao = i; // Elemento encontrado, atualiza a posição
                break; // Interrompe o loop
            }
        }
        return posicao;
    }
}
