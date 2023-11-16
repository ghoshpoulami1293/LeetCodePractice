package Classwork12Practice;

public class QueueImplementation<E> implements Queue<E> {
    //maintain 3 properties : size, front, back;
    private int size;
    private Node<E> front;
    private Node<E> back;

    //constructor
    public QueueImplementation() {
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
    //structure : new node(now back)<--existing node3 <--existing node2<--existing node1 (front)
    @Override
    public void enqueue(E value) {
        Node<E> node = new Node<>(value);
        //for the first element added only
        if(size==0){ 
            front= node;
            back = node;
        }
        //for adding more elements after that: 
        else{
            back.setNext(node);// elements stored in the order of insertion , so, back.next-->new node
            back= node;
        }
        size++;
    }

    //retrieve and remove from the front of the queue
    @Override
    public E dequeue() {
        E value = front.getValue();
        front = front.getNext();
        //for the last element being dequed
        if(front==null){
            back=null;
        }
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

    public static void main(String[] args) {
        QueueImplementation<Integer> queue = new QueueImplementation<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Size - " +queue.size());
        System.out.println("Front element - " +queue.peek());

        while(queue.size()>0){
            System.out.println(queue.dequeue());
        }      
        System.out.println("Size - " +queue.size()); 
    }
}
