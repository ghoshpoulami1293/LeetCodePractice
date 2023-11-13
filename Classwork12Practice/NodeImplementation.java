package Classwork12Practice;

public class NodeImplementation<E> implements Queue<E> {
    //maintain 3 properties : size, front, back;
    private int size;
    private Node<E> front;
    private Node<E> back;

    //constructor
    public NodeImplementation() {
        this.size = 0;
        this.front = null;
        this.back = null;
    }
    
    //accessors and mutators    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Node<E> getFront() {
        return front;
    }
    public void setFront(Node<E> front) {
        this.front = front;
    }
    public Node<E> getBack() {
        return back;
    }
    public void setBack(Node<E> back) {
        this.back = back;
    }

    //add to the back of the queue
    @Override
    public void enqueue(E value) {
        Node<E> node = new Node<E>(value);
        node.setNext(back);
        back= node;
        size++;
    }

    //retrieve and remove from the front of the queue
    @Override
    public E dequeue() {
        E value = front.getValue();
        front = front.getNext();
        size--;
        return value;
    }

    //return size
    @Override
    public int size() {
       return size;
    }

    //retrieve but dont remove the element from the front of the queue
    @Override
    public E peek() {
        return front.getValue();
    }    
}
