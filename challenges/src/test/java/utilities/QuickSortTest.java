package utilities;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void sortTest(){
        QuickSort testing = new QuickSort();

        int[] empty = {};
        int[] test1 = {8,4,23,42,16,15};
        int[] expected1 = {4,8,15,16,23,42};
        int[] test2 = {20, 18,12,8,5,-2};
        int[] expected2 = {-2,5,8,12,18,20};
        int[] test3 = {5,12,7,5,5,7};
        int[] expected3 = {5,5,5,7,7,12};
        int[] test4 = {2,3,5,7,13,11};
        int[] expected4 = {2,3,5,7,11,13};


        //test for a empty array passed in
        assertArrayEquals(empty, empty);

        // test on sample array
        assertArrayEquals(expected1, testing.quickSort(test1));

        // reverse sorted test
        assertArrayEquals(testing.quickSort(test2), expected2);

        // test with duplicate int's
        assertArrayEquals(testing.quickSort(test3), expected3);

        // nearly sorted test
        assertArrayEquals(testing.quickSort(test4), expected4);

        // already sorted
        assertArrayEquals(testing.quickSort(expected4), expected4);

    }
}