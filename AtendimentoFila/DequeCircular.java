class DequeCircular {
    private No frente;
    private No traseira;
    private int tamanho;

    public DequeCircular() {
        frente = null;
        traseira = null;
        tamanho = 0;
    }

    public void inserirFrente(Pessoa pessoa) {
        No novoNo = new No(pessoa);
        if (tamanho == 0) {
            frente = traseira = novoNo;
            frente.proximo = frente.anterior = frente;
        } else {
            novoNo.proximo = frente;
            novoNo.anterior = traseira;
            frente.anterior = novoNo;
            traseira.proximo = novoNo;
            frente = novoNo;
        }
        tamanho++;
    }

    public void inserirTraseira(Pessoa pessoa) {
        No novoNo = new No(pessoa);
        if (tamanho == 0) {
            frente = traseira = novoNo;
            frente.proximo = frente.anterior = frente;
        } else {
            novoNo.proximo = frente;
            novoNo.anterior = traseira;
            traseira.proximo = novoNo;
            frente.anterior = novoNo;
            traseira = novoNo;
        }
        tamanho++;
    }

    public Pessoa removerFrente() {
        if (tamanho == 0) return null;
        Pessoa removida = frente.pessoa;
        if (tamanho == 1) {
            frente = traseira = null;
        } else {
            frente = frente.proximo;
            frente.anterior = traseira;
            traseira.proximo = frente;
        }
        tamanho--;
        return removida;
    }

    public Pessoa removerTraseira() {
        if (tamanho == 0) return null;
        Pessoa removida = traseira.pessoa;
        if (tamanho == 1) {
            frente = traseira = null;
        } else {
            traseira = traseira.anterior;
            traseira.proximo = frente;
            frente.anterior = traseira;
        }
        tamanho--;
        return removida;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
}