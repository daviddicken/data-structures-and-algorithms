package graph;

import datastructures.stacksAndQueues.Stack;

import java.util.ArrayList;
import java.util.HashSet;

public class DepthFirst {
    public ArrayList<GraphNode> depthFirst(GraphNode node) throws Exception {
        ArrayList<GraphNode> returnList = new ArrayList<>();
        HashSet<GraphNode> visited = new HashSet<>();
        ArrayList<Edge> edges;
        Stack<GraphNode> holding = new Stack();
        GraphNode cn;
        GraphNode destination;

        holding.push(node);

        while(!holding.isEmpty()){
            cn = holding.pop();
            returnList.add(cn);
            visited.add(cn);
            edges = cn.getEdges();

            for (int i = edges.size() - 1; i >= 0; i--) {
                destination = edges.get(i).getDest();
                if (!visited.contains(destination)) {
                    holding.push(destination);
                    visited.add(destination);
                }
            }
        }
        return returnList;
    }
}
