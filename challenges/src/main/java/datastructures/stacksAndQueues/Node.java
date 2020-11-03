package datastructures.stacksAndQueues;

public class Node<T> {
    private T value;
    private Node next;
    private Node last;

    public Node(T num) {
        value = num;
        next = null;
        last = null;
    }

    public String toString(){
        return String.format("value = %d", value);
    }

    //=========== Getters & Setters ============

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
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
