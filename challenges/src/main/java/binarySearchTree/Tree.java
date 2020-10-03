package binarySearchTree;

import utilities.Q;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class Tree {
    private Node root;

    //====== Constructor =========
    public Tree() {
        this.root = null;
    }

    //======= Add node =============
    //https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/
    public void addBinaryTreeNode(Node current, int value) {
        if (current == null) {
            root = new Node(value);
            return;
        }
        Q<Node> nodeQ = new Q<Node>();
        nodeQ.enqueueToBack(current);

        while (!nodeQ.isEmpty()) {
            current = nodeQ.peek();
            nodeQ.dequeueFromFront();

            if (current.getLeftChild() == null) {
                current.setLeftChild(new Node(value));
                break;
            } else {
                nodeQ.enqueueToBack(current.getLeftChild());
            }

            if (current.getRightChild() == null) {
                current.setRightChild(new Node(value));
                break;
            } else {
                nodeQ.enqueueToBack(current.getRightChild());
            }
        }
    }

    //=========== pre order ========================
    ArrayList<Integer> arrBuild = new ArrayList<>();
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


//        Q tempQ = new Q();System.out.println(tempQ.toString());
//
//        int[] treeArr = new int[tempQ.size()];
//        for(int i =0; i < tempQ.size(); i++){
//            treeArr
//            treeArr[i] = (int)tempQ.dequeueFromFront();
//            System.out.println(treeArr[i]);
//        }
//        treeArr.
//    return treeArr;
//    }


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
