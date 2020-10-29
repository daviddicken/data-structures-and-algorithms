package leftJoin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class LeftJoinTest {

    HashMap<String, String> synonymHash = new HashMap<>();
    HashMap<String, String> antonymHash = new HashMap<>();
    @Before
    public void hashMapCreate(){
        synonymHash.put("fond", "enamored");
        synonymHash.put("wrath", "angered");
        synonymHash.put("diligent", "employed");
        synonymHash.put("outfit", "garb");
        synonymHash.put("guide", "usher");

        antonymHash.put("fond", "averse");
        antonymHash.put("wrath", "delight");
        antonymHash.put("diligent", "idle");
        antonymHash.put("guide", "follow");
        antonymHash.put("flow", "jam");

    }
    @Test public void leftJoinTest(){
        LeftJoin joinTest = new LeftJoin();
        String expected = "[[diligent, employed, idle][outfit, garb, null][wrath, angered, delight][guide, usher, follow][fond, enamored, averse]]";
        HashMap<String,String> empty = new HashMap<>();

        //Test on example
        joinTest.leftJoin(synonymHash, antonymHash);
        assertEquals(expected,joinTest.toString());

        // Test that method can handle a empty second hash
        joinTest.leftJoin(synonymHash, empty);
        expected = "[[diligent, employed, null][outfit, garb, null][wrath, angered, null][guide, usher, null][fond, enamored, null]]";
        assertEquals(expected, joinTest.toString());

        // Test that a empty array is return if first hash is empty
        joinTest.leftJoin(empty, synonymHash);
        expected = "[]";
        assertEquals(expected, joinTest.toString());
    }
}
