package stacksandqueues;

public class PseudoQueue {
    private Stack currentStack = new Stack();
    private Stack tempStack = new Stack();

    //========= Slinky ==========================
    public void slinky() throws Exception {

        Node thisNode = currentStack.top;// create node to work with
        while (thisNode != null) {       // run this code till node = null
            tempStack.push(currentStack.pop()); // push the top of currentStack to tempStack
            thisNode = thisNode.getNext(); // move to the next node
        }
        currentStack = tempStack; // change the tempStack to be the current Stack
    }

    //========= deQ =============================
    public int dequeue() throws Exception {
       
        try {
            slinky();
            return currentStack.pop(); // return the value in the top node
        }catch (Exception e){ //check if queue is empty
            throw new Exception("This queue is empty");
        }
    }

    //========= enQ =============================
    public void enqueue(int number) throws Exception {
       
        if (currentStack.top != null) {
            slinky();
        }
        currentStack.push(number);
    }

    //========= size =============================
    public int size(){
        Node thisNode = currentStack.top;
        int length = 0;

        while(thisNode != null){
            length++;
            thisNode = thisNode.getNext();
        }
        return length;
    }

    //========= toString =========================
    public String toString(){
        if(currentStack.top == null){
            return "NULL";
        }
        return toString(currentStack.top); }
    //------------ helper ----------------
    private String toString(Node currentNode){
        if (currentNode.getNext() == null) {
            return String.format("{%d} -> NULL", currentNode.getValue());
        }
        return String.format("{%d} -> ", currentNode.getValue()) + toString(currentNode.getNext());
    }

}
