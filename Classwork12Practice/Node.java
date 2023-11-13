package Classwork12Practice;

public class Node<E> {
    private E value;
    private Node<E> next;

    //constructor
    public Node(E value) {
        this.value = value;
        this.next = null;
    }
    //accessor and mutator
    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }       
}
