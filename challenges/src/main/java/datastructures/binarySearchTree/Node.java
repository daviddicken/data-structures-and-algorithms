package datastructures.binarySearchTree;

public class Node{
    private int value;
    private Node leftChild;
    private Node rightChild;

    //======= Constructor ==============
    public Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    //========= toString ================
    public String toString(){
        String returnString = String.format("%d", value);

        return returnString;
    }

    //========= Getters & Setters =======

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
