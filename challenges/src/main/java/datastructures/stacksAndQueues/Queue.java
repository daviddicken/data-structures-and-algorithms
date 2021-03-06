package datastructures.stacksAndQueues;

public class Queue<T> {

    public Node<T> front;
    public Node<T> rear;

    //========= Queue Constructor ========
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //======= isEmpty ====================
    public boolean isEmpty(){
        return front == null;
    }
    //======= Peek =======================
    public T peek() throws Exception{
        if(front == null){
            throw new Exception("This queue is empty");
        }
        return front.getValue();
    }
    //======= Dequeue ====================
    public T dequeue() throws Exception {
        if(front == null){
            throw new Exception("This queue is empty");
        }
        T returnValue = front.getValue();

        if(front.getNext() != null) {
            front.getNext().setLast(null);
            front = front.getNext();
        }else{
            front = null;
            rear = null;
        }
        return returnValue;
    }

    //======= Enqueue ====================
    public void enqueue(T num){
        Node node = new Node(num);

        if(rear == null){
            front = node;
            rear = node;
        }else {
            node.setLast(rear);
            rear.setNext(node);
            rear = node;
        }
    }

    //======== size ======================
    public int size(){
        Node thisNode = front;
        int length = 0;

        while(thisNode != null){
            length++;
            thisNode = thisNode.getNext();
        }
        return length;
    }

    //======== toString ==================
    public String toString(){
        if(rear == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(Node node){
        if (node.getNext() == null) {
            return String.format("{%d} -> NULL", node.getValue());
        }
        return String.format("{%d} -> ", node.getValue()) + toString(node.getNext());
    }

}
