package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    ArrayList<GraphNode> vertexes;// = new HashSet();
    //ArrayList<Edge> edges;// = new HashSet();

    //========== Constructor =======
    public Graph() {
        this.vertexes = new ArrayList<>();
    }

    //========== Add Edge ==========
    public void addEdge(GraphNode nodeA, GraphNode nodeB){
        Edge edge1 = new Edge(nodeA, nodeB);
        nodeA.getEdges().add(edge1);

        Edge edge2 = new Edge(nodeB, nodeA);
        nodeB.getEdges().add(edge2);
    }

    //========== Add Node ==========
    public void addNode(String value){
        GraphNode<String> newNode = new GraphNode<String>(value);
        vertexes.add(newNode);
    }

    //========== To String =========
    public String toString(){
        String returnString = "Graph :\n";
//        for(int i = 0; i < vertexes.size(); i++){
//           String neighbors = vertexes.

        for(GraphNode node : vertexes){
            String neighbors = String.format("    %s : [", node.getValue());
            ArrayList<Edge> edges = node.getEdges();
            for(Edge edge : edges){
                neighbors += edge.getDest() + " ";
            }
            neighbors += "]\n";
            returnString += neighbors;
        }

        return returnString;
    }


    //========== Getters and Setters ======


    public ArrayList<GraphNode> getVertexes() {
        return vertexes;
    }

    public void setVertexes(ArrayList<GraphNode> vertexes) {
        this.vertexes = vertexes;
    }
}
