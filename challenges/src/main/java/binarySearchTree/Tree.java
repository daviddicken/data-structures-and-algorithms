package binarySearchTree;

public class Tree {
   private Node root;

   //====== Constructor =========
    public Tree() {this.root = null;}

    //======= Add node =============
    public void addBinaryTreeNode(int value){
        root = addBinaryTreeNode(root, value);
    }
    //------- Helper ---------------
    private Node addBinaryTreeNode(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if (current.getLeftChild() == null){
            current.setLeftChild(new Node(value));
        }else if(current.getRightChild() == null){
            current.setRightChild(new Node(value));
        }else{ //definitely adding nodes multiple times
            // need to fix tomorrow
            addBinaryTreeNode(current.getLeftChild(), value);
            addBinaryTreeNode(current.getRightChild(), value);

        }
        return current;
    }
//Think to sting might not work need to just make a in order method to test with
    //========= In Order toString ===========
    private static String str = "";  // created my string outside, but it doesn't feel right. will look into better implementation.
    public String toString(){
        str = "";                 // needed to reset the string or it would keep concatenating with each toString call
        return toString(root);
    }
    //-------- Helper -------------------
    private static String toString(Node root)
    {
        // base case
        if (root == null) {
            return str;
        }
        toString(root.getLeftChild());
        str += String.format("%s ", root.getValue());
        toString(root.getRightChild());

        return str;
    }


    //======= Getters & Setters ====
    public Node getRoot() { return root; }

    public void setRoot(Node root) { this.root = root; }
}
