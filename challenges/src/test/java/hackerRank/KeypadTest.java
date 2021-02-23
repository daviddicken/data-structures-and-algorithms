package hackerRank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KeypadTest {
    @Test
    public void test(){
        Keypad keypadTest = new Keypad();
        String[] locks = new String[]{"storpe","xyzlve","dgaotc"};
        String[] words = new String[]{"stop", "stops", "store", "stores","tops", "top", "pot", "pots", "dog", "cat"};
        int[] expected = new int[]{6,0,1};

        assertArrayEquals(expected, keypadTest.CheckFirst(locks, words));
    }

    @Test
    public void testList(){
        Keypad keypadTest = new Keypad();
        List<String> keypads = Arrays.asList("storpe","xyzlve","dgaotc");
        List<String> words = Arrays.asList("stop", "stops", "store", "stores","tops", "top", "pot", "pots", "dog", "cat");
        List<Integer> expected = new ArrayList<>(Arrays.asList(6,0,1));

        List<Integer> actual = keypadTest.WithMap(keypads, words);
        for(int i = 0; i < expected.size(); i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
