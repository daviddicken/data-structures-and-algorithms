package graph;

import java.util.ArrayList;
import java.util.HashSet;

public class GraphNode<T> {
    private T value;
    private ArrayList<Edge> edges = new ArrayList<>();
//    private HashSet<Edge> hashEdges = new HashSet<>();

    public GraphNode(T value) {
        this.value = value;
        this.edges = edges;
//        this.hashEdges = hashEdges;
    }

    //============= To String =============================
    public String toString(){

        return value.toString();
    }

    //============= Getters and Setters ===================
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

}
