public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.inserir(10);
        lista.inserir(30);
        lista.inserir(20);
        lista.inserir(50);
        lista.inserir(40);
        
        System.out.println("Lista inicial:");
        lista.imprimir();
        
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        
        System.out.println("Média dos elementos da lista: " + lista.media());
        
        lista.remover(30);
        System.out.println("Lista após remover 30:");
        lista.imprimir();
        
        System.out.println("Elemento 20 está na lista? " + lista.busca(20));
        
        lista.eliminaTodasOcorrencias(20);
        System.out.println("Lista após eliminar todas as ocorrências de 20:");
        lista.imprimir();
        
        lista.insereNaDireita(1, 25);
        System.out.println("Lista após inserir 25 à direita do segundo elemento:");
        lista.imprimir();
        
        lista.insereNaEsquerda(1, 15);
        System.out.println("Lista após inserir 15 à esquerda do segundo elemento:");
        lista.imprimir();
    }
}
