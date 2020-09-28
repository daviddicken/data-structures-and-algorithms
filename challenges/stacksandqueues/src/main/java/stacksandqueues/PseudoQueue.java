package stacksandqueues;

public class PseudoQueue {
    private Stack currentStack = new Stack();
    private Stack tempStack = new Stack();

    //========= deQ =============================
    public int dequeue() throws Exception {
        try {
            if (currentStack.top != null) {      //check that stack is not empty
                Node thisNode = currentStack.top;// create node to work with
                while (thisNode != null) {       // run this code till node = null
                    tempStack.push(currentStack.pop()); // push the top of currentStack to tempStack
                    thisNode = thisNode.getNext(); // move to the next node
                }
                currentStack = tempStack;
            }
            return currentStack.pop();

        }catch (Exception e){
            throw new Exception("This queue is empty");
        }
    }
    //========= enQ =============================
    public void enqueue(int number) throws Exception {
        if (currentStack.top != null) {
            Node thisNode = currentStack.top;
            while (thisNode != null) {
                tempStack.push(currentStack.pop());
                thisNode = thisNode.getNext();
            }
            currentStack = tempStack;
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

    //========= Getters & Setters ================
//    public Stack getCurrentStack() {
//        return currentStack;
//    }
//
//
//    public void setCurrentStack(Stack currentStack) {
//        this.currentStack = currentStack;
//    }
//
//    public Stack getTempStack() {
//        return tempStack;
//    }
//
//    public void setTempStack(Stack tempStack) {
//        this.tempStack = tempStack;
//    }
}
