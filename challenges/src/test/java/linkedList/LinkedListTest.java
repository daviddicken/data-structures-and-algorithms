package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void textZip(){
//        LinkedList a = new LinkedList();
//        a.insertEnd(1);
//        a.insertEnd(3);
//        a.insertEnd(5);
//        a.insertEnd(7);
//        a.insertEnd(9);
//
//        LinkedList b = new LinkedList();
//        b.insertEnd(2);
//        b.insertEnd(4);
//        b.insertEnd(6);
//        b.insertEnd(8);
//        b.insertEnd(10);
//
//        LinkedList c = LinkedList.zipLists(a, b);

        //System.out.println(c);

        LinkedList aFull = new LinkedList();
        aFull.insertEnd(1);
        aFull.insertEnd(3);
        aFull.insertEnd(5);
        aFull.insertEnd(7);
        aFull.insertEnd(9);

        LinkedList oneB = new LinkedList();
        oneB.insertEnd(2);

// test failing when a has just one node and b has multiple
        LinkedList d = LinkedList.zipLists(oneB, aFull);
        System.out.println(d);


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
        //test.listSearch(2);
        //test.listSearch(3);
        //test.insertBefore(9, 8);
        //empty.insertBefore(12, 3);
        //test.insertAfter(2,3);
//============= search from end test ====================
        //assertThrows(test.findFromEnd(1000));
        //assertEquals("Your link list is shorter then your search value", test.findFromEnd(100));

        assertEquals(10, test.findFromEnd(0));
        assertEquals(10,test.fromTail(0));
        assertEquals(1, test.findFromEnd(2));
        assertEquals(1,test.fromTail(2));
        assertEquals(2, test.findFromEnd(4));
        assertEquals(2,test.fromTail(4));

        //========== test to find middle ========
        assertEquals(6,even.findMiddleNode());
        assertEquals(1,test.findMiddleNode());

        System.out.println(test);
        //System.out.println(empty.findMiddleNode());
        System.out.println("From the end: " + test.findFromEnd(0));
        System.out.println("From the back: " + test.fromTail(3));
       // String expecting = "{2} -> {1} -> NULL";
//        assertEquals("Creation of list insertion of nodes and tostring should equal:",expecting, test.toString());
//        assertTrue(test.listSearch("Expecting true if number is found:",2));
//        assertFalse("Expecting False if number is not in list: ", test.listSearch(3));
    }

    private void assertThrows(int fromEnd) {
    }
}
