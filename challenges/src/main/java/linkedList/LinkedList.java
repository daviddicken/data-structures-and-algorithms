package linkedList;

public class LinkedList {

    public Node head;
    public Node tail;

    public class Node {

        public int value;
        public Node next;
        public Node last;

//====== Node constructor ===========
        public Node(int num) {
            value = num;
            next = null;
            last = null;
        }
    }

//======== Linked list constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

//---------------------------------------------
    public int size(){
        Node currentNode = this.head;
        int length = 0;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;

    }
    public void insert(int num) {
        Node node = new Node(num);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node tempNode = head;
            head = node;
            node.next = tempNode;
            tempNode.last = node;

        }
    }

    //-----------------------------------------
    public void insertEnd(int value) {
        Node newNode = new Node(value);

        if (this.tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.last = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //----------------------------------
    public String toString() {
        // Got great guidance from Jack Nelson on a better way to create the toString method
        if (this.head == null) {
            return "NULL";
        }

        Node currentNode = this.head;
        String returnString = String.format("{%d} -> ", currentNode.value);
        currentNode = currentNode.next;

        while (currentNode != null) {
            returnString += String.format("{%d} -> ", currentNode.value);
            currentNode = currentNode.next;
        }
        returnString += " NULL";

        return returnString;
    }

    //-------------------------------------------
    public boolean listSearch(int searchValue) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (searchValue == currentNode.value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

//============= Search from back with doubly linked list =============

    public int fromTail(int placesFromBack) throws Exception {
        Node currentNode = this.tail;
        if(placesFromBack == 0) {
            return tail.value;
        } else if(placesFromBack == size()){
            return head.value;
        }
        if(placesFromBack > size()){
            throw new Exception("The linked list is to short for a search like that!");
        }

        for(int i = 1; i <= placesFromBack; i++){
            currentNode = currentNode.last;
        }
        return currentNode.value;
    }

 //=============== Search from back with singly linked list ===========
    public int findFromEnd(int placesFromEnd) throws Exception {
        Node currentNode = this.head;
        if(placesFromEnd == 0)
        {
            return tail.value;
        }
        if(placesFromEnd > size())
        {
            System.out.println("Your link list is shorter then your search value");
            throw new Exception("Your link list is shorter then your search value");
        }

        int fromFront = size() - placesFromEnd;
        int counter = 1;
        while (counter < fromFront) {
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode.value;

    }

    //--------------------------------------
    public int findMiddleNode() throws Exception {
        Node currentNode = this.tail;
        if(head == null){
            throw new Exception("List is empty");
        }
        int middle = size() / 2;

        for (int i = 0; i < middle; i++) {
            currentNode = currentNode.last;
        }
        return currentNode.value;

    }

    //---------------------------------------
    public void insertBefore(int searchValue, int newValue) {
        Node newNode = new Node(newValue);
        Node lastNode = head;
        Node currentNode = head;

        if(head != null) {
            while (currentNode.next != null) {
                if (searchValue == currentNode.value) {
                    lastNode.next = newNode;
                    newNode.next = currentNode;
                    return;

                } else {
                    lastNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
            System.out.println("Search value was not found");
        }else {
            System.out.println("List is empty");
        }
    }

    //--------------------------------------------------
    public void insertAfter(int searchValue, int newValue) {
        Node newNode = new Node(newValue);
        Node nextNode = head.next;
        Node currentNode = head;

        if(head != null) {
            while (currentNode.next != null) {
                if (searchValue == currentNode.value) {
                    currentNode.next = newNode;
                    newNode.next = nextNode;
                    return;
                } else {
                    currentNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
            System.out.println("Search value was not found");
        }else {
            System.out.println("List is empty");
        }
    }

    public static LinkedList zipLists(LinkedList one, LinkedList two){
        Node currentNode = one.head;
        Node tempA = one.head;
        Node tempB = two.head;

        if(tempA == null){
            return two;
        }else if(tempB == null){
            return one;
        }

        while((tempA != null) && (tempB != null)){
            System.out.println("from the while");
//            tempA = tempA.next;
//            currentNode.next = tempB;
//            currentNode.next.next = tempA;
//            currentNode = currentNode.next.next;
//
//            tempB = tempB.next;
            tempA = currentNode.next;
            currentNode.next = tempB;
            currentNode = currentNode.next;

            tempB = currentNode.next;
            currentNode.next = tempA;
            currentNode = currentNode.next;
        }
        System.out.println("out of the while");
       // System.out.println("tempA " + tempA.value );
       // System.out.println("tempB " + tempB.value);
        if((tempA == null) && (tempB != null)) {
            currentNode.next = tempB.next;
            System.out.println(".next in if " + currentNode.next);
        }else if(tempB == null && tempA != null) {
            currentNode.next = tempA.next;
            System.out.println(".next in else " + currentNode.next);
        }



        return one;
    }
}
