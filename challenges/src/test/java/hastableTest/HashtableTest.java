package hastableTest;

import hashtable.Hashtable;
import org.junit.Test;
import static org.junit.Assert.*;



import java.util.ArrayList;


public class HashtableTest {

    @Test public void hashtableTest() throws Exception {

        ArrayList[] test = new ArrayList[20];
        Hashtable testHash = new Hashtable(test);

        // My kids helped me with these key value pairs. They were awesome rubber duckies :)
        testHash.add("abc", "Bob");
        testHash.add("notBob" , "Sally");
        testHash.add("bobby" , "Dad");
        testHash.add("BLOCK" , "Elena");
        testHash.add("pumpkin" , "doggy");
        testHash.add("picture" , "Mr. Poop");
        testHash.add("Samuel" , "Samuel");
        testHash.add("Breanah" , "Breanah");
        testHash.add("Allyshia" , "Ally");
        testHash.add("Mom" , "Mom");
        testHash.add("toilet", "Mrs. Poop");


        // Test that contains returns true or false if key exist or not & test add
        assertFalse(testHash.contains("addTest"));
        testHash.add("addTest", "done");
        assertTrue(testHash.contains("addTest"));

        // Test for exception if user tries to add a key that already exist
        assertThrows(Exception.class, () -> testHash.add("addTest", "not again"));

        // Test getValue
        assertEquals("done", testHash.getValue("addTest"));
        // if key doesn't exist
        assertEquals("Key not found", testHash.getValue("doesntExist"));

    }
}
