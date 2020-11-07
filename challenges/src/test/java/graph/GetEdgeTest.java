package graph;

import org.junit.Test;
import static org.junit.Assert.*;
//TODO: Merge this test to breadth first test

public class GetEdgeTest {
    @Test
    public void edgeTest(){
        Graph testGraph = new Graph();
        GetEdge getEdge = new GetEdge();

        testGraph.addNode("Pandora"); // 0
        testGraph.addNode("Arendelle"); // 1
        testGraph.addNode("Metroville"); // 2
        testGraph.addNode("Monstropolis"); // 3
        testGraph.addNode("Narnia"); // 4
        testGraph.addNode("Naboo"); // 5

        //Pandora <-> Arendelle
        connect(testGraph,0,1,150);
        //Pandora <-> Metroville
        connect(testGraph,0,2,82);
        // Arendelle <-> Metroville
        connect(testGraph,1,2,99);
        // Arendelle <-> Monstropolis
        connect(testGraph,1,3,42);
        // Monstropolis <-> Metroville
        connect(testGraph,3,2,105);
        // Monstropolis <-> Naboo
        connect(testGraph,3,5,73);
        // Metroville <-> Narnia
        connect(testGraph,2,4,37);
        // Metroville <-> Naboo
        connect(testGraph,2,5,26);
        // Narnia <-> Naboo
        connect(testGraph,4,5,250);

        String [] trip = {"Pandora", "Metroville"};
        String [] trip3 = {"Pandora", "Naboo"};

        String [] trip2 = {"Arendelle", "Monstropolis", "Naboo"};
        String [] trip4 = {"Seattle", "Everett", "Tacoma"};
        String [] trip5 = {"Pandora", "Arendelle", "Narnia"};


        //test simple success
        assertEquals("True, $82", getEdge.getEdge(trip, testGraph));

        //test simple fail
        assertEquals("False, $0", getEdge.getEdge(trip3, testGraph));

        // pass with multiple stops
        assertEquals("True, $115", getEdge.getEdge(trip2, testGraph));

        // fail multiple stop, first connection good second bad
        assertEquals("False, $0", getEdge.getEdge(trip5, testGraph));

        // test if cities don't exist in graph
        assertEquals("False, $0", getEdge.getEdge(trip4, testGraph));

        System.out.println(getEdge.getEdge(trip5, testGraph));
        //System.out.println(getEdge.getEdge(trip, testGraph));


    }

    public void connect(Graph graph, int origin, int dest, int weight){
        graph.addEdge(graph.getVertexes().get(origin), graph.getVertexes().get(dest), weight);

    }
}

