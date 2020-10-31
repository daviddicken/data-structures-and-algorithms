package graph;

public class Edge {
    private GraphNode origin;
    private GraphNode dest;

    public Edge(GraphNode origin, GraphNode dest) {
        this.origin = origin;
        this.dest = dest;
    }

    //=========== To String ========================

//    @Override
//    public String toString() {
//        return "Edge{" +
//                "origin=" + origin +
//                ", dest=" + dest +
//                '}';
//    }


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

}
