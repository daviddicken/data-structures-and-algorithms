package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
            public void shelterTest() {
        //===== test generic node ========
        //Gnode<String> testNode = new Gnode("test");

        //System.out.println("generic :" + testNode.getValue());

        Gqueue testQ = new Gqueue();
        Gqueue empty = new Gqueue();
        //test empty "out of animals"
        //assertEquals("We are all out of pets.", empty.dequeue("cat"));
        testQ.enqueue("dog");
        testQ.enqueue("dog");
        testQ.enqueue("cat");
        testQ.enqueue("dog");
        System.out.println(testQ);
        System.out.println(testQ.dequeue("dog"));
        //System.out.println(testQ);
        //testQ.dequeue("cat");
       // System.out.println("want dag/cat/cat/dog = =" + testQ.toString());




//        System.out.println(testQ.toString());
//        System.out.println(testQ.dequeue("cat"));
//        System.out.println(testQ.toString());
//        System.out.println(testQ.dequeue("cat"));
//        System.out.println(testQ.dequeue("pig"));


    }

}
