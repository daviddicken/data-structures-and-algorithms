package challenges;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
}
    @Test
    public void testArrayShift() {
        ArrayShift testPotato = new ArrayShift();
        int[] orgArr = {11,12,13,14};
        int[] secondArr = {11,12,13,14,15};

        int value = 7;
        int secondVal = 0;

        int[] newArr = testPotato.arrayShift(orgArr, value);
        int[] anotherArr = testPotato.arrayShift(secondArr, secondVal);
        assertEquals(7, newArr[2]);
        assertEquals(0, anotherArr[3]);

    }
}
