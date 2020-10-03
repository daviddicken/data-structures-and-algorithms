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

        // I have no idea where the null is coming from but happy that i got a readable toString for now
        // need to come back and figure out how to get rid of the null
        assertEquals("6 8 10 20 ", testTree.toString());
//
        testTree.addNode(30);
        testTree.addNode(2);

        assertEquals("2 6 8 10 20 30 ", testTree.toString());

    }
}
