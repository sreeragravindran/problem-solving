package problemsolving.linkedList;

public class Node<T> {
    T data;
    public Node next;

    public Node(T data) {
        this.data = data;
    }

    public Node addNext(Node nextNode) {
        this.next = nextNode;
        return nextNode;
    }
}
