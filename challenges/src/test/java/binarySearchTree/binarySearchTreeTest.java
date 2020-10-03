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
        Tree emptyTree = new Tree();

        testTree.addBinaryTreeNode(testTree.getRoot(), 1);
        testTree.addBinaryTreeNode(testTree.getRoot(), 2);
        testTree.addBinaryTreeNode(testTree.getRoot(), 3);
        testTree.addBinaryTreeNode(testTree.getRoot(), 4);
        testTree.addBinaryTreeNode(testTree.getRoot(), 5);
        testTree.addBinaryTreeNode(testTree.getRoot(), 6);

        //in order test
        assertEquals("[4, 2, 5, 1, 6, 3]", testTree.inOrder().toString());
        testTree.addBinaryTreeNode(testTree.getRoot(), 7);
        assertEquals("[4, 2, 5, 1, 6, 3, 7]", testTree.inOrder().toString());

        //assertEquals("[]", emptyTree.inOrder().toString());

        System.out.println("PreOrder: " + testTree.preOrder().toString());
        System.out.println("InOrder: " + testTree.inOrder().toString());
        System.out.println("PostOrder: " + testTree.postOrder().toString());

    }
}
