package part2;

public class Node<E> {
    Node<E> next;
    E data;

    public Node(E data) {
        next=null;
        this.data = data;
    }

    public Node(Node<E> next, E data) {
        this.next = next;
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
