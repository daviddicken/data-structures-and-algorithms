package datastructures.binarySearchTree;

import java.util.ArrayList;

class BinarySearchTree {
    ArrayList<Integer> arrBuild = new ArrayList<>();
    private Node root;

    //====== Constructor ===============
    public BinarySearchTree() {
        this.root = null;
    }

    //=========== in order =========================
    public ArrayList inOrder(){

        arrBuild = new ArrayList<>(); // Reset ArrayList everytime inOrder is called
        return inOrder(root);         // Pass root to inOrder helper method
    }
    //----------- Helper --------------------------
    private ArrayList inOrder(Node node) {

        if (node == null) {return arrBuild;} // if tree is empty return an empty array list

        inOrder(node.getLeftChild());  // Recursively traverse through tree
        arrBuild.add(node.getValue()); // adding the left child values then the right child values to the array list
        inOrder(node.getRightChild());

        return arrBuild;
    }

    //======== Contains =================
    public boolean contains (int value) throws Exception {
        if(root == null){
            throw new Exception("This tree is empty"); // if tree empty throw exception
        }
        return inOrder(root).contains(value); // call in order to get an array list of tree. Then check if array contains
    }                                         // search value

    //https://www2.hawaii.edu/~esb/2011fall.ics211/BinarySearchTree.java.html
    //======== Add Node =================
    public void addNode(int value) {
        root = addNode(root, value); //send in root to recursively traverse through tree
    }
    //------------- helper -------------
    private Node addNode(Node current, int value){
        // Base case
        if (current == null){
            return new Node(value); // if empty child is reached set child to new node
        }
            // if new node value is less the current node value recursively traverse to the left child if greater go right
        if(current.getValue() > value){
          current.setLeftChild(addNode(current.getLeftChild(), value));
        }else{
            current.setRightChild(addNode(current.getRightChild(), value));
        }
        return current;
    }

    // https://medium.com/javarevisited/how-to-print-nodes-of-a-binary-search-tree-in-sorted-order-8a4e52eb8856
    //======== toString In Order ========
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

    //======== Getter & Setter ==========

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
