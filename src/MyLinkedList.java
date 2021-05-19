public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node<>(data);
    }

    // Node
    private class Node<E> {
        private Node<E> next = null;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    public void addFirst(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        Node holder = new Node(e);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = holder;
        numNodes++;
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes){
            addLast(element);
        }else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            (temp.next).next = holder;
            numNodes++;
        }
    }
    public void remove(int index){
        if (index == 0){
            head = head.next;
        }else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numNodes--;
        }
    }
    public boolean remove(E o) {
        Node temp = head;
        boolean remove = false;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o) {
                remove = true;
                temp = temp.next;
            }
            temp = temp.next;
        }
        numNodes--;
        return remove;
    }
    public int size() {
        return numNodes;
    }
    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E o) {
        Node temp = head;
        int serial = 0;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o) {
                serial = i;
                break;
            }
            temp = temp.next;
        }
        return serial;
    }
    public boolean add(E e) {
        tail.next = new Node(e);
        tail = tail.next;
        numNodes++;
        return true;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (Node) temp.getData();
    }

    public E getFirst() {
        return head.getData();
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return(E) temp.getData();
    }

    public void clear() {
        head = null;
        tail = null;
        numNodes = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.next;
        }
    }
}
