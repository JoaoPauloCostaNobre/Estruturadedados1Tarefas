import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int[] toArray() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int[] result = new int[length];
        current = head;
        int i = 0;
        while (current != null) {
            result[i++] = current.data;
            current = current.next;
        }
        return result;
    }

    public static LinkedList fromArray(int[] dataArray) {
        LinkedList list = new LinkedList();
        for (int data : dataArray) {
            list.append(data);
        }
        return list;
    }

    // Inverter
    public static LinkedList inverter(LinkedList lista) {
        LinkedList novaLista = new LinkedList();
        Node current = lista.head;
        while (current != null) {
            novaLista.prepend(current.data);
            current = current.next;
        }
        return novaLista;
    }

    // Retornar ímpares
    public static LinkedList retornarImpares(LinkedList lista1, LinkedList lista2) {
        LinkedList novaLista = new LinkedList();
        Node current = lista1.head;
        while (current != null) {
            if (current.data % 2 != 0) {
                novaLista.append(current.data);
            }
            current = current.next;
        }
        current = lista2.head;
        while (current != null) {
            if (current.data % 2 != 0) {
                novaLista.append(current.data);
            }
            current = current.next;
        }
        return novaLista;
    }

    // Concatenar
    public static LinkedList concatenar(LinkedList lista1, LinkedList lista2) {
        LinkedList novaLista = new LinkedList();
        Node current = lista1.head;
        while (current != null) {
            novaLista.append(current.data);
            current = current.next;
        }
        current = lista2.head;
        while (current != null) {
            novaLista.append(current.data);
            current = current.next;
        }
        return novaLista;
    }

    // Interseção
    public static LinkedList interseccao(LinkedList lista1, LinkedList lista2) {
        LinkedList novaLista = new LinkedList();
        Set<Integer> dadosLista1 = new HashSet<>();
        Node current = lista1.head;
        while (current != null) {
            dadosLista1.add(current.data);
            current = current.next;
        }
        current = lista2.head;
        while (current != null) {
            if (dadosLista1.contains(current.data)) {
                novaLista.append(current.data);
            }
            current = current.next;
        }
        return novaLista;
    }

    // Intercalar (não ordenado)
    public static LinkedList intercalar(LinkedList lista1, LinkedList lista2) {
        LinkedList novaLista = new LinkedList();
        Node current1 = lista1.head;
        Node current2 = lista2.head;
        while (current1 != null || current2 != null) {
            if (current1 != null) {
                novaLista.append(current1.data);
                current1 = current1.next;
            }
            if (current2 != null) {
                novaLista.append(current2.data);
                current2 = current2.next;
            }
        }
        return novaLista;
    }

    // Intercalar ordenadamente
    public static LinkedList intercalarOrdenado(LinkedList lista1, LinkedList lista2) {
        LinkedList novaLista = new LinkedList();
        Node current1 = lista1.head;
        Node current2 = lista2.head;
        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                novaLista.append(current1.data);
                current1 = current1.next;
            } else {
                novaLista.append(current2.data);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            novaLista.append(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            novaLista.append(current2.data);
            current2 = current2.next;
        }
        return novaLista;
    }
}


    