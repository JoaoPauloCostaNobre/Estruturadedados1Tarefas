package Exercicio5;

public class Main {
    public static void main(String[] args) {
        FilaPilhaManager manager = new FilaPilhaManager();
        
        // Sortear e adicionar 1000 números
        manager.sortearEAdicionarNumeros(1000);
        
        // Imprimir a Fila F e a Pilha P
        manager.imprimirFila();
        manager.imprimirPilha();
    }
}
