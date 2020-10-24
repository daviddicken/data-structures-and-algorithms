package hastableTest;

import hashtable.Hashtable;
import linkedList.LinkedList;
import org.junit.Test;

import java.util.ArrayList;

public class HashtableTest {

    @Test public void hashtableTest() throws Exception {

        ArrayList[] test = new ArrayList[20];
        Hashtable testHash = new Hashtable(test);

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



        System.out.println("testHash" + testHash);
        //System.out.println(testHash.hash("abc"));
    }
}
