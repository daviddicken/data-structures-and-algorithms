package datastructures.binarySearchTree;

public class kTree<T> {
    private kNode root;

    public kTree(kNode root) {
        this.root = root;
    }


    //========= Getters & Setters =====
    public kNode getRoot() { return root; }

    public void setRoot(kNode root) { this.root = root; }


}