package utilities;

public class Q<T> {

    Gnode<T> front;
    Gnode<T> back;

    //===== Constructor =======
    public Q(){
        this.front = null;
        this.back = null;
    }

    //======== isEmpty ====================
    public boolean isEmpty(){
        if (front == null){return true;}
        return false;
    }
    //======== size =======================
    public int size(){
        Gnode<T> thisNode = front;
        int length = 0;

        while (thisNode != null){
            length++;
            thisNode = thisNode.getBehind();
        }
        return length;
    }

    //======== peek =======================
    public T peek(){
        return front.getValue();
    }

    //======== deQ search value ===========
    public T dequeue(T value){

        if (front == null) {  //check if list is empty
            return null;
        }
        Gnode<T> thisNode = front; //get front node
        while (thisNode != null) {
            if (thisNode.getValue() == value) { //check for match
                // Make sure this isn't the only node in queue
                if(thisNode.getBehind() == null && thisNode.getInFront() == null){
                    T returnValue = thisNode.getValue(); //grab value and reset node
                    front = null;
                    back = null;
                    return returnValue;
                }
                if(thisNode.getBehind() == null){   // check if match was found at the end of the list
                    thisNode.getInFront().setBehind(null); //change node in fronts rear pointer to null

                    back = thisNode.getInFront(); // make node in front of this node new back
                    return thisNode.getValue();

                }else if(thisNode.getInFront() == null){ // check if match was found at front of list

                    thisNode.getBehind().setInFront(null); // change node behind this node front pointer to null

                    front = thisNode.getBehind(); // make node behind this node new front
                    return thisNode.getValue();

                }else { // Take this node out of the queue
                    // get node in front set its behind pointer to the node behind this node
                    thisNode.getInFront().setBehind(thisNode.getBehind());
                    // get node behind this node and set its front pointer to node in front of this node
                    thisNode.getBehind().setInFront(thisNode.getInFront());
                    return thisNode.getValue();
                }
            }
            thisNode = thisNode.getBehind(); // if match wasn't found get the next node
        }
        return null; // no matches found
    }

    //======== deQ front ==================
    public T dequeueFromFront(){
        if(front == null){
            return null;
        }
        if(front.getBehind() == null){
            T returnValue = front.getValue();
            front = null;
            back = null;
            return returnValue;

        }

        T returnValue = front.getValue(); // store value of front node
        front.getBehind().setInFront(null);   // get the node behind front and set its last pointer to null
        front = front.getBehind();  // make node behind front node the new front node

        return returnValue;
    }

    //======== enQ to front ==================
    public void enqueueToFront(T type){
        Gnode<T> newNode = new Gnode<>(type);
        if(back == null) {
            back = newNode;
        }else{
            newNode.setBehind(front);
            front.setInFront(newNode);
        }
        front = newNode;
    }
    //======== enQ to back ===================
    public void enqueueToBack(T type){

        Gnode<T> newNode = new Gnode<>(type);

        if(front == null){
            front = newNode;
        }else{
            newNode.setInFront(back);
            back.setBehind(newNode);
        }
        back = newNode;
    }

    //======== Getters & Setters =========
    public Gnode<T> getFront() {
        return front;
    }

    public void setFront(Gnode<T> front) {
        this.front = front;
    }

    public Gnode<T> getBack() {
        return back;
    }

    public void setBack(Gnode<T> back) {
        this.back = back;
    }

    //========= toString ==============
    public String toString(){
        if(front == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(Gnode currentNode){

        if (currentNode.getBehind() == null) {
            return currentNode.getValue() + " <-> BACK";
        }
        return currentNode.getValue() + " <-> " + toString(currentNode.getBehind());
    }
}
