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
        assertEquals("We are all out of pets.", empty.dequeue("cat"));

        //test enqueue
        testQ.enqueue("cat");
        assertEquals("cat <-> BACK", testQ.toString());

        testQ.enqueue("dog");
        assertEquals("cat <-> dog <-> BACK", testQ.toString());

        testQ.enqueue("dog");
        testQ.enqueue("cat");
        testQ.enqueue("cat");
        assertEquals("cat <-> dog <-> dog <-> cat <-> cat <-> BACK", testQ.toString());

        //When I dequeue a dog it will skip the cat and remove and return a dog
        assertEquals("dog", testQ.dequeue("dog"));
        assertEquals("cat <-> dog <-> cat <-> cat <-> BACK", testQ.toString());

        //Now when I dequeue a cat it will return the cat at the front of the list
        // leaving the two cats at the end of the line behind the dogs
        assertEquals("cat",testQ.dequeue("cat"));
        assertEquals("dog <-> cat <-> cat <-> BACK", testQ.toString());

        //If no pet type is enter when dequeue is called the program will return
        //the animal the has been at the shelter the longest which will be the dog
        assertEquals("dog",testQ.dequeue());

        //Next we will ask for a dog when know dog is present
        assertEquals("Sorry we are all out of dog's", testQ.dequeue("dog"));

        //We will ask for a pig now and should get null back
        assertEquals(null, testQ.dequeue("pig"));

        // Now we will get the las two cats and then ask for a 3rd
        testQ.dequeue("cat");
        testQ.dequeue("cat");
        assertEquals("We are all out of pets.", testQ.dequeue("cat"));

    }

}
