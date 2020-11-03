package breadthfirst;

import datastructures.stacksAndQueues.Queue;
import graph.Edge;
import graph.GraphNode;

import java.util.ArrayList;

public class BreadthFirst {
    public ArrayList<GraphNode> breadthFirst(GraphNode node) throws Exception {
        ArrayList<GraphNode> returnSet = new ArrayList<>();
        Queue<GraphNode> q = new Queue();
        q.enqueue(node);
        returnSet.add(node);


        while(!q.isEmpty()){
            GraphNode cn = q.dequeue();

            if(!cn.getEdges().isEmpty()){
                ArrayList<Edge> neighborhood = cn.getEdges();

                for(int i = 0; i < neighborhood.size(); i++) {

                    GraphNode nextNode = neighborhood.get(i).getDest();

                    if (!returnSet.contains(nextNode)) {
                        q.enqueue(nextNode);
                        returnSet.add(nextNode);
                    }
                }
            }
        }
        // display to screen
        int i = 0;
        for(GraphNode display : returnSet) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(display.getValue());
            i = 1;
        }
        System.out.println(".");
        return returnSet;
    }
}

