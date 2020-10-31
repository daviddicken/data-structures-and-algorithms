package graph;

import org.junit.Test;

import java.util.ArrayList;

public class GraphTest {
    @Test public void graphTest() {

        Graph testGraph = new Graph();
        testGraph.addNode("Seattle"); //0
        testGraph.addNode("New York"); // 1
        testGraph.addNode("Tokyo"); // 2
        testGraph.addNode("Lake Stevens"); // 3


        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(1), 2857);
        testGraph.addEdge(testGraph.vertexes.get(2), testGraph.vertexes.get(3), 9672);
        testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(3), 36);

        System.out.println("Neighbors: " + testGraph.getNeighbors(testGraph.vertexes.get(0)));

        ArrayList<GraphNode> nodes = testGraph.getVertexes();
        ArrayList<Edge> edges = nodes.get(0).getEdges();

        String place = edges.get(0).getDest().toString();
        System.out.println("the end result: " + place);

        System.out.println("Whole graph: " + testGraph.toString());





        testGraph.toString();
    }


}
