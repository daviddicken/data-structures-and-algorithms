package utilities;

public class gTreeNode<T> {
    private T value;
    private gTreeNode<T> left;
    private gTreeNode<T> right;

    public gTreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    //========= toString ===========================
    public String toString(){
        String returnString = "value = " + value;

        //return String.format("value = %T", value);
        return returnString;
    }

    //========= Getters & Setters ==================

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public gTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(gTreeNode<T> left) {
        this.left = left;
    }

    public gTreeNode<T> getRight() {
        return right;
    }

    public void setRight(gTreeNode<T> right) {
        this.right = right;
    }
}
