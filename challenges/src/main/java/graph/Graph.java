package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    ArrayList<GraphNode> vertexes;// = new HashSet();
    //ArrayList<Edge> edges;// = new HashSet();

    //========== Constructor =======
    public Graph() {
        this.vertexes = new ArrayList<>();
    }
    //========== Get Nodes =========
    // Returns all of the nodes in the graph as a collection (set, list, or similar)
    public ArrayList<GraphNode> getNodes(){ return vertexes; }

    //========== Get Neighbors =====
//    Returns a collection of edges connected to the given node
//    Takes in a given node
//    Include the weight of the connection in the returned collection

    public HashMap getNeighbors(GraphNode home){

        // home.getValue
        HashMap neighbors  = new HashMap();
        ArrayList<Edge> neighborhood = home.getEdges();

        for(Edge neighbor : neighborhood) {
            neighbors.put(neighbor.getDest(), neighbor.getWeight());
        }
        return neighbors;
    }



    //========== Add Edge ==========
    public void addEdge(GraphNode nodeA, GraphNode nodeB, int weight){
        Edge edge1 = new Edge(nodeA, nodeB, weight);
        nodeA.getEdges().add(edge1);

        Edge edge2 = new Edge(nodeB, nodeA, weight);
        nodeB.getEdges().add(edge2);
    }

    //========== Add Node ==========
    public void addNode(String value){
        GraphNode<String> newNode = new GraphNode<>(value);
        vertexes.add(newNode);
    }

    //========== To String =========
    public String toString(){
        String returnString = "Graph :\n";
        for(GraphNode node : vertexes){
            String neighbors = String.format("    %s : [", node.getValue());
            ArrayList<Edge> edges = node.getEdges();
            for(int i = 0; i < edges.size(); i++){
            //for(Edge edge : edges){
                //neighbors += edge.getDest() + " ";
                if(i > 0){ neighbors += ", ";}
                neighbors += edges.get(i).getDest() + " (" + edges.get(i).getWeight() + " mi)";
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
