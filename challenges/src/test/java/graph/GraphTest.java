package graph;

import org.junit.Test;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class GraphTest {
    @Test public void graphTest() {

        Graph testGraph = new Graph();

        // An empty graph properly returns null
        assertEquals(null, testGraph.getNodes());


        // Test that node can be added to graph
        // A graph with only one node and edge can be properly returned
        testGraph.addNode("Seattle");

        assertEquals(1, testGraph.size());
        assertEquals("Seattle", testGraph.getVertexes().get(0).getValue());
        assertEquals("Graph:\nSeattle : []", testGraph.toString());

        testGraph.addNode("New York"); // 1

        assertEquals(2, testGraph.size());
        assertEquals("New York", testGraph.getVertexes().get(1).getValue());


        //test that edge can be added--------------------------------
        assertEquals("Graph:\nSeattle : []\nNew York : []", testGraph.toString());
        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(1), 2857);

        assertEquals("Graph:\nSeattle : [New York (2857 mi)]\nNew York : [Seattle (2857 mi)]", testGraph.toString());

        testGraph.addNode("Tokyo"); // 2
        testGraph.addNode("Lake Stevens"); // 3
        testGraph.addEdge(testGraph.vertexes.get(2), testGraph.vertexes.get(3), 9672);
        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(3), 36);

        assertEquals("Graph:\n" +
                "Seattle : [New York (2857 mi), Lake Stevens (36 mi)]\n" +
                "New York : [Seattle (2857 mi)]\n" +
                "Tokyo : [Lake Stevens (9672 mi)]\n" +
                "Lake Stevens : [Tokyo (9672 mi), Seattle (36 mi)]", testGraph.toString());


        //A collection of all nodes can be properly retrieved from the graph
        ArrayList<GraphNode> allNodes = testGraph.getNodes();
        assertEquals(4, allNodes.size());
        assertEquals("New York", allNodes.get(1).getValue());
        assertEquals("Lake Stevens", allNodes.get(3).getValue());
        assertEquals("Seattle", allNodes.get(0).getValue());

        // All appropriate neighbors can be retrieved from the graph
        // Neighbors are returned with the weight between nodes included
        assertEquals("{New York=2857, Lake Stevens=36}", testGraph.getNeighbors(testGraph.getVertexes().get(0)).toString());
        assertEquals("{Tokyo=9672, Seattle=36}", testGraph.getNeighbors(testGraph.getVertexes().get(3)).toString());
        System.out.println(testGraph.toString());
    }


}
