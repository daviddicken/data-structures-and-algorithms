package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

    @Test
    public void testBoring() {
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(1, new int[]{}));
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(30, new int[]{}));
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(88, new int[]{}));
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(97, new int[]{}));
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(7382, new int[]{}));
        assertEquals("Should handle boring numbers", 0, CarMileage.isInteresting(99919911, new int[]{}));
    }

    @Test
    public void testOrderedBoring() {
        assertEquals("Should handle ordered yet still boring numbers", 0, CarMileage.isInteresting(7540, new int[]{}));
        assertEquals("Should handle ordered yet still boring numbers", 0, CarMileage.isInteresting(1590, new int[]{}));
    }

    @Test
    public void testBigNumbers() {
        assertEquals("Should handle big numbers", 2, CarMileage.isInteresting(100, new int[]{}));
        assertEquals("Should handle big numbers", 2, CarMileage.isInteresting(7000, new int[]{}));
        assertEquals("Should handle big numbers", 2, CarMileage.isInteresting(800000, new int[]{}));
    }

    @Test
    public void testMonotone() {
        assertEquals("Should handle monotone numbers", 2, CarMileage.isInteresting(111, new int[]{}));
        assertEquals("Should handle monotone numbers", 2, CarMileage.isInteresting(444, new int[]{}));
        assertEquals("Should handle monotone numbers", 2, CarMileage.isInteresting(9999999, new int[]{}));
    }

    @Test
    public void testAwesomePhrases() {
        assertEquals("Should handle awesome phrases", 2, CarMileage.isInteresting(1337, new int[]{1337,256}));
        assertEquals("Should handle awesome phrases", 2, CarMileage.isInteresting(80085, new int[]{80085}));
        assertEquals("Should handle awesome phrases", 2, CarMileage.isInteresting(256, new int[]{1337,256,376006}));
    }

    @Test
    public void testPalindrome() {
        assertEquals("Should handle palindromic numbers", 2, CarMileage.isInteresting(101, new int[]{}));
        assertEquals("Should handle palindromic numbers", 2, CarMileage.isInteresting(11011, new int[]{}));
        assertEquals("Should handle palindromic numbers", 2, CarMileage.isInteresting(7473747, new int[]{}));
    }

    @Test
    public void testIncrementing() {
        assertEquals("Should handle incrementing sequences", 2, CarMileage.isInteresting(123, new int[]{}));
        assertEquals("Should handle incrementing sequences", 2, CarMileage.isInteresting(1234, new int[]{}));
        assertEquals("Should handle incrementing sequences", 2, CarMileage.isInteresting(67890, new int[]{}));
        assertEquals("Should handle incrementing sequences", 2, CarMileage.isInteresting(234567890, new int[]{}));
    }

    @Test
    public void testDecrementing() {
        assertEquals("Should handle decrementing sequences", 2, CarMileage.isInteresting(3210, new int[]{}));
        assertEquals("Should handle decrementing sequences", 2, CarMileage.isInteresting(654, new int[]{}));
        assertEquals("Should handle decrementing sequences", 2, CarMileage.isInteresting(8765, new int[]{}));
        assertEquals("Should handle decrementing sequences", 2, CarMileage.isInteresting(987654321, new int[]{}));
    }

    @Test
    public void testUpcomingBigNumbers() {
        assertEquals("Should handle upcoming big numbers", 1, CarMileage.isInteresting(98, new int[]{}));
        assertEquals("Should handle upcoming big numbers", 1, CarMileage.isInteresting(99, new int[]{}));
        assertEquals("Should handle upcoming big numbers", 1, CarMileage.isInteresting(6998, new int[]{}));
        assertEquals("Should handle upcoming big numbers", 1, CarMileage.isInteresting(799999, new int[]{}));
    }

    @Test
    public void testUpcomingMonotone() {
        assertEquals("Should handle upcoming monotone numbers", 1, CarMileage.isInteresting(109, new int[]{}));
        assertEquals("Should handle upcoming monotone numbers", 1, CarMileage.isInteresting(110, new int[]{}));
        assertEquals("Should handle upcoming monotone numbers", 1, CarMileage.isInteresting(442, new int[]{}));
        assertEquals("Should handle upcoming monotone numbers", 1, CarMileage.isInteresting(9999997, new int[]{}));
    }

    @Test
    public void testUpcomingAwesomePhrases() {
        assertEquals("Should handle upcoming awesome phrases", 1, CarMileage.isInteresting(1335, new int[]{1337,256}));
        assertEquals("Should handle upcoming awesome phrases", 1, CarMileage.isInteresting(255, new int[]{1337,256}));
        assertEquals("Should handle upcoming awesome phrases", 1, CarMileage.isInteresting(80083, new int[]{80085}));
        assertEquals("Should handle upcoming awesome phrases", 1, CarMileage.isInteresting(254, new int[]{1337,256,376006}));
    }

    @Test
    public void testUpcomingPalindrome() {
        assertEquals("Should handle upcoming palindromic numbers", 1, CarMileage.isInteresting(119, new int[]{}));
        assertEquals("Should handle upcoming palindromic numbers", 1, CarMileage.isInteresting(120, new int[]{}));
        assertEquals("Should handle upcoming palindromic numbers", 1, CarMileage.isInteresting(7473745, new int[]{}));
    }

    @Test
    public void testUpcomingIncrementing() {
        assertEquals("Should handle upcoming incrementing sequences", 1, CarMileage.isInteresting(122, new int[]{}));
        assertEquals("Should handle upcoming incrementing sequences", 1, CarMileage.isInteresting(1232, new int[]{}));
        assertEquals("Should handle upcoming incrementing sequences", 1, CarMileage.isInteresting(67888, new int[]{}));
        assertEquals("Should handle upcoming incrementing sequences", 1, CarMileage.isInteresting(234567889, new int[]{}));
    }

    @Test
    public void testUpcomingDecrementing() {
        assertEquals("Should handle upcoming decrementing sequences", 1, CarMileage.isInteresting(3208, new int[]{}));
        assertEquals("Should handle upcoming decrementing sequences", 1, CarMileage.isInteresting(3209, new int[]{}));
        assertEquals("Should handle upcoming decrementing sequences", 1, CarMileage.isInteresting(987654319, new int[]{}));
        assertEquals("Should handle upcoming decrementing sequences", 1, CarMileage.isInteresting(987654320, new int[]{}));
    }

}
