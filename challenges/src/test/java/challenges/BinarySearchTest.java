package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        BinarySearch searchTest = new BinarySearch();
        int[] testArr = {1,2,3,4,5,6};
        int[] emptyArr = {};

        int[] bigArr = new int[1000000];



        assertEquals(2, searchTest.indexSearch(testArr, 3));
        assertEquals(5, searchTest.indexSearch(testArr, 6));
        assertEquals(-1, searchTest.indexSearch(testArr, 8));
        assertEquals(-1, searchTest.indexSearch(emptyArr, 3));
    }
}
