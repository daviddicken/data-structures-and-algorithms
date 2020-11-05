package datastructures.stacksAndQueues;

public class PseudoQueue<T> {
    private Stack enQueueStack = new Stack();
    private Stack deQueueStack = new Stack();

    //========= deQ =============================
    public T dequeue() throws Exception {
        if(deQueueStack.isEmpty() && !enQueueStack.isEmpty()){
            Node thisNode = enQueueStack.top;// create node to work with
            while (thisNode != null) {       // run this code till node = null
                deQueueStack.push(enQueueStack.pop()); // push the top of currentStack to tempStack
                thisNode = thisNode.getNext(); // move to the next node
            }
        }
        return (T) deQueueStack.pop();
    }

    //========= enQ =============================
    public void enqueue(int number) throws Exception {

        if(enQueueStack.isEmpty() && !deQueueStack.isEmpty()){
            Node thisNode = deQueueStack.top;// create node to work with
            while (thisNode != null) {       // run this code till node = null
                enQueueStack.push(deQueueStack.pop()); // push the top of currentStack to tempStack
                thisNode = thisNode.getNext(); // move to the next node
            }
        }
        enQueueStack.push(number);
    }

    //========= size =============================
    public int size(){
        int length;

        if(deQueueStack.isEmpty()) {
            length =stepThrough(enQueueStack.top);
        }else{
            length = stepThrough(deQueueStack.top);
        }
        return length;
    }

    //========= step through ====================
    public int stepThrough(Node thisNode){
        int length = 0;
        while (thisNode != null) {
            length++;
            thisNode = thisNode.getNext();
        }
        return length;
    }

    //========= toString =========================
    public String toString(){
        if(enQueueStack.top == null && deQueueStack.top == null){
            return "NULL";
        }
        if(enQueueStack.isEmpty()){
            return toString(deQueueStack.top);
        }else {
            return toString(enQueueStack.top);
        }
    }
    //------------ helper ----------------
    private String toString(Node currentNode){

        if (currentNode.getNext() == null) {
            return String.format("{%d} -> NULL", currentNode.getValue());
        }
        return String.format("{%d} -> ", currentNode.getValue()) + toString(currentNode.getNext());
    }

}
