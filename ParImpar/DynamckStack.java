class DynamicStack {
    private Node top;

    public DynamicStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            top.next = newNode;
            newNode.prev = top;
        }
        top = newNode;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;  // Retorna null se a pilha estiver vazia
        }
        int data = top.data;
        top = top.prev;
        if (top != null) {
            top.next = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public int size() {
        int size = 0;
        Node temp = top;
        while (temp != null) {
            size++;
            temp = temp.prev;
        }
        return size;
    }
}