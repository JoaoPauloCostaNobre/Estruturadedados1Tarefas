

class ListaDuplamenteEncadeada {
    

    private Node sentinela;

    public ListaDuplamenteEncadeada() {
        sentinela = new Node(0); // Sentinela
        sentinela.prev = sentinela;
        sentinela.next = sentinela;
    }

    public void inserirOrdenado(int data) {
        Node novo = new Node(data);
        Node atual = sentinela.next;

        while (atual != sentinela && atual.data < data) {
            atual = atual.next;
        }

        novo.next = atual;
        novo.prev = atual.prev;
        atual.prev.next = novo;
        atual.prev = novo;
    }

    public void imprimirCrescente() {
        Node atual = sentinela.next;
        while (atual != sentinela) {
            System.out.print(atual.data + " ");
            atual = atual.next;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        Node atual = sentinela.prev;
        while (atual != sentinela) {
            System.out.print(atual.data + " ");
            atual = atual.prev;
        }
        System.out.println();
    }

    public void removerPrimos() {
        Node atual = sentinela.next;
        while (atual != sentinela) {
            if (isPrimo(atual.data)) {
                atual.prev.next = atual.next;
                atual.next.prev = atual.prev;
            }
            atual = atual.next;
        }
    }

    private boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


