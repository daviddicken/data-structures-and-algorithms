package binarySearchTree;

import org.junit.Test;
import static org.junit.Assert.*;

public class binarySearchTreeTest {
    @Test
            public void searchTreeTest() {
        BinarySearchTree testTree = new BinarySearchTree();

        testTree.addNode( 10);
        testTree.addNode( 20);
        testTree.addNode( 6);
        testTree.addNode( 8);

        assertEquals("6 8 10 20 ", testTree.toString());

        testTree.addNode(30);
        testTree.addNode(2);

        assertEquals("2 6 8 10 20 30 ", testTree.toString());

    }

    @Test
    public void binaryTreeTest(){
        Tree testTree = new Tree();

        testTree.addBinaryTreeNode(1);
        testTree.addBinaryTreeNode(2);
        testTree.addBinaryTreeNode(3);
        testTree.addBinaryTreeNode(4);
        testTree.addBinaryTreeNode(5);
        testTree.addBinaryTreeNode(6);
        testTree.addBinaryTreeNode(7);
        testTree.addBinaryTreeNode(8);

        System.out.println(testTree.toString());

    }
}
