package utilities;

public class AnimalShelter {
    Gnode<String> front;
    Gnode<String> back;

    //===== Constructor =======
    public AnimalShelter(){
        this.front = null;
        this.back = null;
    }

    //======== enQ ===================
    public void enqueue(String type){

        Gnode<String> newNode = new Gnode<>(type);

        if(front == null){
            front = newNode;
        }else{
            newNode.setInFront(back);
            back.setBehind(newNode);
        }
        back = newNode;
    }
    //======== deQ (get the animal that has been here longest) =====
    public String dequeue(){
        if(front == null){
            return "Sorry we are all out of dogs and cats";
        }

        String returnAnimal = front.getValue(); // store value of front node
        front.getBehind().setInFront(null);   // get the node behind front and set its last pointer to null
        front = front.getBehind();  // make node behind front node the new front node

        return returnAnimal;
    }

    //======== deQ (animal getter) ====
    public String dequeue(String type){

        if(type == "cat" || type == "dog") {
            if (front == null) {  //check if list is empty
                return "We are all out of pets.";
            }
            Gnode<String> thisNode = front; //get front node
            while (thisNode != null) {
                if (thisNode.getValue() == type) { //check for match
                    // Make sure this isn't the only node in queue
                    if(thisNode.getBehind() == null && thisNode.getInFront() == null){
                        String returnValue = thisNode.getValue(); //grab value and reset node
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
            return String.format("Sorry we are all out of %s's", type); // no matches found message
        }else {
            return null; // return null if dog or cat was not entered
        }

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
