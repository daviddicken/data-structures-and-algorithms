package binarySearchTree;

import org.junit.Test;
import static org.junit.Assert.*;

public class binarySearchTreeTest {
    @Test
            public void searchTreeTest() throws Exception {

        // Can successfully instantiate an empty tree
        BinarySearchTree testTree = new BinarySearchTree();
        assertEquals("", testTree.toString());

        // Can successfully instantiate a tree with a single root node
        testTree.addNode( 10);
        assertEquals(10, testTree.getRoot().getValue());

        // Successfully place a larger value in the right child
        testTree.addNode( 20);
        assertEquals(20, testTree.getRoot().getRightChild().getValue());

        //Successfully place smaller value in left node
        testTree.addNode( 6);
        assertEquals(6, testTree.getRoot().getLeftChild().getValue());

        //again
        testTree.addNode(4);
        assertEquals(4, testTree.getRoot().getLeftChild().getLeftChild().getValue());

        //add some more
        testTree.addNode(30);
        testTree.addNode(2);
        testTree.addNode(15);
        testTree.addNode(25);
        testTree.addNode(12);

        // Get the collection
        assertEquals("[2, 4, 6, 10, 12, 15, 20, 25, 30]", testTree.inOrder().toString());

        //test contains
        assertTrue(testTree.contains(30));
        assertTrue(testTree.contains(2));
        assertTrue(testTree.contains(12));
        assertFalse(testTree.contains(0));
        assertFalse(testTree.contains(35));
        assertFalse(testTree.contains(8));
    }

    @Test
    public void binaryTreeTest(){

        // Can successfully instantiate an empty tree
        Tree testTree = new Tree();
        assertEquals("[]", testTree.inOrder().toString());

        // Can successfully instantiate a tree with a single root node
        testTree.addBinaryTreeNode( 1);
        assertEquals(1, testTree.getRoot().getValue());

        // Can successfully add a left child and right child to a single root node
        testTree.addBinaryTreeNode(2);
        testTree.addBinaryTreeNode(3);
        assertEquals(2, testTree.getRoot().getLeftChild().getValue());
        assertEquals(3, testTree.getRoot().getRightChild().getValue());

        // Can successfully return a collection from a preorder, inorder, and postorder traversal's
        testTree.addBinaryTreeNode(4);
        testTree.addBinaryTreeNode(5);
        testTree.addBinaryTreeNode(6);
        assertEquals("[1, 2, 4, 5, 3, 6]", testTree.preOrder().toString());
        assertEquals("[4, 2, 5, 1, 6, 3]", testTree.inOrder().toString());
        assertEquals("[4, 5, 2, 6, 3, 1]", testTree.postOrder().toString());

    }
}