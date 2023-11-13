package Classwork12Practice;

public class StackImplementation<E> implements Stack<E> {
    //maintain two properties : top element, size
    private Node<E> top;
    private int size;
    

    public StackImplementation() {
        this.top = null; //top points to null before the nodes are created
        this.size = 0; // size is initialized to 0
    }

    //add
    //structure : new node(now top)-->existing node1 -->existing node2-->existing node3 -->null
    @Override
    public void push(E value) {
        Node<E> node = new Node<E>(value);
        node.setNext(top); //elements stored in the reverse order of insertion,so, new node next now points to existing top, node.next-->top
        top=node;          // top now points to the newest added value.
        size++;
    }

    //remove
    @Override
    public E pop() {
        E value = top.getValue(); // just so that we can return which value we are removing
        top=top.getNext();        //set top to next value
        size--;
        return value;
    }

    //retrieve but not remove
    @Override
    public E peek() {
        return top.getValue();
    }

    //number of elements 
    @Override
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        StackImplementation<Integer> stack= new StackImplementation<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Size of the stack = " + stack.size());
        System.out.println("Topmost element of the stack = " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size of the stack = " + stack.size());
        System.out.println("Topmost element of the stack = " + stack.peek());
    }
}
