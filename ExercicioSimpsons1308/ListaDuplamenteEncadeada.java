public class ListaDuplamenteEncadeada {
    No inicio; // Referência para o início da Lista
    No fim;    // Referência para o final da Lista

    // Construtor para criar uma lista vazia
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    // Função para inserir um valor no final da lista
    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) { // Lista vazia: novo nó será o início e o fim
            inicio = novoNo;
            fim = novoNo;
        } else { // Adiciona o novo nó ao final da lista
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }
    

    // Função para inserir um valor no início da lista
    public void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) { // Lista vazia: novo nó será o início e o fim
            inicio = novoNo;
            fim = novoNo;
        } else { // Adiciona o novo nó ao início da lista
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    // Função para inserir um valor em uma posição específica da lista
    public void inserirNaPosicao(String valor, int posicao) {
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;

        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) { // Adiciona no final se a posição for maior que o tamanho da lista
            inserir(valor);
        } else {
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            atual.proximo.anterior = novoNo;
            atual.proximo = novoNo;
        }
    }

    // Função para verificar se um valor está na lista
    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // Função para obter o tamanho da lista
    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    // Função para esvaziar a lista
    public void esvaziar() {
        inicio = null;
        fim = null;
    }

    // Função para exibir os valores da lista
    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Função para remover um valor da lista
    public void remover(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) { // Removendo um nó no meio ou no final
                    atual.anterior.proximo = atual.proximo;
                } else { // Removendo o primeiro nó
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else { // Removendo o último nó
                    fim = atual.anterior;
                }
                return; // Sai da função após remover o nó
            }
            atual = atual.proximo;
        }
    }

    // Função para remover um nó de uma posição específica
    public void removerNaPosicao(int posicao) {
        if (posicao == 0 && inicio != null) {
            inicio = inicio.proximo;
            if (inicio != null) {
                inicio.anterior = null;
            } else {
                fim = null;
            }
            return;
        }

        No atual = inicio;
        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual != null) {
            if (atual.anterior != null) {
                atual.anterior.proximo = atual.proximo;
            }
            if (atual.proximo != null) {
                atual.proximo.anterior = atual.anterior;
            }
            if (atual == fim) {
                fim = atual.anterior;
            }
        }
    }

    // Função para remover o primeiro nó
    public void removerDoInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            if (inicio != null) {
                inicio.anterior = null;
            } else {
                fim = null;
            }
        }
    }

    // Função para remover o último nó
    public void removerDoFim() {
        if (fim != null) {
            fim = fim.anterior;
            if (fim != null) {
                fim.proximo = null;
            } else {
                inicio = null;
            }
        }
    }
}
