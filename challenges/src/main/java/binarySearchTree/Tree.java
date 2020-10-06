package binarySearchTree;

import utilities.Q;
import java.util.ArrayList;

public class Tree {
    ArrayList<Integer> arrBuild = new ArrayList<>();
    private Node root;
    public int max;

    //====== Constructor ==============
    public Tree() {
        this.root = null;
    }

    //======= Find Max ==================
    public int findMaxValue() throws Exception {
        if(root != null){
           max = root.getValue();       //set max to root's value then pass root to the helper
           return findMaxValue(root);
        }
       // throw null pointer exception
        throw new NullPointerException("This tree is empty");
    }
    //------- Helper --------------------
    private int findMaxValue(Node current){
        // Base                             // when a null node is reached return max to start stepping back through the recursive
        if(current == null){                // calls on the stack
            return max;                     // If all leaves have been reached and the call stack depleted, return max
        }

        if(current.getValue() > max){       //check value and set to max if it is greater
            max = current.getValue();
        }
        findMaxValue(current.getLeftChild());  // recursively move down the left side of tree
        findMaxValue(current.getRightChild()); // then the right side

        return max;
    }

    //======= Add node ==================
    //https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/
    public void addBinaryTreeNode( int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        //---------- Helper --------------
        Node current = root;
        Q<Node> nodeQ = new Q<>();    // Q to hold nodes as I work through the tree
        nodeQ.enqueueToBack(current); // Place current node in Q

        while (!nodeQ.isEmpty()) {
            current = nodeQ.peek();   // Set current node to node at front of Q
            nodeQ.dequeueFromFront(); // Remove that node from Q

            if (current.getLeftChild() == null) {       // if left child is empty place
                current.setLeftChild(new Node(value));  // set left child to new node
                break;                                  // exit
            } else {                                    // if left child has node place node in back of Q
                nodeQ.enqueueToBack(current.getLeftChild());
            }

            if (current.getRightChild() == null) {      // if let node was empty check if right node is empty
                current.setRightChild(new Node(value)); // set right node to new node if it was empty
                break;                                  // exit
            } else {
                nodeQ.enqueueToBack(current.getRightChild()); //if right node has node place it in the back of the Q
            }
        }
    }

    //=========== toArray ==========================
    public Integer[] toArray(ArrayList<Integer> list) throws Exception {
        if(list == null){
            throw new Exception("List given passed into toArray was empty");
        }
        return list.toArray(new Integer[0]);
    }

    //=========== pre order ========================
    public ArrayList preOrder(){

        arrBuild = new ArrayList<>();
        return preOrder(root);
    }
    //----------- Helper --------------------------
    private ArrayList preOrder(Node node) {

        if (node == null) {
            return arrBuild;
        }
        arrBuild.add(node.getValue());
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());

        return arrBuild;
    }

    //=========== post order =======================
    public ArrayList postOrder(){

        arrBuild = new ArrayList<>();
        return postOrder(root);
    }
    //----------- Helper --------------------------
    private ArrayList postOrder(Node node) {

        if (node == null) {
            return arrBuild;
        }

        postOrder(node.getLeftChild());
        postOrder(node.getRightChild());
        arrBuild.add(node.getValue());

        return arrBuild;
    }

    //=========== in order =========================
    public ArrayList inOrder(){

        arrBuild = new ArrayList<>();
        return inOrder(root);
    }
    //----------- Helper --------------------------
    private ArrayList inOrder(Node node) {

        if (node == null) {
            return arrBuild;
        }

        inOrder(node.getLeftChild());
        arrBuild.add(node.getValue());
        inOrder(node.getRightChild());

        return arrBuild;
    }

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
