package linkedList;

public class LinkedList
{
    public class Node {
        public int value;
        public Node next;

        public Node(int num) {
            this.value = num;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int num) {
        Node node = new Node(num);

        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            Node tempNode = this.head;
            this.head = node;
            node.next = tempNode;
        }
    }

//----------------------------------
    public String toString()
    {
        // Got great guidance from Jack Nelson on a better way to create the toString method
        if(this.head == null) {
            return "NULL";
        }

        Node currentNode = this.head;
        String returnString = String.format("{%d} -> ", currentNode.value);
        currentNode = currentNode.next;

        while(currentNode != null) {
            returnString += String.format("{%d} ->", currentNode.value);
            currentNode = currentNode.next;
        }
        returnString += " NULL";

        return returnString;
    }

//-------------------------------------------
    public boolean listSearch(int searchValue)
    {
        Node currentNode = this.head;

        while(currentNode != null) {
           if(searchValue == currentNode.value) {
               return true;
           }
           currentNode = currentNode.next;
        }
        return false;
    }

}
