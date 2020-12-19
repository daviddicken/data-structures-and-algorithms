package datastructures.stacksAndQueues;

public class Stack<T> {
    public Node<T> top;

    //========== Stack constructor ========
    public Stack() {
        top = null;
    }

    //============ push ====================
    public void push(T value){
        Node node = new Node(value);
        node.setNext(top);

        top = node;
    }

    //========= pop =====================
    public T pop() throws Exception{
        if(top == null) throw new Exception("The stack is empty");

        T returnValue = top.getValue();
        top = top.getNext();
        return returnValue;
    }

    //========= peek ====================
    public T peek() throws Exception {
        if (top == null) throw new Exception("Stack is empty");

        return top.getValue();
    }

    //========= isEmpty ================
    public boolean isEmpty(){
        if(top == null) return true;
        return false;
    }

    //========== toString ================
    public String toString(){
        if(top == null) return "NULL";

        return toString(top); }
    //------------ helper ----------------
    private String toString(Node currentNode){
        if (currentNode.getNext() == null) {
            return String.format("{%d} -> NULL", currentNode.getValue());
        }
        return String.format("{%d} -> ", currentNode.getValue()) + toString(currentNode.getNext());
    }
}
