package datastructures.linkedList;

import datastructures.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    //================= Linked List Test =====================
    @Test public void linkedlistTest(){
    // test that we can successfully instantiate an empty linked list
    LinkedList testList = new LinkedList();
    assertEquals("NULL", testList.toString());

    //test that we can insert a new node to linked list
    testList.insert(5);
    assertEquals("{5} ->  NULL", testList.toString());


     // test for inserting multiple nodes
    testList.insert(8);
    testList.insert(12);
    assertEquals("{12} -> {8} -> {5} ->  NULL", testList.toString());

    //test that head pointer points to first node in list (last node to be inserted)
    assertEquals(12, testList.getHead().value);

  // test to see if a value exist or does not exist in a list
        assertTrue(testList.listSearch(8));
        assertFalse(testList.listSearch(9));
    }

    //============== Test inserts ============================
    @Test public void testInserts() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);

        // Test insert after-------------------------
        testList.insertAfter(4, 10);
        String expected = "{5} -> {4} -> {10} -> {3} -> {2} -> {1} ->  NULL";
        assertEquals(expected, testList.toString());

        // Test user receives message when search value is not in ll
        expected = "Search value was not found";
        assertEquals(expected ,testList.insertAfter(15, 200));

        // Test insert before---------------------------
        testList.insertBefore(2, 100);
        expected = "{5} -> {4} -> {10} -> {3} -> {100} -> {2} -> {1} ->  NULL";
        assertEquals(expected, testList.toString());

        // Test user receives message when search value is not in ll
        expected = "Search value was not found";
        assertEquals(expected ,testList.insertBefore(15, 200));
        
        // Test exception is thrown when list is empty
        LinkedList empty = new LinkedList();

        assertThrows(Exception.class, () -> empty.insertBefore(15, 200));
        assertThrows(Exception.class, () -> empty.insertAfter(15, 200));
    }

    //============== Link List Zipper Test ===================
    @Test public void testZip(){
        LinkedList a = new LinkedList();
        a.insertEnd(1);
        a.insertEnd(3);
        a.insertEnd(5);
        a.insertEnd(7);
        a.insertEnd(9);

        LinkedList b = new LinkedList();
        b.insertEnd(2);
        b.insertEnd(4);
        b.insertEnd(6);
        b.insertEnd(8);
        b.insertEnd(10);

        LinkedList c = new LinkedList();
        c.insertEnd(1);
        c.insertEnd(2);
        c.insertEnd(3);
        c.insertEnd(4);
        c.insertEnd(5);
        c.insertEnd(6);
        c.insertEnd(7);
        c.insertEnd(8);
        c.insertEnd(9);
        c.insertEnd(10);

        // test with 5 nodes in each LL
        assertEquals(c.toString(), LinkedList.zipLists(a,b).toString());

        LinkedList bFull = new LinkedList();
        bFull.insertEnd(1);
        bFull.insertEnd(3);
        bFull.insertEnd(5);
        bFull.insertEnd(7);
        bFull.insertEnd(9);

        LinkedList oneA = new LinkedList();
        oneA.insertEnd(2);

        // test with only one node in first LL
        String expected ="{1} -> {2} -> {3} -> {5} -> {7} -> {9} ->  NULL";
        assertEquals(expected, LinkedList.zipLists(oneA, bFull).toString());

        LinkedList oneB = new LinkedList();
        oneB.insertEnd(2);

        LinkedList aFull = new LinkedList();
        aFull.insertEnd(1);
        aFull.insertEnd(3);
        aFull.insertEnd(5);
        aFull.insertEnd(7);
        aFull.insertEnd(9);

        // test with only one node in second LL
        expected = "{1} -> {2} -> {3} -> {5} -> {7} -> {9} ->  NULL";
        assertEquals(expected, LinkedList.zipLists(aFull, oneB).toString());

        LinkedList bothOne = new LinkedList();
        bothOne.insertEnd(1);

        LinkedList oneForBoth = new LinkedList();
        oneForBoth.insert(2);

        // test With only 1 node in each LL
        expected = "{2} -> {1} ->  NULL";
        assertEquals(expected,LinkedList.zipLists(bothOne, oneForBoth).toString() );
    }

    @Test public void testTostring() throws Exception {
        LinkedList test = new LinkedList();
        LinkedList empty = new LinkedList();
        LinkedList even = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.insertEnd(9);
        test.insertEnd(10);

        even.insert(2);
        even.insert(4);
        even.insert(6);
        even.insert(8);
        even.insert(10);

//============= search from end test ====================

        assertEquals(10, test.findFromEnd(0));
        assertEquals(10,test.fromTail(0));
        assertEquals(1, test.findFromEnd(2));
        assertEquals(1,test.fromTail(2));
        assertEquals(2, test.findFromEnd(4));
        assertEquals(2,test.fromTail(4));

        //========== test to find middle ========
        assertEquals(6,even.findMiddleNode());
        assertEquals(1,test.findMiddleNode());
    }
}
