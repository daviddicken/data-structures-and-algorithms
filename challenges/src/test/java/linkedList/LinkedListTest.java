package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testTostring()
    {
        LinkedList test = new LinkedList();
        LinkedList empty = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.insertEnd(9);
        test.insertEnd(10);
        //test.listSearch(2);
        //test.listSearch(3);
        //test.insertBefore(9, 8);
        //empty.insertBefore(12, 3);
        test.insertAfter(2,3);
        System.out.println(test);
        String expecting = "{2} -> {1} -> NULL";
//        assertEquals("Creation of list insertion of nodes and tostring should equal:",expecting, test.toString());
//        assertTrue(test.listSearch("Expecting true if number is found:",2));
//        assertFalse("Expecting False if number is not in list: ", test.listSearch(3));
    }
}
