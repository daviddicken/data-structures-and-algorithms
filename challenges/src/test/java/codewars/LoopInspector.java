package codewars;

import datastructures.linkedList.LinkedList;

import java.util.HashMap;

public class LoopInspector {
    public int loopSize(LinkedList.Node node) {
        HashMap<LinkedList.Node, Integer> map = new HashMap();

        int counter = 0;

        while(node != null){
            if(map.containsKey(node)){
                return counter - map.get(node);
            }
            map.put(node, counter);
            counter++;
            node = node.next;
        }
        return 0;
    }
}
