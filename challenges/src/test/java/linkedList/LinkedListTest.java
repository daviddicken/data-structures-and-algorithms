package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testTostring()
    {
        LinkedList test = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.listSearch(2);
        test.listSearch(3);

        String expecting = "{2} -> {1} -> NULL";
        assertEquals("Creation of list insertion of nodes and tostring should equal:",expecting, test.toString());
        assertTrue(test.listSearch("Expecting true if number is found:",2));
        assertFalse("Expecting False if number is not in list: ", test.listSearch(3));
    }
}
