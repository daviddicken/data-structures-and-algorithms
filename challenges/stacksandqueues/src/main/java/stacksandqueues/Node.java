package stacksandqueues;

public class Node {
        private int value;
        private Node next;

        public Node(int num) {
            value = num;
            next = null;
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
}
