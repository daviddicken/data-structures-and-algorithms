package leetCode;
import datastructures.linkedList.LinkedList.Node;

public class SwapNodes {
//https://stackoverflow.com/questions/56588854/how-do-i-use-recursion-to-swap-nodes-in-pairs-in-a-linked-list/59043630#59043630?newreg=c6fff87d54e046a3a6dda685d8dc976d
    public Node swapPairs(Node head) {
        if(head == null || head.next == null) return head;
        Node cn = head.next;
        head.next = swapPairs(head.next.next);
        cn.next = head;
        return cn;
    }
}
