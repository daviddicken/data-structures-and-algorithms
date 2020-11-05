package graph;

import org.junit.Test;
import static org.junit.Assert.*;


public class DepthFirstTest {
    @Test
    public void depthTest() throws Exception {
        Graph testGraph = new Graph();
        DepthFirst depth = new DepthFirst();

        testGraph.addNode("A"); // 0
        testGraph.addNode("B"); // 1
        testGraph.addNode("C"); // 2
        testGraph.addNode("D"); // 3
        testGraph.addNode("E"); // 4
        testGraph.addNode("F"); // 5
        testGraph.addNode("G"); // 6
        testGraph.addNode("H"); // 7

        //test node w/o any edges----------------------------------------------------------
        assertEquals("[A]", depth.depthFirst(testGraph.vertexes.get(0)).toString());

        // A <-> B
        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(1), 0);

        // Test graph with one edge-----------------------------------------------------------
        assertEquals("[A, B]", depth.depthFirst(testGraph.vertexes.get(0)).toString());

        // A <-> D
        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(3), 0);
        // B <-> D
        testGraph.addEdge(testGraph.vertexes.get(1), testGraph.vertexes.get(3), 0);
        // B <-> C
        testGraph.addEdge(testGraph.vertexes.get(1), testGraph.vertexes.get(2), 0);
        // C <-> G
        testGraph.addEdge(testGraph.vertexes.get(2), testGraph.vertexes.get(6), 0);
        // D <-> E
        testGraph.addEdge(testGraph.vertexes.get(3), testGraph.vertexes.get(4), 0);
        // D <-> H
        testGraph.addEdge(testGraph.vertexes.get(3), testGraph.vertexes.get(7), 0);
        // D <-> F
        testGraph.addEdge(testGraph.vertexes.get(3), testGraph.vertexes.get(5), 0);
        // F <-> H
        testGraph.addEdge(testGraph.vertexes.get(5), testGraph.vertexes.get(7), 0);


        //test example graph------------------------------------------------------------------------------------
        assertEquals("[A, B, C, G, D, E, H, F]", depth.depthFirst(testGraph.vertexes.get(0)).toString());
    }
}
