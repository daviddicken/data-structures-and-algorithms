package graph;


//takes in an array of strings
// get vertex of nodes from graph
// search vertex node.values for match to array[0]

// if found get edges
// check if array[1] equals an edge.dest in edges
// if not return false $0
// if it is return true and dest $ weight

import java.util.ArrayList;

public class GetEdge {
    public String getEdge(String [] cities, Graph map){
        int counter = 0;
        int weightTotal = 0;
        Boolean flag = true;

        while (counter < cities.length - 1 && flag == true) {
            flag = false;
            for (GraphNode node : map.getVertexes()) {      //get all nodes in graph

                if (node.getValue() == cities[counter]) {          //find first city
                    ArrayList<Edge> flights = node.getEdges();     // get edges for city

                    for (Edge flight : flights) {

                        if (flight.getDest().getValue() == cities[counter + 1]) {       // find dest
                            flag = true;
                            weightTotal += (int)flight.getWeight();
                            break;
                        }else {
                            flag = false;
                        }
                    }
                }
            }
            counter++;
        }
        if(flag == true){
            return String.format("True, $%d", weightTotal);
        }
        return "False, $0";
    }
}

//===================== Zombie Code =========================
// TODO: figure out how to get ternary working

//  flag == true ? return String.format("True, $%d", weightTotal) : return "False, $0";

