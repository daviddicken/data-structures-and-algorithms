package binarySearchTree;

class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    //https://www2.hawaii.edu/~esb/2011fall.ics211/BinarySearchTree.java.html
    //======== Add Node =================
    public void addNode(int value) {
        root = addNode(root, value);
    }
    //------------- helper -------------
    private Node addNode(Node current, int value){
        if (current == null){
            return new Node(value);
        }

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
