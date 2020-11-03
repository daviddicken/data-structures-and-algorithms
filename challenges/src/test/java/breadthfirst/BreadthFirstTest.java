package breadthfirst;

import graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    @Test
    public void breadthTest() throws Exception {
        BreadthFirst test = new BreadthFirst();
        Graph testGraph = new Graph();

        testGraph.addNode("Pandora"); // 0
        testGraph.addNode("Arendelle"); // 1

        // test if nodes are not connected
        assertEquals("[Pandora]", test.breadthFirst(testGraph.getVertexes().get(0)).toString());

        //Pandora <-> Arendelle
        testGraph.addEdge(testGraph.getVertexes().get(0), testGraph.getVertexes().get(1), 0);

        // test one edge graph-----------------------------------
        assertEquals("[Pandora, Arendelle]", test.breadthFirst(testGraph.getVertexes().get(0)).toString());


        testGraph.addNode("Metroville"); // 2
        testGraph.addNode("Monstropolis"); // 3
        testGraph.addNode("Narnia"); // 4
        testGraph.addNode("Naboo"); // 5

        // Arendelle <-> Metroville
        testGraph.addEdge(testGraph.getVertexes().get(1), testGraph.getVertexes().get(2), 0);
        // Arendelle <-> Monstropolis
        testGraph.addEdge(testGraph.getVertexes().get(1), testGraph.getVertexes().get(3), 0);
        // Monstropolis <-> Metroville
        testGraph.addEdge(testGraph.getVertexes().get(3), testGraph.getVertexes().get(2), 0);
        // Monstropolis <-> Naboo
        testGraph.addEdge(testGraph.getVertexes().get(3), testGraph.getVertexes().get(5), 0);
        // Metroville <-> Narnia
        testGraph.addEdge(testGraph.getVertexes().get(2), testGraph.getVertexes().get(4), 0);
        // Metroville <-> Naboo
        testGraph.addEdge(testGraph.getVertexes().get(2), testGraph.getVertexes().get(5), 0);
        // Narnia <-> Naboo
        testGraph.addEdge(testGraph.getVertexes().get(4), testGraph.getVertexes().get(5), 0);


        // Test on full example graph---------------------------------
        String expected ="[Pandora, Arendelle, Metroville, Monstropolis, Narnia, Naboo]";
        assertEquals(expected, test.breadthFirst(testGraph.getVertexes().get(0)).toString());

        // Test from different starting node
        expected = "[Monstropolis, Arendelle, Metroville, Naboo, Pandora, Narnia]";
        assertEquals(expected, test.breadthFirst(testGraph.getVertexes().get(3)).toString());
    }
}

