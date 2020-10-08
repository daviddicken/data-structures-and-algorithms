package utilities;

import binarySearchTree.Node;
import binarySearchTree.Tree;

public class FizzBuzzTree<T> {
    private gTreeNode root;

    //========== Constructor =========
    public FizzBuzzTree() {
        this.root = root;
    }

    //========== Add to Tree ==========
    public void addNode( T value) {
        if (root == null) {
            root = new gTreeNode(value);
            return;
        }
        gTreeNode current = root;
        Q<gTreeNode> nodeQ = new Q<>();    // Q to hold nodes as I work through the tree
        nodeQ.enqueueToBack(current); // Place current node in Q

        while (!nodeQ.isEmpty()) {
            current = nodeQ.peek();   // Set current node to node at front of Q
            nodeQ.dequeueFromFront(); // Remove that node from Q

            if (current.getLeft() == null) {       // if left child is empty place
                current.setLeft(new gTreeNode(value));  // set left child to new node
                break;                                  // exit
            } else {                                    // if left child has node place node in back of Q
                nodeQ.enqueueToBack(current.getLeft());
            }

            if (current.getRight() == null) {      // if let node was empty check if right node is empty
                current.setRight(new gTreeNode(value)); // set right node to new node if it was empty
                break;                                  // exit
            } else {
                nodeQ.enqueueToBack(current.getRight()); //if right node has node place it in the back of the Q
            }
        }
    }



    //========== Getters & Setters ===

    public gTreeNode getRoot() {
        return root;
    }

    public void setRoot(gTreeNode root) {
        this.root = root;
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        FizzBuzzTree.str = str;
    }

    //========== FIZZ BUZZ ============
    FizzBuzzTree<String> newtree = new FizzBuzzTree<>();
    public FizzBuzzTree<String> fizzbuzz(FizzBuzzTree<Integer> inTree, FizzBuzzTree<String> newtree) {
        if (inTree.getRoot() == null) {
            throw new NullPointerException();
        }
        newtree = new FizzBuzzTree<>();

        return fizzbuzz(inTree.getRoot(), newtree.getRoot());
    }
    //-------------Helper ---------------
    private FizzBuzzTree<String> fizzbuzz(gTreeNode currentIn, gTreeNode outNode){

        if (currentIn == null){
            return newtree;
        }

        if((int)currentIn.getValue() % 5 == 0 & (int)currentIn.getValue() % 3 == 0){
            outNode.setValue("FizzBuzz");
        }else if ((int)currentIn.getValue() % 5 == 0){
            outNode.setValue("Buzz");
        }else if((int)currentIn.getValue() % 3 == 0){
            outNode.setValue("Fizz");
        }else{
            outNode.setValue(currentIn.getValue().toString());
        }

        gTreeNode newNode = new gTreeNode("new");
        outNode.setLeft(newNode);
        fizzbuzz(currentIn.getLeft(),outNode.getLeft());
        gTreeNode newRigthNode = new gTreeNode("new");
        outNode.setRight(newRigthNode);
        fizzbuzz(currentIn.getRight(),outNode.getRight());

        return newtree;
    }






    //======== toString ==============
    private static String str = "";  // created my string outside, but it doesn't feel right. will look into better implementation.
    public String toString(){
        str = "";                 // needed to reset the string or it would keep concatenating with each toString call
        return toString(root);
    }
    //-------- Helper -------------------
    private static String toString(gTreeNode root)
    {
        // base case
        if (root == null) {
            return str;
        }
        toString(root.getLeft());
        str += String.format("%s ", root.getValue());
        toString(root.getRight());

        return str;
    }
}
