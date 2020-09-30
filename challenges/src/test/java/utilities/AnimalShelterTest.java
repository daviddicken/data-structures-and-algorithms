package utilities;


import org.junit.Test;

public class AnimalShelterTest {
    @Test
            public void shelterTest() {
        //===== test generic node ========
        //Gnode<String> testNode = new Gnode("test");

        //System.out.println("generic :" + testNode.getValue());
        Gqueue testQ = new Gqueue();
        testQ.enqueue("dog");
        testQ.enqueue("dog");
        testQ.enqueue("cat");
        testQ.enqueue("dog");
        testQ.enqueue("dog");

        System.out.println(testQ.toString());
        System.out.println(testQ.dequeue("cat"));
        System.out.println(testQ.toString());
        System.out.println(testQ.dequeue("cat"));
        System.out.println(testQ.dequeue("pig"));


    }

}
