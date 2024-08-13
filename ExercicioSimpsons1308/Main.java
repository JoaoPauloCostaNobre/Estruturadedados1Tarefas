public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // 1) Adicione Homer e Marge na lista e depois imprima o resultado.
        lista.inserir("Homer");
        lista.inserir("Marge");
        System.out.println("Lista após adicionar Homer e Marge:");
        lista.exibir();

        // 2) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();

        // 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista.
        lista.inserir("Homer");
        lista.inserirNaPosicao("Bart", 0); // Bart na posição 0
        lista.inserirNaPosicao("Moll", 1); // Moll na posição 1
        System.out.println("Lista após adicionar Homer, Bart na posição 0 e Moll na posição 1:");
        lista.exibir();

        // 4) Esvazie a lista.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();

        // 5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista.
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirNoInicio("Lisa");
        System.out.println("Lista após adicionar Homer, Bart e Lisa no início:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 6) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();

        // 7) Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1.
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirNaPosicao("Bart", 0); // Bart na posição 0
        lista.inserirNaPosicao("Marge", 1); // Marge na posição 1
        System.out.println("Lista após adicionar Homer, Maggie, Bart na posição 0 e Marge na posição 1:");
        lista.exibir();

        // Verifique se Lisa está na lista.
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        // 8) Esvazie a lista.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();

        // 9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        lista.inserir("Homer");
        lista.inserir("Bart");
        System.out.println("Lista após adicionar Homer e Bart:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 10) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado.
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));

        // 11) Esvazie a lista.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();

        // 12) Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no começo da lista e Sr. Burns no final da lista e imprima a lista.
        lista.inserirNoInicio("Homer"); // Homer no começo
        lista.inserirNoInicio("Bart"); // Bart no começo
        lista.inserir("Marge"); // Marge
        lista.inserirNaPosicao("Maggie", 1); // Maggie na posição 1
        lista.inserirNoInicio("Ned Flanders"); // Ned Flanders no começo
        lista.inserir("Sr. Burns"); // Sr. Burns no final
        System.out.println("Lista após adicionar personagens na ordem especificada:");
        lista.exibir();

        // 13) Remova do fim da lista e imprima a lista.
        lista.removerDoFim();
        System.out.println("Lista após remover do fim:");
        lista.exibir();

        // 14) Remova a posição 1, depois imprima a lista e o tamanho da lista.
        lista.removerNaPosicao(1);
        System.out.println("Lista após remover a posição 1:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 15) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 16) Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        lista.removerDoInicio();
        System.out.println("Lista após remover do começo:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 17) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 18) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("Lista após esvaziar:");
        lista.exibir();
    }
}
