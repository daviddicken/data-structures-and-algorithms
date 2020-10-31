package graph;

import java.util.*;

public class Graph {
    ArrayList<GraphNode> vertexes;// = new HashSet();
    //ArrayList<Edge> edges;// = new HashSet();

    //========== Constructor =======
    public Graph() { this.vertexes = new ArrayList<>(); }

    //========== Size ==============
    public int size(){return vertexes.size();}

    //========== Get Nodes =========
    public ArrayList<GraphNode> getNodes(){
        if(vertexes.isEmpty()){ return null;}
        return vertexes;
    }

    //========== Get Neighbors =====
    public LinkedHashMap getNeighbors(GraphNode home){

        LinkedHashMap neighbors  = new LinkedHashMap<>();
        ArrayList<Edge> neighborhood = home.getEdges();

        for(Edge neighbor : neighborhood) {
            neighbors.put(neighbor.getDest(), neighbor.getWeight());
        }
        return neighbors;
    }

//TODO should I overload so edge can be made w/o weight, would need to check if weight exist in methods that display or use weight
    //========== Add Edge ==========
    public void addEdge(GraphNode nodeA, GraphNode nodeB, int weight){
        Edge edge1 = new Edge(nodeA, nodeB, weight);
        nodeA.getEdges().add(edge1);

        Edge edge2 = new Edge(nodeB, nodeA, weight);
        nodeB.getEdges().add(edge2);
    }

    //========== Add Node ==========
    public GraphNode addNode(String value){
        GraphNode<String> newNode = new GraphNode<>(value);
        vertexes.add(newNode);
        return newNode;
    }

    //========== To String =========
    public String toString(){
        String returnString = "Graph:";
        for(GraphNode node : vertexes){
            String neighbors = String.format("\n%s : [", node.getValue());
            ArrayList<Edge> edges = node.getEdges();
            for(int i = 0; i < edges.size(); i++){
            //for(Edge edge : edges){
                //neighbors += edge.getDest() + " ";
                if(i > 0){ neighbors += ", ";}
                neighbors += edges.get(i).getDest() + " (" + edges.get(i).getWeight() + " mi)";
            }
            neighbors += "]"; //*
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
