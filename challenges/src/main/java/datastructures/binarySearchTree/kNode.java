package datastructures.binarySearchTree;

public class kNode<T> {

    private T value;
    private Node rightChild;
    private Node midChild;
    private Node leftChild;

    //========== Constructor ===============
    public kNode(T value) {
        this.value = value;
        this.rightChild = null;
        this.midChild = null;
        this.leftChild = null;
    }

    //========== tostring ==================
    public String toString(){
        String returnString = String.format("%d", value);

        return returnString;
    }

    //========== Getters & Setters =========
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getMidChild() {
        return midChild;
    }

    public void setMidChild(Node midChild) {
        this.midChild = midChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
}
