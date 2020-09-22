package linkedList;

public class LinkedList {
    public class Node {

        public int value;
        public Node next;

//====== Node constructor ===========
        public Node(int num) {
            value = num;
            next = null;
        }
    }

    public Node head;
    public Node tail;

//======== Linked list constructor           
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

//---------------------------------------------
    public void insert(int num) {
        Node node = new Node(num);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node tempNode = this.head;
            this.head = node;
            node.next = tempNode;
        }
    }

    //-----------------------------------------
    public void insertEnd(int value) {
        Node newNode = new Node(value);

        if (this.tail == null) {
            this.tail = newNode;
            this.head = newNode;
        } else {
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
}
