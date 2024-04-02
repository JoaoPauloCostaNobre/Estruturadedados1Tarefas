public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(); // instancia a fila
        fila.criarFila(10); // cria a fila
        fila.inserirElemento(10); // insere elemento
        fila.inserirElemento(20); // insere elemento
        fila.inserirElemento(30); // insere elemento
        System.out.println("Elemento removido: " + fila.removerElemento()); // remove elemento
        int posicao = fila.localizarElemento(20); // verifica se o elemento 20 está na fila
        if (posicao != -1) {
            System.out.println("Elemento 20 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 20 não encontrado na fila.");
        }
        fila.destruirFila();
    }
}
