package utilities;

public class HashNode<T> {
    private T key;
    private T value;
    private HashNode next;
    private HashNode last;

    public HashNode(T key, T value) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.last = last;
    }

    //========== Getters & Setters =========

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    public HashNode getLast() {
        return last;
    }

    public void setLast(HashNode last) {
        this.last = last;
    }
}
