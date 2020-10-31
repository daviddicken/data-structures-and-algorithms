package graph;

public class Edge<T> {
    private GraphNode origin;
    private GraphNode dest;
    private T weight;

    public Edge(GraphNode origin, GraphNode dest, T weight) {
        this.weight = weight;
        this.origin = origin;
        this.dest = dest;
    }

    //=========== To String ========================

    public String toString(){
        return weight.toString() + " miles";
    }

    //=========== Getters and Setters ==============

    public GraphNode getOrigin() {
        return origin;
    }

    public void setOrigin(GraphNode origin) {
        this.origin = origin;
    }

    public GraphNode getDest() {
        return dest;
    }

    public void setDest(GraphNode dest) {
        this.dest = dest;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
