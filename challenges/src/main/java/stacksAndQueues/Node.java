package stacksAndQueues;

public class Node {
    private int value;
    private Node next;
    private Node last;

    public Node(int num) {
        value = num;
        next = null;
        last = null;
    }

    public String toString(){
        return String.format("value = %d", value);
    }

    //=========== Getters & Setters ============

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
