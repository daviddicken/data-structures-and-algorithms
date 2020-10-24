package hastableTest;

import hashtable.Hashtable;
import org.junit.Test;

public class HashtableTest {

    @Test public void hashtableTest(){
        int [] test = new int[20];

        Hashtable testHash = new Hashtable(test);

        System.out.println(testHash.hash("abcd"));
    }
}
