package treeIntersection;

import datastructures.binarySearchTree.Node;
import datastructures.binarySearchTree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class TreeIntersection extends Tree{

    // This was not the best possible, but I wanted to see if I could get it to work

    HashSet theSet;
    Tree searchTree;

    public HashSet treeIntersection(Tree treeA, Tree treeB) throws Exception {
        // This was Pauls great idea to add the or statement to the base case so I didn't have to traverse through the array when a match was found
        if(treeA.getRoot().equals(null) || treeB.getRoot().equals(null)){
            throw new NullPointerException("A tree is empty");
        }

        theSet = new HashSet();
        searchTree = treeB;

        return treeIntersection(treeA.getRoot());
    }
    //----------- Helper --------------------------
    private HashSet treeIntersection(Node node) throws Exception {

        if (node == null) {
            return theSet;
        }

        if(searchTree.contains(node.getValue())){
            theSet.add(node.getValue());
        }
        treeIntersection(node.getLeftChild());
        treeIntersection(node.getRightChild());

        return theSet;
    }

    //=============== With HashMap ===============
    HashMap searchMap;

    public HashSet treeIntersectionWithMap(Tree treeA, Tree treeB) throws Exception {
        if(treeA.getRoot().equals(null) || treeB.getRoot().equals(null)){
            throw new NullPointerException("A tree is empty");
        }

        theSet = new HashSet();
        searchMap = treeB.preOrderHash();

        return treeIntersectionWithMap(treeA.getRoot());
    }
    //----------- Helper --------------------------
    private HashSet treeIntersectionWithMap(Node node) throws Exception {

        if (node == null) {
            return theSet;
        }

        if(searchMap.containsKey(node.getValue())){
            theSet.add(node.getValue());
        }
        treeIntersection(node.getLeftChild());
        treeIntersection(node.getRightChild());

        return theSet;
    }
}
