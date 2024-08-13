public class No {
    String valor;
    No anterior;
    No proximo;

    // Construtor para criar um novo nó
    public No(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}
