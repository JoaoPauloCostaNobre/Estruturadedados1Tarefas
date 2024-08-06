import java.util.HashSet;
import java.util.Set;

class No {
    int info;
    No prox;

    public No(int info) {
        this.info = info;
        this.prox = null;
    }
}

class Lista {
    No cabeca;
    int tamanho;

    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    // Inicializar a lista (construtor já faz isso)

    // Verificar se lista é vazia
    public boolean estaVazia() {
        return cabeca == null;
    }

    // Inserir um dado elemento de forma ordenada
    public void inserir(int info) {
        No novo = new No(info);
        if (cabeca == null || cabeca.info >= novo.info) {
            novo.prox = cabeca;
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info < novo.info) {
                atual = atual.prox;
            }
            novo.prox = atual.prox;
            atual.prox = novo;
        }
        tamanho++;
    }

    // Remover um dado elemento
    public void remover(int info) {
        if (cabeca == null) return;

        if (cabeca.info == info) {
            cabeca = cabeca.prox;
            tamanho--;
            return;
        }

        No atual = cabeca;
        while (atual.prox != null && atual.prox.info != info) {
            atual = atual.prox;
        }

        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            tamanho--;
        }
    }

    // Tamanho: retorna o número de elementos da lista
    public int getTamanho() {
        return tamanho;
    }

    // Iguais: recebe duas listas ordenadas e verifica se elas são iguais
    public boolean iguais(Lista outraLista) {
        No atual1 = this.cabeca;
        No atual2 = outraLista.cabeca;

        while (atual1 != null && atual2 != null) {
            if (atual1.info != atual2.info) {
                return false;
            }
            atual1 = atual1.prox;
            atual2 = atual2.prox;
        }

        return atual1 == null && atual2 == null;
    }

    // Média: retorna a média aritmética simples dos elementos da lista
    public double media() {
        if (estaVazia()) return 0.0;

        int soma = 0;
        No atual = cabeca;
        while (atual != null) {
            soma += atual.info;
            atual = atual.prox;
        }

        return (double) soma / tamanho;
    }

    // Busca: verifica se um dado valor é pertencente à lista
    public boolean busca(int info) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.info == info) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    // Elimina: elimina todas as ocorrências de um dado elemento
    public void eliminaTodasOcorrencias(int info) {
        while (cabeca != null && cabeca.info == info) {
            cabeca = cabeca.prox;
            tamanho--;
        }

        No atual = cabeca;
        while (atual != null && atual.prox != null) {
            if (atual.prox.info == info) {
                atual.prox = atual.prox.prox;
                tamanho--;
            } else {
                atual = atual.prox;
            }
        }
    }

    // Elimina_: elimina um elemento que está em uma dada posição definida pelo usuário
    public void eliminaPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return;

        if (posicao == 0) {
            cabeca = cabeca.prox;
            tamanho--;
            return;
        }

        No atual = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.prox;
        }

        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            tamanho--;
        }
    }

    // Insere na direita
    public void insereNaDireita(int posicao, int valor) {
        if (posicao < 0 || posicao >= tamanho) return;

        No novo = new No(valor);
        No atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.prox;
        }

        novo.prox = atual.prox;
        atual.prox = novo;
        tamanho++;
    }

    // Insere na esquerda
    public void insereNaEsquerda(int posicao, int valor) {
        if (posicao < 0 || posicao >= tamanho) return;

        if (posicao == 0) {
            inserir(valor);
            return;
        }

        No novo = new No(valor);
        No atual = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.prox;
        }

        novo.prox = atual.prox;
        atual.prox = novo;
        tamanho++;
    }

    // Método para imprimir a lista
    public void imprimir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}

