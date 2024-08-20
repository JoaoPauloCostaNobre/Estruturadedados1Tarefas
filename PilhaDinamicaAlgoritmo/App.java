



class DynamicStack {
    private Node top;

    public DynamicStack() {
        this.top = null;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Adiciona um elemento na pilha
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Remove o elemento do topo da pilha
    
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia. Não é possível remover elemento.");
        }
        char poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Retorna o elemento do topo da pilha sem removê-lo
    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia. Não é possível verificar o topo.");
        }
        return top.data;
    }
}

