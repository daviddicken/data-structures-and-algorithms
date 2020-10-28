package treeIntersection;

import datastructures.binarySearchTree.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test public void treeIntersectionTest() throws Exception {
        TreeIntersection interTest = new TreeIntersection();
        Tree treeA = new Tree();
        Tree treeB = new Tree();

        treeA.addBinaryTreeNode(150);
        treeA.addBinaryTreeNode(100);
        treeA.addBinaryTreeNode(75);
        treeA.addBinaryTreeNode(160);
        treeA.addBinaryTreeNode(125);
        treeA.addBinaryTreeNode(175);
        treeA.addBinaryTreeNode(250);
        treeA.addBinaryTreeNode(200);
        treeA.addBinaryTreeNode(350);
        treeA.addBinaryTreeNode(300);
        treeA.addBinaryTreeNode(500);

        treeB.addBinaryTreeNode(42);
        treeB.addBinaryTreeNode(100);
        treeB.addBinaryTreeNode(15);
        treeB.addBinaryTreeNode(160);
        treeB.addBinaryTreeNode(125);
        treeB.addBinaryTreeNode(175);
        treeB.addBinaryTreeNode(600);
        treeB.addBinaryTreeNode(200);
        treeB.addBinaryTreeNode(350);
        treeB.addBinaryTreeNode(4);
        treeB.addBinaryTreeNode(500);

        String expected = "[160, 100, 500, 200, 125, 350, 175]";

        // test example trees that were given
        // In place test
        assertEquals(expected, interTest.treeIntersection(treeA, treeB).toString());
        // With hashmap test
        assertEquals(expected, interTest.treeIntersectionWithMap(treeA, treeB).toString());

        treeB.addBinaryTreeNode(500);
        treeA.addBinaryTreeNode(500);

        // More then one pair should still only return one of number in the return set
        assertEquals(expected, interTest.treeIntersection(treeA, treeB).toString());
        assertEquals(expected, interTest.treeIntersectionWithMap(treeA, treeB).toString());

        // test if empty tree is passed in
        Tree treeC = new Tree();

        assertThrows(Exception.class, () -> interTest.treeIntersection(treeC, treeA));
        assertThrows(Exception.class, () -> interTest.treeIntersectionWithMap(treeC, treeA));
        assertThrows(Exception.class, () -> interTest.treeIntersection(treeB, treeC));
        assertThrows(Exception.class, ()-> interTest.treeIntersectionWithMap(treeB, treeC));
        assertThrows(Exception.class, () -> interTest.treeIntersection(treeC, treeC));
        assertThrows(Exception.class, () -> interTest.treeIntersectionWithMap(treeC, treeC));

        // test if no matches are found
        treeC.addBinaryTreeNode(2);

        assertEquals("[]", interTest.treeIntersection(treeA, treeC).toString());
        assertEquals("[]", interTest.treeIntersectionWithMap(treeA,treeC).toString());

    }
}
