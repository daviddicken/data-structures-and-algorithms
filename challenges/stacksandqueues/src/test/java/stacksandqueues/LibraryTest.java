/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testNode() {
        Node four = new Node(4);
        Node five = new Node(5);

        //test node creations, tooString and getValue
        assertEquals("value = 4", four.toString());
        assertEquals(4, four.getValue());
        assertEquals("value = 5", five.toString());
        assertEquals(5, five.getValue());
        //test setValue
        five.setValue(6);
        assertEquals(6, five.getValue());
        five.setValue(7);
        assertEquals(7, five.getValue());
    }

    @Test
    public void testStack() {
        Stack testStack = new Stack();
        Stack emptyStack = new Stack();

        testStack.push(4);
        testStack.push(8);
        testStack.push(16);

        //toString test
        assertEquals("{16} -> {8} -> {4} -> NULL", testStack.toString());
        //push test
        testStack.push(32);
        assertEquals("{32} -> {16} -> {8} -> {4} -> NULL", testStack.toString());
        //empty stack test
        assertEquals("NULL", emptyStack.toString());
    }

    @Test
    public void testPop() throws Exception {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        assertEquals("{3} -> {2} -> {1} -> NULL", testStack.toString());
        testStack.pop();
        assertEquals("{2} -> {1} -> NULL", testStack.toString());
    }

    @Test
    public void testPeek() throws Exception {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        //peek and pop test
        assertEquals(3, testStack.peek());
        assertEquals(3, testStack.pop());
        assertEquals(2, testStack.pop());
        assertEquals(1, testStack.peek());
    }

    @Test
    public void testIsEmpty() {
        Stack emptyStack = new Stack();
        Stack oneNode = new Stack();
        oneNode.push(1);

        assertFalse(oneNode.isEmpty());
        assertTrue(emptyStack.isEmpty());
    }

    @Test
    public void testEnqueue() throws Exception {
        Queue testQ = new Queue();
        testQ.enqueue(1);
        testQ.enqueue(2);

        //test for toString, enqueue, size
        assertEquals("{1} -> {2} -> NULL", testQ.toString());
        assertEquals(2, testQ.size());

        testQ.enqueue(3);
        assertEquals("{1} -> {2} -> {3} -> NULL", testQ.toString());
        assertEquals(3, testQ.size());

        //dequeue test
        assertEquals(3, testQ.size());
        assertEquals(1, testQ.dequeue());
        assertEquals(2, testQ.size());
        assertEquals("{2} -> {3} -> NULL", testQ.toString());
        assertEquals(2, testQ.dequeue());
        assertEquals(1, testQ.size());
        assertEquals("{3} -> NULL", testQ.toString());

        //peek test
        testQ.enqueue(5);
        assertEquals(3, testQ.peek());
        testQ.dequeue();
        assertEquals(5, testQ.peek());

        //isEmpty test
        assertFalse(testQ.isEmpty());
        assertEquals(1, testQ.size());
        testQ.dequeue();
        assertEquals(0, testQ.size());
        assertTrue(testQ.isEmpty());
    }

}