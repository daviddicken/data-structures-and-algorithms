package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testLinkedList()
    {
        LinkedList test = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.listSearch(2);
        test.listSearch(3);

        String expecting = "{2} -> {1} -> NULL";
        assertEquals(expecting, test.toString());
        assertTrue(test.listSearch(2));
        assertFalse("Expecting False: ", test.listSearch(3));
    }
}
