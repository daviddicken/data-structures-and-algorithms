package repeatedWordTest;

import org.junit.Test;
import repeatedWord.RepeatedWord;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test public void repeatedWordTest() throws Exception {

        RepeatedWord repeatedWord = new RepeatedWord();
        String testString = "This is a test? This. A, and) 'the'";
        String test1 = "Once upon a time, there was a brave princess who...";
        String expected1 = "a";
        String test2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String expected2 = "it";
        String test3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String expected3 = "summer";
        String test4 = "It was it";
        String expected4 = "it";

        //Test that punctuations have been remove from string
        assertEquals("this", repeatedWord.firstDouble(testString));

        // Test that words with capital letters can match all lowercase of the same word
        assertEquals(expected4, repeatedWord.firstDouble(test4));

        // Test to throw exception if string without enough words to compare is passed in
        assertThrows(Exception.class, () -> repeatedWord.firstDouble(""));
        assertThrows(Exception.class, () -> repeatedWord.firstDouble("oneWord"));

        // example test from code challenge
        assertEquals(expected1, repeatedWord.firstDouble(test1));
        assertEquals(expected2, repeatedWord.firstDouble(test2));
        assertEquals(expected3, repeatedWord.firstDouble(test3));
    }
}
