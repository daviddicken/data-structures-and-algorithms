package linkedList;

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

    //============== Link List Zipper Test ===================
    @Test public void textZip(){
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

        LinkedList expected = new LinkedList();
        expected.insertEnd(1);
        expected.insertEnd(2);
        expected.insertEnd(3);
        expected.insertEnd(4);
        expected.insertEnd(5);
        expected.insertEnd(6);
        expected.insertEnd(7);
        expected.insertEnd(8);
        expected.insertEnd(9);
        expected.insertEnd(10);

        LinkedList c = LinkedList.zipLists(a, b);

        LinkedList bFull = new LinkedList();
        bFull.insertEnd(1);
        bFull.insertEnd(3);
        bFull.insertEnd(5);
        bFull.insertEnd(7);
        bFull.insertEnd(9);

        LinkedList oneA = new LinkedList();
        oneA.insertEnd(2);

        LinkedList d = LinkedList.zipLists(oneA, bFull);

        LinkedList oneB = new LinkedList();
        oneB.insertEnd(2);

        LinkedList aFull = new LinkedList();
        aFull.insertEnd(1);
        aFull.insertEnd(3);
        aFull.insertEnd(5);
        aFull.insertEnd(7);
        aFull.insertEnd(9);

        LinkedList e = LinkedList.zipLists(aFull, oneB);

        LinkedList bothOne = new LinkedList();
        bothOne.insertEnd(1);

        LinkedList oneForBoth = new LinkedList();
        oneForBoth.insert(2);
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
