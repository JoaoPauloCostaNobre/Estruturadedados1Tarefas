public class Main {
    public static void main(String[] args) {
        LinkedList lista1 = new LinkedList();
        LinkedList lista2 = new LinkedList();

        for (int i = 0; i < 50; i++) {
            lista1.append((int) (Math.random() * 201 - 100));  // números aleatórios de -100 a 100
            lista2.append((int) (Math.random() * 201 - 100));
        }

        System.out.println("Lista 1:");
        lista1.printList();

        System.out.println("Lista 2:");
        lista2.printList();

        LinkedList invertida = LinkedList.inverter(lista1);
        System.out.println("Lista 1 invertida:");
        invertida.printList();

        LinkedList impares = LinkedList.retornarImpares(lista1, lista2);
        System.out.println("Números ímpares das listas 1 e 2:");
        impares.printList();

        LinkedList concatenada = LinkedList.concatenar(lista1, lista2);
        System.out.println("Listas 1 e 2 concatenadas:");
        concatenada.printList();

        LinkedList intersecao = LinkedList.interseccao(lista1, lista2);
        System.out.println("Interseção das listas 1 e 2:");
        intersecao.printList();

        LinkedList intercalada = LinkedList.intercalar(lista1, lista2);
        System.out.println("Listas 1 e 2 intercaladas:");
        intercalada.printList();

        LinkedList intercaladaOrdenada = LinkedList.intercalarOrdenado(lista1, lista2);
        System.out.println("Listas 1 e 2 intercaladas e ordenadas:");
        intercaladaOrdenada.printList();
    }
}