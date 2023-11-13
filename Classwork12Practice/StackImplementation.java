package Classwork12Practice;

public class StackImplementation<E> implements Stack<E> {
    //maintain two properties : top element, size
    private Node<E> top;
    private int size;
    

    public StackImplementation() {
        this.top = null; //top points to null before the nodes are created
        this.size = 0; // size is initialized to 0
    }

    @Override
    public void push(E value) {
        Node<E> node = new Node<E>(value);
        node.setNext(top); // new node next now points to existing top
        top=node;          // top now points to the newest added value.
        size++;

    }

    @Override
    public E pop() {
        E value = top.getValue(); // just so that we can return which value we are removing
        top=top.getNext();        //set top to next value
        size--;
        return value;
    }

    @Override
    public E peek() {
        return top.getValue();
    }

    @Override
    public int size() {
        return size;
    }
    
}
